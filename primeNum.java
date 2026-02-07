import java.util.*;

public class primeNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number
        int n = sc.nextInt();

        // Check and print result
        System.out.println(check(n));

        sc.close();
    }

    static boolean check(int n) {

        // Edge cases: 0 and 1 are not prime
        if (n <= 1)
            return false;

        // Check from 2 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
