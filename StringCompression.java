import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter the string: ");
        String word = sc.nextLine();

        StringBuilder comp = new StringBuilder();
        int read = 0;

        while (read < word.length()) {
            char currentChar = word.charAt(read);
            int count = 0;

            // Count same characters (maximum 9)
            while (read < word.length()
                    && word.charAt(read) == currentChar
                    && count < 9) {
                read++;
                count++;
            }

            // Append count and character
            comp.append(count);
            comp.append(currentChar);
        }

        // Output
        System.out.println("Compressed string: " + comp.toString());

        sc.close();
    }
}
