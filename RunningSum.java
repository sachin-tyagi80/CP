import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        //System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        //System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Running sum logic
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }

        // Output result
        //System.out.println("");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
