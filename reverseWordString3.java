import java.util.Scanner;   // Import Scanner class for taking user input

public class reverseWordString3 {
    public static void main(String[] args) {

        // Create Scanner object to read input from the keyboard
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String s = sc.nextLine();   // Read the full line as input

        // Split the input string into words using space as delimiter
        String[] words = s.split(" ");

        // StringBuilder to store the final result
        StringBuilder result = new StringBuilder();

        // Loop through each word in the array
        for (int i = 0; i < words.length; i++) {

            // Create StringBuilder for the current word
            StringBuilder sb = new StringBuilder(words[i]);

            // Reverse the current word and append it to result
            result.append(sb.reverse());

            // Add a space after each word except the last one
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        // Print the final string with each word reversed
        System.out.println("Reversed words string: " + result.toString());

        // Close the Scanner to free system resources
        sc.close();
    }
}
