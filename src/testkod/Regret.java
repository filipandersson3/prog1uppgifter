package testkod;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Regret {
    public static void main(String[] args) {
        try {
            Regret("WTF you play FORTCRINGE ?!?1!1?!? You are the most pathetic excuse of a human being I have ever seen. I hate you with the strength of a 1000 stars, and I genuinely hope that you die the most painful and slow death imaginable. Your very existence disgusts me and everybody who had the misfortune of ever resting their eyes on God's greatest mistake (I'm talking about you, in case I didn't get through your thick skull), and all of us want you to end your meaningless, parasitic existence, and for your hideous corpse to be sent far away. The only purpose your pitiful life has is to feed off the money, time, and resources of the people around you, without contributing a single joy or doing something useful. I almost feel sorry for you, as the very idea of that kind of painful, disabled cum stain of an existence brings a tear to my eye. If only you weren't a constant annoyance to everyone around you, narcissistic and the least likeable person in your city. You have the usefulness of someone with Down syndrome, and the likeablity of a child rapist. So, with that in mind, you should stick the nearest fork into the nearest outlet. Maybe someone will give a shit about you for a week and forget about you a month later.", 75);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void Regret(String string, int ms) throws InterruptedException {
        for(int i = 0;i <= string.length()-1;i++) {
            System.out.print(string.charAt(i));
            TimeUnit.MILLISECONDS.sleep(ms);
            if (i == 0) {}
            else if (i%120 == 0) {
                System.out.println("");
            }
        }
    }
}
