import java.util.*;

public class unplacedFruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of fruits/baskets: ");
        int n = sc.nextInt();

        int[] fruits = new int[n];
        int[] baskets = new int[n];

        // Input fruits array
        System.out.println("Enter fruits array:");
        for (int i = 0; i < n; i++) {
            fruits[i] = sc.nextInt();
        }

        // Input baskets array
        System.out.println("Enter baskets array:");
        for (int i = 0; i < n; i++) {
            baskets[i] = sc.nextInt();
        }

        int allotted = 0;

        // Core logic (no separate function)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (baskets[j] != -1 && fruits[i] <= baskets[j]) {
                    allotted++;
                    baskets[j] = -1; // mark basket as used
                    break;
                }
            }
        }

        int unplacedFruits = n - allotted;
        System.out.println("Number of unplaced fruits: " + unplacedFruits);

        sc.close();
    }
}
