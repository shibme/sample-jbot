package me.shib.java.app.sample;

import me.shib.java.lib.jbots.JBot;
import me.shib.java.lib.jbots.JBotConfig;
import me.shib.java.lib.jbotstats.BotStatsConfig;

import java.util.HashMap;

public class SampleConfig extends JBotConfig {
    @Override
    public String botApiToken() {
        return "YourBotApiTokenGoesHere";
    }

    @Override
    public Class<? extends JBot> botModelClass() {
        return SampleBot.class;
    }

    @Override
    public int threadCount() {
        return super.threadCount();
    }

    @Override
    public int reportInterval() {
        return super.reportInterval();
    }

    @Override
    public int minimumAllowedRating() {
        return super.minimumAllowedRating();
    }

    @Override
    public boolean handleMissedChats() {
        return super.handleMissedChats();
    }

    @Override
    public boolean defaultWorker() {
        return super.defaultWorker();
    }

    @Override
    protected long[] admins() {
        return super.admins();
    }

    @Override
    protected HashMap<String, String> constants() {
        return super.constants();
    }

    @Override
    public BotStatsConfig botStatsConfig() {
        return super.botStatsConfig();
    }
}
