import java.util.Scanner; // brute-force-apporach//subarray sum equals k

public class subarraySum {

    // Function to count subarrays with sum equal to k
    public static int arraySum(int[] nums, int k) {

        int n = nums.length;   // length of array
        int count = 0;         // count of valid subarrays

        // Starting index of subarray
        for (int i = 0; i < n; i++) {

            int sum = 0;       // reset sum for each start index

            // Ending index of subarray
            for (int j = i; j < n; j++) {

                sum += nums[j];   // add current element

                if (sum == k) {   // check condition
                    count++;
                }
            }
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
        int result = arraySum(nums, k);

        // Output
        System.out.println("Number of subarrays with sum " + k + " = " + result);

        sc.close();
    }
}
