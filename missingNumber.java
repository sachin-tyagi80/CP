import java.util.*;

public class missingNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements (n): ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int res = n;

        for (int i = 0; i < n; i++) {
            res += i - nums[i];
        }

        System.out.println("Missing Number is: " + res);

        sc.close();
    }
}
