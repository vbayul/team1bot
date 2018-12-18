package com.example.demo.Builder;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;


import java.util.ArrayList;
import java.util.List;

public class WelcomeButtons {

    private static KeyboardButton setupCountry = new KeyboardButton("My default country");
    private static KeyboardButton findTrip = new KeyboardButton("Find a trip");
    private static KeyboardButton bookMarks = new KeyboardButton("My bookmarks");


    public static List<KeyboardButton> getButtons() {
      List<KeyboardButton> buttons = new ArrayList<>();
      buttons.add(setupCountry);
      buttons.add(findTrip);
      buttons.add(bookMarks);

      return buttons;
    }


}
