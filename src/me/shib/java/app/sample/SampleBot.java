package me.shib.java.app.sample;

import me.shib.java.lib.jbots.JBot;
import me.shib.java.lib.jbots.JBotConfig;
import me.shib.java.lib.jbots.MessageHandler;
import me.shib.java.lib.jtelebot.models.types.ChatId;
import me.shib.java.lib.jtelebot.models.updates.CallbackQuery;
import me.shib.java.lib.jtelebot.models.updates.ChosenInlineResult;
import me.shib.java.lib.jtelebot.models.updates.InlineQuery;
import me.shib.java.lib.jtelebot.models.updates.Message;

import java.io.IOException;

public final class SampleBot extends JBot {

    public SampleBot(JBotConfig config) {
        super(config);
    }

    @Override
    public MessageHandler onMessage(Message message) {
        return new MessageHandler(message) {
            @Override
            public boolean onCommandFromAdmin(String command, String argument) {
                try {
                    bot().sendMessage(new ChatId(message.getChat().getId()), "Received command from Admin: " + message.getText());
                    return true;
                } catch (IOException e) {
                    return false;
                }
            }

            @Override
            public boolean onCommandFromUser(String command, String argument) {
                try {
                    bot().sendMessage(new ChatId(message.getChat().getId()), "Received command from User: " + message.getText());
                    return true;
                } catch (IOException e) {
                    return false;
                }
            }

            @Override
            public boolean onMessageFromAdmin() {
                try {
                    bot().sendMessage(new ChatId(message.getChat().getId()), "Received message from Admin");
                    return true;
                } catch (IOException e) {
                    return false;
                }
            }

            @Override
            public boolean onMessageFromUser() {
                try {
                    bot().sendMessage(new ChatId(message.getChat().getId()), "Received message from user");
                    return true;
                } catch (IOException e) {
                    return false;
                }
            }
        };
    }

    @Override
    public void onInlineQuery(InlineQuery query) {
    }

    @Override
    public void onChosenInlineResult(ChosenInlineResult chosenInlineResult) {
    }

    @Override
    public void onCallbackQuery(CallbackQuery callbackQuery) {
    }

}
