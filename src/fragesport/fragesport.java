package fragesport;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class fragesport {
    public static void main(String[] args) {
        Scanner input = null;
        try {
            input = new Scanner(new File("quiz.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<String> Questions = new ArrayList<>();
        ArrayList<String> Answers = new ArrayList<>();
        ArrayList<Integer> CorrectAnswers = new ArrayList<>();

        while (input.hasNext()) {
            Questions.add(input.nextLine());
            Answers.add(input.nextLine());
            CorrectAnswers.add(input.nextInt());
            input.nextLine();
        }
        int points = 0;
        boolean isRunning = true;
        while (isRunning) {
            int questionNum = (int) (Math.random() * 10);
            System.out.println(Questions.get(questionNum));
            System.out.println(Answers.get(questionNum));
            Scanner userIn = new Scanner(System.in);
            int answer = userIn.nextInt();
            if (answer == CorrectAnswers.get(questionNum)) {
                System.out.println("Rätt svar: 1 poäng");
                System.out.println("Du har så här många poäng: " + ++points);
            } else {
                System.out.println("Fel svar: -1 poäng");
                System.out.println("Rätt svar var: " + CorrectAnswers.get(questionNum));
                System.out.println("Du har så här många poäng: " + --points);
            }
        }
    }
}
