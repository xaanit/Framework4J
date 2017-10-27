package com.github.jamesgallicchio;

import sx.blah.discord.api.IDiscordClient;

public class DiscordBot {

    private final IDiscordClient CLIENT;

    public DiscordBot(IDiscordClient client) {
        CLIENT = client;
    }

    public IDiscordClient getClient() {
        return CLIENT;
    }
}
