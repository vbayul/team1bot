package com.example.demo.TelegramButtonsController;



public class ButtonsController {


    public static String buttonResponse(String message) {
        String response ;

        if(message.equals("Info")) {
            response = "You need to give a country's, your budget, and dates when you want to travel";
        } else {
            response = "Choose country ";
        }

        return response;
    }


}
