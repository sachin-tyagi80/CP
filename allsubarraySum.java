import java.util.Scanner;

public class allsubarraySum {

    // Brute force function
    public static int subarraySum(int[] arr) {
        int n = arr.length;
        int totalSum = 0;

        // Start index of subarray
        for (int i = 0; i < n; i++) {
            int sum = 0;

            // End index of subarray
            for (int j = i; j < n; j++) {
                sum += arr[j];      // sum of current subarray
                totalSum += sum;    // add to total
            }
        }
        return totalSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call function
        int result = subarraySum(arr);

        // Output
        System.out.println("Sum of all subarrays = " + result);

        sc.close();
    }
}
