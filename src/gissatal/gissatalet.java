package gissatal;

import java.util.Scanner;

public class gissatalet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int randomnumber;
        randomnumber = (int) (Math.random()*100);
        System.out.println("Skriv ett nummer mellan 1-100");
        boolean right = false;
        while (!right) {
            int gissning = in.nextInt();
            if (gissning == randomnumber) {
                System.out.println("Rätt svar");
                right = true;
            } else if (gissning > randomnumber) {
                System.out.println("För stort, försök igen");
            } else if (randomnumber > gissning) {
                System.out.println("För litet, försök igen");
            }
        }
    }
}
