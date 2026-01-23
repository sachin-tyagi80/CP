import java.util.*;

public class kokobanana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of piles
        int n = sc.nextInt();
        int[] piles = new int[n];

        // Input piles
        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }

        // Input hours
        int h = sc.nextInt();

        int lo = 1;
        int hi = 0;

        // Find max pile
        for (int pile : piles) {
            hi = Math.max(hi, pile);
        }

        int ans = hi;

        // Binary Search
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            long hours = 0;

            // Calculate total hours for current speed
            for (int i = 0; i < n; i++) {
                hours += (piles[i] + mid - 1) / mid; // ceil division
            }

            if (hours <= h) {
                ans = mid;
                hi = mid - 1;   // try smaller speed
            } else {
                lo = mid + 1;   // need bigger speed
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
