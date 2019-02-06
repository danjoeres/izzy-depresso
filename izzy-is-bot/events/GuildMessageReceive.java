package izzy.is.bot.events;

import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.util.ArrayList;
import java.util.Collections;

import static izzy.is.bot.methods.Method.sendMessageLocal;

public class GuildMessageReceive extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split(" ");
        TextChannel c = event.getChannel();

        switch(args[0].toLowerCase()) {
            case("uwu"):
                sendMessageLocal("ᵘʷᵘ **oh frick** ᵘʷᵘ ᵘʷᵘ ᵘʷᵘ ᵘʷᵘ ᵘʷᵘ ᵘʷᵘ ᵘʷᵘ ᵘʷᵘ **frick sorry guys** ᵘʷᵘ ᵘʷᵘ ᵘʷᵘ ᵘʷᵘ ᵘʷᵘ ᵘʷᵘ **sorry im dropping** ᵘʷᵘ **my uwus all over the** ᵘʷᵘ **place** ᵘʷᵘ ᵘʷᵘ ᵘʷᵘ **sorry**", c);
                break;
            case("memrise"):
                sendMessageLocal("`IZZY IS ON MEMRISE RIGHT NOW`", c);
                break;
            case("shalom"):
                sendMessageLocal("SHALOM JACKIE SHALOM ALL", c);
                break;
            case("what"):
                sendMessageLocal("let's unpick that...", c);
                break;
            case("edgy"):
                sendMessageLocal("https://instagram.com/lmaoedge", c);
                break;
        }


        ArrayList<String> memes = new ArrayList<>();

        memes.add("https://i.kym-cdn.com/editorials/icons/mobile/000/000/344/Screen_Shot_2019-01-28_at_1.08.53_PM.jpg");
        memes.add("https://pics.me.me/shaggy-memes-shagi-memes-took-far-too-long-on-ms-41218971.png");
        memes.add("https://pics.me.me/when-you-just-want-the-shaggy-memes-to-die-but-41172794.png");
        memes.add("https://media.metrolatam.com/2019/02/01/ob0g2bgvcxc21-2b8d3b0a25cebe22a49c3268a3eef866.jpg");
        memes.add("https://pics.me.me/thumb_when-someone-says-shaggy-memes-are-stupid-and-pointless-i-41123115.png");
        memes.add("https://i.imgur.com/lUmmvhv.jpg");
        memes.add("http://images3.memedroid.com/images/UPLOADED318/5c4daaf769c62.jpeg");
        memes.add("https://i.chzbgr.com/full/7626501/h122A0694/");

        if(args[0].equalsIgnoreCase("shaggy")) {
            Collections.shuffle(memes);
            event.getChannel().sendMessage(memes.get(0)).queue();
        }
    }
}
