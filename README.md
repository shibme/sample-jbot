# Sample Bot
[![Build Status](https://travis-ci.org/shibme/sample-jbot.svg)](https://travis-ci.org/shibme/sample-jbot)
[![Dependency Status](https://www.versioneye.com/user/projects/56d5faead716950040a0e4bd/badge.svg?style=flat)](https://www.versioneye.com/user/projects/56d5faead716950040a0e4bd)
[![Percentage of issues still open](http://isitmaintained.com/badge/open/shibme/sample-jbot.svg)](http://isitmaintained.com/project/shibme/sample-jbot "Percentage of issues still open")

A sample telegram bot with JBots framework

### How to begin
* Fork or clone this repo and modify the SampleBot java file and try creating a bot on your own.
* Make sure you create the config class by extending me.shib.java.lib.jbots.JBotConfig as discussed below.
* Once you're done creating the bot's model code and the config file, just run `mvn clean install` command to generate a runnable jar file which will be available inside the `target/` directory.

### Configuration for Bot Owners
```java
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
```