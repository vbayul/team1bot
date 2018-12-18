package com.example.demo.Builder;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;

public class ButtonsFactory {

        public static ReplyKeyboardMarkup getButtons(String windowType) {

                switch(windowType) {

                    case "My default country" :
                        return Button.createButtons(CountrySettingButtons.getButtons());


                    case "Find a trip" :
                        return Button.createButtons(TripButtons.getButtons());

                    case "<- Back" :
                        return Button.createButtons(WelcomeButtons.getButtons());
                }

            return Button.createButtons(WelcomeButtons.getButtons());
        }

}
