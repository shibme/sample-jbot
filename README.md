# Sample Bot
[![Build Status](https://travis-ci.org/shibme/sample-jbot.svg)](https://travis-ci.org/shibme/sample-jbot)
[![Percentage of issues still open](http://isitmaintained.com/badge/open/shibme/sample-jbot.svg)](http://isitmaintained.com/project/shibme/sample-jbot "Percentage of issues still open")

A sample telegram bot with JBots framewok

### Configuration for Bot Owners
Create a file named `jbots-config.json` and add the following
```json
[
  {
	"botApiToken": "YourBotApiTokenGoesHere",
	"botModelClassName": "me.shib.java.app.sample.SampleBot",
	"commandList": ["/start","/help","/status","/scr"],
	"threadCount": 4,
	"defaultWorkerDisabled": true,
	"adminIdList": [0, 0],
	"reportIntervalInSeconds": 86400,
	  "constants": {
		  "key1": "value1",
		  "key2": "value2",
		  "key3": "value3"
	  }
  }
]
```
* `botApiToken` - The API token that you receive when you create a bot with [@BotFather](https://telegram.me/BotFather).
* `botModelClassName` - The fully qualified class name of the bot's model (You won't have to change what's given above).
* `commandList` - The list of supported commands.
* `threadCount` - The number of threads the bot should have. This bot is restricted to 4 threads.
* `defaultWorkerDisabled` - The number of threads the bot should have. This bot is restricted to 7 threads.
* `adminIdList` - Use [@GO_Robot](https://telegram.me/GO_Robot) to find your telegram ID and add it to admin list.
* `reportIntervalInSeconds` - The intervals at which the Bot reports the Admins the status (To know if it is alive).