import java.util.*;

public class thirdMax {
    public static int maxiThird(int[] nums) {
        Long a = null, b = null, c = null;

        for (int n : nums) {

            // duplicate skip
            if ((a != null && n == a) ||
                (b != null && n == b) ||
                (c != null && n == c)) {
                continue;
            }

            if (a == null || n > a) {
                c = b;
                b = a;
                a = (long) n;
            } 
            else if (b == null || n > b) {
                c = b;
                b = (long) n;
            } 
            else if (c == null || n > c) {
                c = (long) n;
            }
        }

        return c == null ? a.intValue() : c.intValue();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array size input
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // array elements input
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // function call
        int result = maxiThird(nums);

        // output
        System.out.println("Third Maximum = " + result);

        sc.close();
    }
}
