package testkod;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("src/testkod/textfile.txt");
            Scanner in = new Scanner(System.in);
            String textInput = in.nextLine();
            myWriter.write(textInput);
            myWriter.close();
            System.out.println("Wrote to file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
