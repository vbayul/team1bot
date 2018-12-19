package com.example.demo.Builder;


import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;


import java.util.ArrayList;
import java.util.List;

public class TripButtons {

    private static KeyboardButton arriveCountry = new KeyboardButton("Country of arrival");
    private static KeyboardButton departDate = new KeyboardButton("Departure Date");
    private static KeyboardButton arriveDate = new KeyboardButton("Arrive Date");
    private static KeyboardButton find = new KeyboardButton("Start search");
    private static KeyboardButton budget = new KeyboardButton("Budget");
    private static KeyboardButton back = new KeyboardButton("<- Back");


    public static List<KeyboardButton> getButtons() {
        List<KeyboardButton> buttons = new ArrayList<>();
        buttons.add(arriveCountry);
        buttons.add(departDate);
        buttons.add(arriveDate);
        buttons.add(budget);
        buttons.add(find);
        buttons.add(back);

        return buttons;
    }


}
