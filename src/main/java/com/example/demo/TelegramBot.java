package com.example.demo;

import com.example.demo.Builder.ButtonsFactory;
import com.example.demo.Builder.WelcomeButtons;
import com.example.demo.TelegramButtonsController.ButtonsController;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


@Component
public class TelegramBot extends TelegramLongPollingBot {

    private final String botName = "Cheapest_Travel_bot";
    private final String botToken = "673529372:AAGetKSXKHvJy8EA95KP2P9BtcfBhRD5DJE";


    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage()
                    .setChatId(update.getMessage().getChatId())
                    .setText("Choose what are you looking for");

            message.setReplyMarkup(ButtonsFactory.getButtons(update.getMessage().getText()));
            message.setText("Answer to user");

            try {
                execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public String getBotUsername() {
        return botName;
    }

    @Override
    public String getBotToken() {
        return botToken;
	}
  }


