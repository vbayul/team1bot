package com.example.demo.TelegramButtonsController;


import com.example.demo.Builder.*;
import com.example.demo.dto.Datum;
import com.example.demo.dto.SkypicerDTO;
import com.example.demo.dto.UserDataDTO;
import com.example.demo.service.SkypicerService;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.time.Instant;
import java.util.Date;


public class ButtonsController {

    private static String cntrFrom = "UA";

    public static void setCntrTo(String cntrTo) {
        ButtonsController.cntrTo = cntrTo;
    }

    private static String cntrTo = new String();
    private static String startDate = new String();
    private static String endDate = new String();
    private static String amount = new String();
    private static String lastMessage = new String();

    public static String actionManager(String currentAction, SendMessage message, Update update) {

        System.out.println(update.getMessage().getText());

            switch (currentAction) {

                case "Select departure country":
                    message.setText("Input departure country");
                    message.setText(cntrFrom);

                    break;

                case "Country of arrival":
                    message.setText("Choose country of arrival");
                    message.setReplyMarkup(Button.createButtons(CountrySettingButtons.getButtons()));
                    //message.setText(cntrTo);
                    cntrTo = lastMessage;
                    break;

                case "Departure Date":
                    message.setText("Input departure date");
                    //message.setText(startDate);
                    startDate = lastMessage;
                    break;

                case "Arrive Date":
                    message.setText("Input arrive date");
                    //message.setText(endDate);
                    endDate = lastMessage;
                    break;


                case "Start search":
                    message.setText("Start searching for trip");

                    UserDataDTO user = userBuilder(cntrFrom,cntrTo,startDate,endDate,amount);
                    System.out.println(cntrFrom);
                    System.out.println(cntrTo);
                    System.out.println(startDate);
                    System.out.println(endDate);
                    System.out.println(amount);
                    SkypicerService skpService = new SkypicerService(user);
                    SkypicerDTO skpDTO =  skpService.sendRequest();


                    message.setText(skpDTO.getCurrency());
                    message.setText(skpDTO.getAdditionalProperties().toString());
                    message.setText(skpDTO.getAllAirlines().toString());
                    String messageForLink = "";
                    for (Datum datum : skpDTO.getData())
                    {
                        if (messageForLink.length() < 4000)
                            messageForLink = messageForLink +" Country from: "+ datum.getCityFrom() + " Country to:" +datum.getCityTo() + " Departure time: " + Date.from(Instant.ofEpochSecond( datum.getDTime() )) +
                                    " Arrive time: " +Date.from(Instant.ofEpochSecond( datum.getATime() ))  + " Price " + datum.getPrice() +  System.lineSeparator() + "-----------------------";
                    }
                    System.out.println(messageForLink);
                    message.setText(messageForLink);
                    break;

                case "Budget":
                    //message.setText("Input your budget");
                    amount = lastMessage;
                    break;


                case "<- Back":
                    message.setReplyMarkup(ButtonsFactory.getButtons(currentAction));
                    message.setText(currentAction);
                    break;

                case "/start":
                    message.setReplyMarkup(ButtonsFactory.getButtons(currentAction));
                    message.setText(currentAction);

                default:
                    if (update.hasMessage()) {
                        lastMessage = update.getMessage().getText();
                    }
                    message.setReplyMarkup(ButtonsFactory.getButtons(currentAction));


            }

        return null;
    }

    private static UserDataDTO userBuilder(String cntrFrom, String cntrTo, String startDate, String endDate, String amount) {
        UserDataDTO user = new UserDataDTO();

        user.setCountryFrom(cntrFrom);
        user.setCountryTo(cntrTo);
        user.setStartDate(startDate);
        user.setEndDate(endDate);
        user.setAmount(amount);

        return user;
    }
}
