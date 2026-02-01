import java.util.Scanner;

class MergeStringAlternately {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.println("Enter first string:");
        String word1 = sc.nextLine();

        System.out.println("Enter second string:");
        String word2 = sc.nextLine();

        StringBuilder result = new StringBuilder();

        int i = 0, j = 0;

        // Merge strings alternately
        while (i < word1.length() || j < word2.length()) {

            if (i < word1.length()) {
                result.append(word1.charAt(i));
                i++;
            }

            if (j < word2.length()) {
                result.append(word2.charAt(j));
                j++;
            }
        }

        // Output
        System.out.println("Merged String:");
        System.out.println(result.toString());

        sc.close();
    }
}
