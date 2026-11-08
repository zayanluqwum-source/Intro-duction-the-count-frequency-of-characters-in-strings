
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String st = sc.nextLine();

        // Array to store character frequency
        int[] fre = new int[st.length()];

        // Convert the string into a character array
        char[] st1 = st.toCharArray();

        // Check the occurrence of each character
        for (int i = 0; i < st.length(); i++) {
            fre[i] = 1;

            // Check the remaining characters
            for (int j = i + 1; j < st.length(); j++) {

                // Check if characters are the same
                if (st1[i] == st1[j]) {
                    fre[i]++;

                    // Mark the repeated character
                    st1[j] = '0';
                }
            }
        }

        // Display each character occurrence
        System.out.println("Character Occurrence:");

        for (int i = 0; i < fre.length; i++) {

            // Skip spaces and repeated characters
            if (st1[i] != ' ' && st1[i] != '0') {
                System.out.println(st1[i] + " : " + fre[i]);
            }
        }

        sc.close();
    }
}
