package ca.alphaworld.mixin.client;

import ca.alphaworld.screens.races.RacesScreen;
import org.spongepowered.asm.mixin.injection.Inject;


public abstract class onWorldJoinMixin {

    //@Inject(method = "onSuccess(Lnet/minecraft/client/network/ClientLoginNetworkHandler;)V", at = @At("TAIL"))
    private void checkSendChoiceScreen(){
        //RacesScreen.init();
    }
}
