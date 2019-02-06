package izzy.is.bot;

import izzy.is.bot.events.GuildMessageReceive;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class Suicide {
     private static JDA jda;

     public static void main(String[] args) throws Exception{
         jda = new JDABuilder(AccountType.BOT)
                 .setToken("NTM1MjE0NTIwNjgzOTg2OTg1.DyE45Q._Q-y__mcTh6DQiyaklbtWA-AyAo")
                 .buildBlocking();

         jda.addEventListener(new GuildMessageReceive());
     }
}
