import java.util.Scanner;

class BuySellStock2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take size of array
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        // Take prices input
        System.out.println("Enter stock prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int profit = 0;

        // Calculate maximum profit
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        // Output
        System.out.println("Maximum Profit: " + profit);

        sc.close();
    }
}
