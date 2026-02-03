import java.util.*;

class sortbyparity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Input array
        for (int k = 0; k < n; k++) {
            nums[k] = sc.nextInt();
        }

        int i = 0; // even index
        int j = 1; // odd index

        while (i < n && j < n) {
            if (nums[i] % 2 == 0) {
                i += 2;
            } else if (nums[j] % 2 == 1) {
                j += 2;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i += 2;
                j += 2;
            }
        }

        // Output
        for (int k = 0; k < n; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}
