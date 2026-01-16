import java.util.HashMap; // optimal approch//subarray sum equals k
import java.util.Scanner;

public class subarray {

    // Same logic as your Solution class
    public static int subarraySum(int[] nums, int k) {

        int n = nums.length;

        // Prefix sum array
        int[] ps = new int[n];

        // HashMap to store prefix sum frequencies
        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;

        // First prefix sum
        ps[0] = nums[0];

        // Build prefix sum array
        for (int i = 1; i < n; i++) {
            ps[i] = ps[i - 1] + nums[i];
        }

        // Traverse prefix sum array
        for (int j = 0; j < n; j++) {

            // Case 1: subarray starting from index 0
            if (ps[j] == k) {
                count++;
            }

            // Case 2: subarray ending at index j
            int val = ps[j] - k;
            if (map.containsKey(val)) {
                count += map.get(val);
            }

            // Store current prefix sum
            map.put(ps[j], map.getOrDefault(ps[j], 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        // Call function
        int result = subarraySum(nums, k);

        // Output
        System.out.println("Number of subarrays with sum " + k + " = " + result);

        sc.close();
    }
}
