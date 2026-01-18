import java.util.Scanner;

class subArrayRanges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            int min = nums[i];
            int max = nums[i];

            for (int j = i; j < n; j++) {
                if (nums[j] < min) min = nums[j];
                if (nums[j] > max) max = nums[j];

                ans += (max - min);
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
