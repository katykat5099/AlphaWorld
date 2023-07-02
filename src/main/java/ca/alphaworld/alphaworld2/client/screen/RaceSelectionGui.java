package ca.alphaworld.alphaworld2.client.screen;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.WSprite;
import io.github.cottonmc.cotton.gui.widget.data.HorizontalAlignment;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class RaceSelectionGui extends LightweightGuiDescription {

    boolean selectedARace = false;

    /*  1 = Piglin
    *   2 = Enderman
    *   3 = Avian
    *   4 = Human      */
    int raceSelected = 0;

    //Race Emblems/Banner Flags (Assets)
    WSprite piglinFlag = new WSprite(new Identifier("minecraft:textures/item/redstone.png"));
    WSprite endermanFlag = new WSprite(new Identifier("minecraft:textures/item/redstone.png"));
    WSprite halfAvianFlag = new WSprite(new Identifier("minecraft:textures/item/redstone.png"));
    WSprite humanFlag = new WSprite(new Identifier("minecraft:textures/item/redstone.png"));

    //Gui Assets
    WLabel raceTitle = new WLabel(Text.translatable("gui.text.alphaworld2.race_selection_title")/*, 0xFFFFFF*/);
    WLabel raceDesc = new WLabel(Text.translatable("gui.text.alphaworld2.race_selection_desc"));
    WButton halfPiglinButton = new WButton(Text.translatable("gui.button.alphaworld2.half_piglin_button"));
    WLabel halfPiglinChosenText = new WLabel(Text.translatable("gui.text.alphaworld2.half_piglin_chosen"));
    WLabel halfPiglinBenefits = new WLabel(Text.translatable("gui.text.alphaworld2.half_piglin_benefits"));
    WLabel halfPiglinBenefitsText1 = new WLabel(Text.translatable("gui.text.alphaworld2.half_piglin_benefits_text_1"));
    WLabel halfPiglinBenefitsText2 = new WLabel(Text.translatable("gui.text.alphaworld2.half_piglin_benefits_text_2"));
    WLabel halfPiglinDrawbacks = new WLabel(Text.translatable("gui.text.alphaworld2.half_piglin_drawbacks"));
    WLabel halfPiglinDrawbacksText1 = new WLabel(Text.translatable("gui.text.alphaworld2.half_piglin_drawbacks_text_1"));
    WLabel halfPiglinDrawbacksText2 = new WLabel(Text.translatable("gui.text.alphaworld2.half_piglin_drawbacks_text_2"));
    WButton halfPiglinChoose = new WButton(Text.translatable("gui.button.alphaworld2.half_piglin_choose"));
    WButton halfEnderman = new WButton(Text.translatable("gui.button.alphaworld2.half_enderman_button"));
    WLabel halfEndermanChosenText = new WLabel(Text.translatable("gui.text.alphaworld2.half_enderman_chosen"));
    WLabel halfEndermanBenefits = new WLabel(Text.translatable("gui.text.alphaworld2.half_enderman_benefits"));
    WLabel halfEndermanBenefitsText1 = new WLabel(Text.translatable("gui.text.alphaworld2.half_enderman_benefits_text_1"));
    WLabel halfEndermanBenefitsText2 = new WLabel(Text.translatable("gui.text.alphaworld2.half_enderman_benefits_text_2"));
    WLabel halfEndermanBenefitsText3 = new WLabel(Text.translatable("gui.text.alphaworld2.half_enderman_benefits_text_3"));
    WLabel halfEndermanDrawbacks = new WLabel(Text.translatable("gui.text.alphaworld2.half_enderman_drawbacks"));
    WLabel halfEndermanDrawbacksText1 = new WLabel(Text.translatable("gui.text.alphaworld2.half_enderman_drawbacks_text_1"));
    WLabel halfEndermanDrawbacksText2 = new WLabel(Text.translatable("gui.text.alphaworld2.half_enderman_drawbacks_text_2"));
    WButton halfEndermanChoose = new WButton(Text.translatable("gui.button.alphaworld2.half_enderman_choose"));
    WButton halfAvian = new WButton(Text.translatable("gui.button.alphaworld2.half_avian_button"));
    WLabel halfAvianChosenText = new WLabel(Text.translatable("gui.text.alphaworld2.half_avian_chosen"));
    WLabel halfAvianBenefits = new WLabel(Text.translatable("gui.text.alphaworld2.half_avian_benefits"));
    WLabel halfAvianBenefitsText1 = new WLabel(Text.translatable("gui.text.alphaworld2.half_avian_benefits_text_1"));
    WLabel halfAvianBenefitsText2 = new WLabel(Text.translatable("gui.text.alphaworld2.half_avian_benefits_text_2"));
    WLabel halfAvianDrawbacks = new WLabel(Text.translatable("gui.text.alphaworld2.half_avian_drawbacks"));
    WLabel halfAvianDrawbacksText1 = new WLabel(Text.translatable("gui.text.alphaworld2.half_avian_drawbacks_text_1"));
    WLabel halfAvianDrawbacksText2 = new WLabel(Text.translatable("gui.text.alphaworld2.half_avian_drawbacks_text_2"));
    WButton halfAvianChoose = new WButton(Text.translatable("gui.button.alphaworld2.half_avian_choose"));
    WButton human = new WButton(Text.translatable("gui.button.alphaworld2.human_button"));
    WLabel humanChosenText = new WLabel(Text.translatable("gui.text.alphaworld2.human_chosen"));
    WLabel humanBenefits = new WLabel(Text.translatable("gui.text.alphaworld2.human_benefits"));
    WLabel humanBenefitsText1 = new WLabel(Text.translatable("gui.text.alphaworld2.human_benefits_text_1"));
    WLabel humanDrawbacks = new WLabel(Text.translatable("gui.text.alphaworld2.human_drawbacks"));
    WLabel humanDrawbacksText1 = new WLabel(Text.translatable("gui.text.alphaworld2.human_drawbacks_text_1"));
    WButton humanChoose = new WButton(Text.translatable("gui.button.alphaworld2.human_choose"));

    public RaceSelectionGui(){
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(256,240);
        root.setInsets(Insets.ROOT_PANEL);

        //Title
        root.add(raceTitle, 7, 0, 2, 1);
        raceTitle.setHorizontalAlignment(HorizontalAlignment.CENTER);

        //Description (Telling you to choose race...)
        root.add(raceDesc, 0, 1, 2, 1);

        //Buttons for selecting race
        root.add(halfPiglinButton, 0, 3, 7, 1);
        root.add(halfEnderman, 9, 3, 7, 1);
        root.add(halfAvian, 0, 5, 7, 1);
        root.add(human, 9, 5, 7, 1);

        /*On Half-Piglin button select, remove Description and replace it with text telling you chose half-piglin,
        then below the buttons, display the pros and cons of selecting race, as well as a button to confirm choosing race.*/
        halfPiglinButton.setOnClick(() -> {
            if(selectedARace = true) {
                switch (raceSelected){
                    case 1:
                        root.remove(halfPiglinChosenText);
                        root.remove(piglinFlag);
                        root.remove(halfPiglinBenefits);
                        root.remove(halfPiglinBenefitsText1);
                        root.remove(halfPiglinBenefitsText2);
                        root.remove(halfPiglinDrawbacks);
                        root.remove(halfPiglinDrawbacksText1);
                        root.remove(halfPiglinDrawbacksText2);
                        root.remove(halfPiglinChoose);
                        break;
                    case 2:
                        root.remove(halfEndermanChosenText);
                        root.remove(endermanFlag);
                        root.remove(halfEndermanBenefits);
                        root.remove(halfEndermanBenefitsText1);
                        root.remove(halfEndermanBenefitsText2);
                        root.remove(halfEndermanBenefitsText3);
                        root.remove(halfEndermanDrawbacks);
                        root.remove(halfEndermanDrawbacksText1);
                        root.remove(halfEndermanDrawbacksText2);
                        root.remove(halfEndermanChoose);
                        break;
                    case 3:
                        root.remove(halfAvianChosenText);
                        root.remove(halfAvianFlag);
                        root.remove(halfAvianBenefits);
                        root.remove(halfAvianBenefitsText1);
                        root.remove(halfAvianBenefitsText2);
                        root.remove(halfAvianDrawbacks);
                        root.remove(halfAvianDrawbacksText1);
                        root.remove(halfAvianDrawbacksText2);
                        root.remove(halfAvianChoose);
                        break;
                    case 4:
                        root.remove(humanChosenText);
                        root.remove(humanFlag);
                        root.remove(humanBenefits);
                        root.remove(humanBenefitsText1);
                        root.remove(humanDrawbacks);
                        root.remove(humanDrawbacksText1);
                        root.remove(humanChoose);
                        break;
                }
            }
            raceSelected = 1;
            selectedARace = true;
            System.out.println("Half Piglin Selected.");
            root.remove(raceDesc);
            root.add(halfPiglinChosenText, 0, 1, 2, 1);
            root.add(piglinFlag, -1, 8, 1, 1);
            root.add(halfPiglinBenefits, 1, 7, 1, 1);
            root.add(halfPiglinBenefitsText1, 1, 8, 1, 1);
            root.add(halfPiglinBenefitsText2, 1, 9, 1, 1);
            root.add(halfPiglinDrawbacks, 9, 7, 1, 1);
            root.add(halfPiglinDrawbacksText1, 9, 8, 1, 1);
            root.add(halfPiglinDrawbacksText2, 9, 8, 1, 1);
            root.add(halfPiglinChoose, 5, 11, 7, 1);
        });

        halfEnderman.setOnClick(() -> {
            if(selectedARace = true) {
                switch (raceSelected){
                    case 1:
                        root.remove(halfPiglinChosenText);
                        root.remove(piglinFlag);
                        root.remove(halfPiglinBenefits);
                        root.remove(halfPiglinBenefitsText1);
                        root.remove(halfPiglinBenefitsText2);
                        root.remove(halfPiglinDrawbacks);
                        root.remove(halfPiglinDrawbacksText1);
                        root.remove(halfPiglinDrawbacksText2);
                        root.remove(halfPiglinChoose);
                        break;
                    case 2:
                        root.remove(halfEndermanChosenText);
                        root.remove(endermanFlag);
                        root.remove(halfEndermanBenefits);
                        root.remove(halfEndermanBenefitsText1);
                        root.remove(halfEndermanBenefitsText2);
                        root.remove(halfEndermanBenefitsText3);
                        root.remove(halfEndermanDrawbacks);
                        root.remove(halfEndermanDrawbacksText1);
                        root.remove(halfEndermanDrawbacksText2);
                        root.remove(halfEndermanChoose);
                        break;
                    case 3:
                        root.remove(halfAvianChosenText);
                        root.remove(halfAvianFlag);
                        root.remove(halfAvianBenefits);
                        root.remove(halfAvianBenefitsText1);
                        root.remove(halfAvianBenefitsText2);
                        root.remove(halfAvianDrawbacks);
                        root.remove(halfAvianDrawbacksText1);
                        root.remove(halfAvianDrawbacksText2);
                        root.remove(halfAvianChoose);
                        break;
                    case 4:
                        root.remove(humanChosenText);
                        root.remove(humanFlag);
                        root.remove(humanBenefits);
                        root.remove(humanBenefitsText1);
                        root.remove(humanDrawbacks);
                        root.remove(humanDrawbacksText1);
                        root.remove(humanChoose);
                        break;
                }
            }
            selectedARace = true;
            raceSelected = 2;
            System.out.println("Half Enderman Selected.");
            root.remove(raceDesc);
            root.add(halfEndermanChosenText, 0, 1, 2, 1);
            root.add(endermanFlag, -1, 8, 1, 1);
            root.add(halfEndermanBenefits, 1, 7, 1, 1);
            root.add(halfEndermanBenefitsText1, 1, 8, 1, 1);
            root.add(halfEndermanBenefitsText2, 1, 9, 1, 1);
            root.add(halfEndermanBenefitsText3, 1, 10, 1, 1);
            root.add(halfEndermanDrawbacks, 9, 7, 1, 1);
            root.add(halfEndermanDrawbacksText1, 9, 8, 1, 1);
            root.add(halfEndermanDrawbacksText2, 9, 9, 1, 1);
            root.add(halfEndermanChoose, 5, 11, 7, 1);
        });

        halfAvian.setOnClick(() -> {
            if(selectedARace = true) {
                switch (raceSelected){
                    case 1:
                        root.remove(halfPiglinChosenText);
                        root.remove(piglinFlag);
                        root.remove(halfPiglinBenefits);
                        root.remove(halfPiglinBenefitsText1);
                        root.remove(halfPiglinBenefitsText2);
                        root.remove(halfPiglinDrawbacks);
                        root.remove(halfPiglinDrawbacksText1);
                        root.remove(halfPiglinDrawbacksText2);
                        root.remove(halfPiglinChoose);
                        break;
                    case 2:
                        root.remove(halfEndermanChosenText);
                        root.remove(endermanFlag);
                        root.remove(halfEndermanBenefits);
                        root.remove(halfEndermanBenefitsText1);
                        root.remove(halfEndermanBenefitsText2);
                        root.remove(halfEndermanBenefitsText3);
                        root.remove(halfEndermanDrawbacks);
                        root.remove(halfEndermanDrawbacksText1);
                        root.remove(halfEndermanDrawbacksText2);
                        root.remove(halfEndermanChoose);
                        break;
                    case 3:
                        root.remove(halfAvianChosenText);
                        root.remove(halfAvianFlag);
                        root.remove(halfAvianBenefits);
                        root.remove(halfAvianBenefitsText1);
                        root.remove(halfAvianBenefitsText2);
                        root.remove(halfAvianDrawbacks);
                        root.remove(halfAvianDrawbacksText1);
                        root.remove(halfAvianDrawbacksText2);
                        root.remove(halfAvianChoose);
                        break;
                    case 4:
                        root.remove(humanChosenText);
                        root.remove(humanFlag);
                        root.remove(humanBenefits);
                        root.remove(humanBenefitsText1);
                        root.remove(humanDrawbacks);
                        root.remove(humanDrawbacksText1);
                        root.remove(humanChoose);
                        break;
                }
            }
            selectedARace = true;
            raceSelected = 3;
            System.out.println("Half Avian Selected.");
            root.remove(raceDesc);
            root.add(halfAvianChosenText, 0, 1, 2, 1);
            root.add(halfAvianFlag, -1, 8, 1, 1);
            root.add(halfAvianBenefits, 1, 7, 1, 1);
            root.add(halfAvianBenefitsText1, 1, 8, 1, 1);
            root.add(halfAvianBenefitsText2, 1, 9, 1, 1);
            root.add(halfAvianDrawbacks, 9, 7, 1, 1);
            root.add(halfAvianDrawbacksText1, 9, 8, 1, 1);
            root.add(halfAvianDrawbacksText2, 9, 9, 1, 1);
            root.add(halfAvianChoose, 5, 11, 7, 1);
        });

        human.setOnClick(() -> {
            if(selectedARace = true) {
                switch (raceSelected){
                    case 1:
                        root.remove(halfPiglinChosenText);
                        root.remove(piglinFlag);
                        root.remove(halfPiglinBenefits);
                        root.remove(halfPiglinBenefitsText1);
                        root.remove(halfPiglinBenefitsText2);
                        root.remove(halfPiglinDrawbacks);
                        root.remove(halfPiglinDrawbacksText1);
                        root.remove(halfPiglinDrawbacksText2);
                        root.remove(halfPiglinChoose);
                        break;
                    case 2:
                        root.remove(halfEndermanChosenText);
                        root.remove(endermanFlag);
                        root.remove(halfEndermanBenefits);
                        root.remove(halfEndermanBenefitsText1);
                        root.remove(halfEndermanBenefitsText2);
                        root.remove(halfEndermanBenefitsText3);
                        root.remove(halfEndermanDrawbacks);
                        root.remove(halfEndermanDrawbacksText1);
                        root.remove(halfEndermanDrawbacksText2);
                        root.remove(halfEndermanChoose);
                        break;
                    case 3:
                        root.remove(halfAvianChosenText);
                        root.remove(halfAvianFlag);
                        root.remove(halfAvianBenefits);
                        root.remove(halfAvianBenefitsText1);
                        root.remove(halfAvianBenefitsText2);
                        root.remove(halfAvianDrawbacks);
                        root.remove(halfAvianDrawbacksText1);
                        root.remove(halfAvianDrawbacksText2);
                        root.remove(halfAvianChoose);
                        break;
                    case 4:
                        root.remove(humanChosenText);
                        root.remove(humanFlag);
                        root.remove(humanBenefits);
                        root.remove(humanBenefitsText1);
                        root.remove(humanDrawbacks);
                        root.remove(humanDrawbacksText1);
                        root.remove(humanChoose);
                        break;
                }
            }
            selectedARace = true;
            raceSelected = 4;
            System.out.println("Human Selected.");
            root.remove(raceDesc);
            root.add(humanChosenText, 0, 1, 2, 1);
            root.add(humanFlag, -1, 8, 1, 1);
            root.add(humanBenefits, 1, 7, 1, 1);
            root.add(humanBenefitsText1, 1, 8, 1, 1);
            root.add(humanDrawbacks, 9, 7, 1, 1);
            root.add(humanDrawbacksText1, 9, 8, 1, 1);
            root.add(humanChoose, 5, 11, 7, 1);
        });

        root.validate(this);
    }
}
