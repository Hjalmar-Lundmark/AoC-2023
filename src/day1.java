import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class day1 {
    public static void main(String[] args) {
        String in = readFile("day1.txt");
        String[] lines = in.split(" ");
        int total = 0;
        int firstInt = 0;
        int lastInt = 0;

        System.out.println(lines[0]);
        for (int i = 0; i < lines.length; i++) {

        }
    }

    public static String readFile(String filnamn) {
        FileReader fr = null;
        String meddelande = "";
        String m2;
        try {
            fr = new FileReader(filnamn);
            BufferedReader inFil = new BufferedReader(fr);
            m2 = inFil.readLine();
            while (m2 != null) {
                // read next line
                meddelande += m2;
                meddelande += " ";
                m2 = inFil.readLine();
            }

            inFil.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return meddelande;
    }
}
