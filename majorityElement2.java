import java.util.*;

public class majorityElement2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Using List instead of array
        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        Integer majority1 = null;
        Integer majority2 = null;
        int count1 = 0, count2 = 0;

        // Find candidates
        for (int num : nums) {

            if (majority1 != null && num == majority1) {
                count1++;
            }
            else if (majority2 != null && num == majority2) {
                count2++;
            }
            else if (count1 == 0) {
                majority1 = num;
                count1 = 1;
            }
            else if (count2 == 0) {
                majority2 = num;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        // Verify candidates
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == majority1)
                count1++;
            else if (num == majority2)
                count2++;
        }

        // Result List
        List<Integer> result = new ArrayList<>();

        if (count1 > n / 3)
            result.add(majority1);

        if (count2 > n / 3)
            result.add(majority2);

        // Print result
        System.out.println("Majority elements (> n/3): " + result);

        sc.close();
    }
}
