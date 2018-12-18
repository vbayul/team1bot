package com.example.demo;


import com.example.demo.Builder.ButtonsFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


@Component
public class TelegramBot extends TelegramLongPollingBot {
    @Value("${telegram.name}")
    private String telegramName;
    @Value("${telegram.token}")
    private String telegramToke;

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
        return telegramName;

    }

    @Override
    public String getBotToken() {

        return telegramToke;

	}
  }


