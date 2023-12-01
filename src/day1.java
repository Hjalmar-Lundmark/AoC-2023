import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class day1 {
    public static void main(String[] args) {
        String in = readFile("day1.txt");
        String[] lines = in.split(" ");
        char[] chars;
        int total = 0;
        int firstInt = 0;
        int lastInt = 0;

        for (int i = 0; i < lines.length; i++) {
            // get first int
            chars = lines[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (isInt(chars[j])) {
                    firstInt = Integer.parseInt(String.valueOf(chars[j]));
                    System.out.println(firstInt);
                    break;
                }
            }

            // get second int
            System.out.println(chars);
            chars = reverse(chars);
            System.out.println(chars);
            for (int j = 0; j < chars.length; j++) {
                if (isInt(chars[j])) {
                    lastInt = Integer.parseInt(String.valueOf(chars[j]));
                    System.out.println(lastInt);
                    break;
                }
            }

            total = total + (firstInt * 10) + lastInt;
            System.out.println(total);
        }
        System.out.println(total);
    }

    public static char[] reverse(char[] c) {
        char[] newArray = new char[c.length];
        for (int i = 0; i < c.length; i++) {
            newArray[i] = c[c.length-i-1];
        }
        return newArray;
    }

    public static boolean isInt(char c) {
        if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '0') {
            return true;
        } else {
            return false;
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
