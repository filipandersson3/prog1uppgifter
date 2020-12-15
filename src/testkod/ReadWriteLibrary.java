package testkod;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteLibrary {
    public static void WriteToFile(String textInput) {
        try {
            for (int i = 0; textInput.length() > 120; i++) {
                if (textInput.charAt(i*120) == ' ') {
                    System.out.println("whitespace vid " + i);
                }
            }
            FileWriter myWriter = new FileWriter("src/testkod/textfile.txt");
            myWriter.write(textInput);
            myWriter.close();
            System.out.println("Wrote to file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
