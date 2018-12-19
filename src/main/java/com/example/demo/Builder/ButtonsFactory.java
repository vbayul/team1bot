package com.example.demo.Builder;

import com.example.demo.TelegramButtonsController.ButtonsController;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;

public class ButtonsFactory {

        public static ReplyKeyboardMarkup getButtons(String windowType) {

                switch(windowType) {

                    case "Country of arrival" :
                        return Button.createButtons(CountrySettingButtons.getButtons());
                    case "UK":
                        ButtonsController.setCntrTo("UK");
                        return Button.createButtons(TripButtons.getButtons());
                    case "UA":
                        ButtonsController.setCntrTo("UA");
                        return Button.createButtons(TripButtons.getButtons());
                    default: return Button.createButtons(TripButtons.getButtons());
                }

        }

}
