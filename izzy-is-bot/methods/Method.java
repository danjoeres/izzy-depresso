package izzy.is.bot.methods;

import net.dv8tion.jda.core.entities.TextChannel;

public class Method {
    public static void sendMessageLocal(String message, TextChannel channel) {
        channel.sendMessage(message).queue();
    }
}
