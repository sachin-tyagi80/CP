// import java.util.Scanner;

// public class IsSubsequence {

//     public static boolean isSubsequence(String s, String t) {
//         int i = 0;
//         int j = 0;

//         while (i < s.length() && j < t.length()) {
//             if (s.charAt(i) == t.charAt(j)) {
//                 i++;
//             }
//             j++;
//         }

//         return i == s.length();
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter string s: ");
//         String s = sc.nextLine();

//         System.out.print("Enter string t: ");
//         String t = sc.nextLine();

//         boolean result = isSubsequence(s, t);

//         System.out.println("It is a subsquence of t" + result);

//         sc.close();
//     }
// }


////////////////////////////////////////
import java.util.Scanner;

public class IsSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        System.out.print("Enter string t: ");
        String t = sc.nextLine();

        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        if (i == s.length()) {
            System.out.println("s is a subsequence of t: true");
        } else {
            System.out.println("s is a subsequence of t: false");
        }

        sc.close();
    }
}
