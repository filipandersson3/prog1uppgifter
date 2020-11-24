package testkod;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Regret {
    public static void main(String[] args) {
        try {
            Regret("asdfvhasufiasdhfgvuoaspficgasuicghasrnovygvphiawrcpgmoisrynpgviosyuocgymasnocyngvioyasxfuiashmputgysgmcpioasymioygnmasyeruoigvunosdmjpgniuormoapgmasypuomifasyjdpuomifyhmniowraypfhioasvpniohcpfmiasod9hgsnhgjkasnhuigcasnhfugioasufhimasducgiosjiphmoerpgasruioasyfioshphatvhaproipasrhmgasrmpiocgasyhncpgioscrhmpoasgiox", 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void Regret(String string, int ms) throws InterruptedException {
        for(int i = 0;i <= string.length()-1;i++) {
            System.out.print(string.charAt(i));
            TimeUnit.MILLISECONDS.sleep(ms);
        }
    }
}
