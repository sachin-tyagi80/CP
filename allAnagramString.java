import java.util.*;

public class allAnagramString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter string s: ");
        String s = sc.next();

        System.out.print("Enter string p: ");
        String p = sc.next();

        // result list
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            System.out.println(result);
            return;
        }

        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];

        // frequency of p
        for (int i = 0; i < p.length(); i++) {
            pFreq[p.charAt(i) - 'a']++;
        }

        int windowSize = p.length();

        // sliding window
        for (int i = 0; i < s.length(); i++) {

            // add current character
            windowFreq[s.charAt(i) - 'a']++;

            // remove left character if window exceeded
            if (i >= windowSize) {
                windowFreq[s.charAt(i - windowSize) - 'a']--;
            }

            // compare both frequency arrays
            if (Arrays.equals(pFreq, windowFreq)) {
                result.add(i - windowSize + 1);
            }
        }

        // output result
        System.out.println("Anagram start indices: " + result);

        sc.close();
    }
}
