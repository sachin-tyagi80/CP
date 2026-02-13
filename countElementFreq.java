import java.util.Scanner;

public class countElementFreq {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take size input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // take array input
        System.out.println("Enter array elements (0 to 100): ");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int[] freq = new int[101]; // because nums[i] <= 100

        // count frequency
        for(int i = 0; i < n; i++){
            freq[nums[i]]++;
        }

        // find max frequency
        int maxFreq = 0;
        for(int i = 0; i < 101; i++){
            if(freq[i] > maxFreq){
                maxFreq = freq[i];
            }
        }

        // sum frequencies equal to maxFreq
        int total = 0;
        for(int i = 0; i < 101; i++){
            if(freq[i] == maxFreq){
                total += freq[i];
            }
        }

        // output result
        System.out.println("Total frequency of max occurring elements: " + total);

        sc.close();
    }
}
