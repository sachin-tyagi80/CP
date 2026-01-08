import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to char array
        char[] s = input.toCharArray();

        int left = 0;
        int right = s.length - 1;

        // Reverse logic
        while (left < right) {
            char temp = s[right];
            s[right--] = s[left];
            s[left++] = temp;
        }

        // Output
        System.out.print("Reversed string: ");
        for (char c : s) {
            System.out.print(c);
        }

        sc.close();
    }
}
