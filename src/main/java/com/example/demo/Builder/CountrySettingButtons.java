package com.example.demo.Builder;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;


import java.util.ArrayList;
import java.util.List;

public class CountrySettingButtons  {

    private static KeyboardButton Ukraine = new KeyboardButton("UA");
    private static KeyboardButton UK = new KeyboardButton("UK");
    private static KeyboardButton back = new KeyboardButton("<- Back");


    public static List<KeyboardButton> getButtons() {
        List<KeyboardButton> buttons = new ArrayList<>();
        buttons.add(Ukraine);
        buttons.add(UK);
        buttons.add(back);

        return buttons;
    }
}
