package ca.alphaworld.alphaworld2.data.entity;

import ca.alphaworld.alphaworld2.client.screen.CrucibleScreenHandler;
import ca.alphaworld.alphaworld2.data.ImplementedInventory;
import ca.alphaworld.alphaworld2.registries.AlphaWorld2BlockEntities;
import ca.alphaworld.alphaworld2.registries.AlphaWorld2Items;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.RenderUtils;

public class CrucibleBlockEntity extends BlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory, GeoBlockEntity {
    private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);

    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(3, ItemStack.EMPTY);

    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 72;
    /*private int fuelTime = 0;
    private int maxFuelTime = 0;*/

    public CrucibleBlockEntity(BlockPos pos, BlockState state) {
        super(AlphaWorld2BlockEntities.CRUCIBLE, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            public int get(int index) {
                switch (index){
                    case 0: return CrucibleBlockEntity.this.progress;
                    case 1: return CrucibleBlockEntity.this.maxProgress;
                    /*case 2: return CrucibleBlockEntity.this.fuelTime;
                    case 3: return CrucibleBlockEntity.this.maxFuelTime;*/
                    default: return 0;
                }
            }

            public void set(int index, int value) {
                switch (index){
                    case 0: CrucibleBlockEntity.this.progress = value;
                    break;
                    case 1: CrucibleBlockEntity.this.maxProgress = value;
                    break;
                    /*case 2: CrucibleBlockEntity.this.fuelTime = value;
                    break;
                    case 3: CrucibleBlockEntity.this.maxFuelTime = value;
                    break;*/
                }
            }

            public int size() {
                return 2;
            }
        };
    }

    @Override
    public double getTick(Object blockEntity) {
        return RenderUtils.getCurrentTick();
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<>(this, "controller", 0, this::predicate));
    }

    private <T extends GeoAnimatable> PlayState predicate(AnimationState<T> tAnimationState) {
        tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.crucible.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable("gui.text.alphaworld2.crucible");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new CrucibleScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(this.pos);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("crucible.progress", progress);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, inventory);
        progress = nbt.getInt("crucible.progress");
    }

    private void resetProgress() {
        this.progress = 0;
    }

    public static void tick(World world, BlockPos blockPos, BlockState state, CrucibleBlockEntity entity) {
        if(world.isClient()){
            return;
        }
        if(hasRecipe(entity)){
            entity.progress++;
            markDirty(world, blockPos, state);
            if(entity.progress >= entity.maxProgress){
                craftItem(entity);
            }
        }
        else{
            entity.resetProgress();
            markDirty(world, blockPos, state);
        }
    }

    private static void craftItem(CrucibleBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++){
            inventory.setStack(i, entity.getStack(i));
        }

        if(hasRecipe(entity)){
            entity.removeStack(1, 1);

            entity.setStack(2, new ItemStack(Items.IRON_INGOT, entity.getStack(2).getCount() + 1));
        }
    }

    private static boolean hasRecipe(CrucibleBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++){
            inventory.setStack(i, entity.getStack(i));
        }

        boolean hasRawMetalInFirstSlot = entity.getStack(1).getItem() == Items.RAW_IRON;

        return hasRawMetalInFirstSlot && canInsertAmountIntoOutputSlot(inventory) && canInsertItemIntoOutputSlot(inventory, Items.IRON_INGOT);

    }

    private static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, Item output) {
        return inventory.getStack(2).getItem() == output || inventory.getStack(2).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory) {
        return inventory.getStack(2).getMaxCount() > inventory.getStack(2).getCount();
    }
}
