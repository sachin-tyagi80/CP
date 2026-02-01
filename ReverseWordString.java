import java.util.Scanner;

class ReverseWordString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        // Step 1: Remove leading and trailing spaces
        s = s.trim();

        // Step 2: Split by one or more spaces
        String[] words = s.split("\\s+");

        // Step 3: Reverse words
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");
            }
        }

        // Output
        System.out.println("Reversed Words:");
        System.out.println(result.toString());

        sc.close();
    }
}
