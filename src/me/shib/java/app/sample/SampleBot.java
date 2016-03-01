package me.shib.java.app.sample;

import me.shib.java.lib.jbots.JBot;
import me.shib.java.lib.jbots.JBotConfig;
import me.shib.java.lib.jtelebot.types.ChatId;
import me.shib.java.lib.jtelebot.types.ChosenInlineResult;
import me.shib.java.lib.jtelebot.types.InlineQuery;
import me.shib.java.lib.jtelebot.types.Message;

import java.io.IOException;

public final class SampleBot extends JBot {

    public SampleBot(JBotConfig config) {
        super(config);
    }

    @Override
    public Message onMessageFromAdmin(Message message) {
        try {
            return bot.sendMessage(new ChatId(message.getChat().getId()), "Received message from admin");
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    public Message onCommand(Message message) {
        try {
            return bot.sendMessage(new ChatId(message.getChat().getId()), "Received command: " + message.getText());
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    public Message onReceivingMessage(Message message) {
        try {
            return bot.sendMessage(new ChatId(message.getChat().getId()), "Received message from user");
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    public boolean onInlineQuery(InlineQuery query) {
        return false;
    }

    @Override
    public boolean onChosenInlineResult(ChosenInlineResult chosenInlineResult) {
        return false;
    }

    @Override
    public Message sendStatusMessage(long chatId) {
        return null;
    }
}
