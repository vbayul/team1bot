package com.example.demo.Builder;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class Button {

    public static ReplyKeyboardMarkup createButtons(List<KeyboardButton> buttons) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();

        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        KeyboardRow keyboardThirdRow = new KeyboardRow();
        KeyboardRow keyboardFourthRow = new KeyboardRow();

        for (int i = 0; i < buttons.size(); i++) {
            if (keyboardFirstRow.size() < 2) {
                keyboardFirstRow.add(buttons.get(i));
            } else {
                if (keyboardSecondRow.size() < 2) {
                    keyboardSecondRow.add(buttons.get(i));
                } else {
                    if (keyboardThirdRow.size() < 2) {
                        keyboardThirdRow.add(buttons.get(i));
                    } else {
                        if (keyboardFourthRow.size() < 2) {
                            keyboardFourthRow.add(buttons.get(i));
                        }
                    }
                }
            }
        }



        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardThirdRow);
        keyboard.add(keyboardFourthRow);

        replyKeyboardMarkup.setKeyboard(keyboard);

        return replyKeyboardMarkup;
    }

}
