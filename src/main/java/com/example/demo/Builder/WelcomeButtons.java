package com.example.demo.Builder;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;


import java.util.ArrayList;
import java.util.List;

public class WelcomeButtons {


    private static KeyboardButton findTrip = new KeyboardButton("Find trip");



    public static List<KeyboardButton> getButtons() {
      List<KeyboardButton> buttons = new ArrayList<>();
      buttons.add(findTrip);
      return buttons;
    }


}
