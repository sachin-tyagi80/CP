import java.util.Scanner;   // Import Scanner for user input

public class reverseStr2 {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take string input from user
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        // Take integer k input from user
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        // Convert string to character array for easy swapping
        char[] arr = s.toCharArray();
        int n = arr.length;

        // Loop through the string in blocks of size 2k
        for (int i = 0; i < n; i += 2 * k) {

            // Set left pointer at start of block
            int left = i;

            // Set right pointer to reverse only first k characters
            int right = Math.min(i + k - 1, n - 1);

            // Reverse characters between left and right
            while (left < right) {
                char temp = arr[left];   // Store left character
                arr[left] = arr[right]; // Swap with right character
                arr[right] = temp;      // Assign stored character

                left++;   // Move left pointer forward
                right--;  // Move right pointer backward
            }
        }

        // Convert character array back to string
        String result = new String(arr);

        // Print the final result
        System.out.println("Result after reversing: " + result);

        // Close the scanner
        sc.close();
    }
}
