import java.util.*;

public class transformedArray{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // size input lo
        int n = sc.nextInt();

        int[] nums = new int[n];
        int[] res = new int[n];

        // array input lo
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        // logic (without separate function)
        for(int i = 0; i < n; i++){
            int shift = nums[i] % n;

            int newIdx = (i + shift) % n;

            if(newIdx < 0){
                newIdx += n;
            }

            res[i] = nums[newIdx];
        }

        // output print karo
        for(int i = 0; i < n; i++){
            System.out.print(res[i] + " ");
        }

        sc.close();
    }
}
