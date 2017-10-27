package com.github.jamesgallicchio;

import sx.blah.discord.api.IDiscordClient;

public class DiscordBot {

    public final IDiscordClient CLIENT;

    public DiscordBot(IDiscordClient client) {
        CLIENT = client;
    }

    public IDiscordClient getClient() {
        return CLIENT;
    }
}
