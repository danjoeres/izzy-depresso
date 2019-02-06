package izzy.is.bot.events;

import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class GoogleTranslate extends ListenerAdapter {
    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split(" ");
        TextChannel c = event.getChannel();

        if(args[0].equalsIgnoreCase("!translate")) {
            if(args.length >= 2) {
                String replaced = event.getMessage().getContentRaw().replace(" ", "%20");

                c.sendMessage("https://translate.google.co.uk/#view=home&op=translate&sl=en&tl=es&text=" + replaced).queue();
            }
        }
    }
}
