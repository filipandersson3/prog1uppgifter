package testkod;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteInputToFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String textInput = in.nextLine();
        ReadWriteLibrary.WriteToFile(textInput);
    }
}
