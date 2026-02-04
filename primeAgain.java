import java.util.*;

class primeAgain {

    // Check prime
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Check primatic number
    // Prime OR power of a prime (like 4, 9, 27)
    static boolean isPrimatic(int n) {
        if (isPrime(n)) return true;

        for (int p = 2; p * p <= n; p++) {
            if (isPrime(p)) {
                long val = p;
                while (val < n) {
                    val *= p;
                }
                if (val == n) return true;
            }
        }
        return false;
    }

    static void solve(int n) {

        // Case 1: n itself is primatic
        if (isPrimatic(n)) {
            System.out.println(1);
            return;
        }

        // Case 2: even number
        if (n % 2 == 0) {
            System.out.println(2);
            return;
        }

        // Case 3: odd number
        // try 2 + (n-2) OR 4 + (n-4)
        if (isPrimatic(n - 2) || isPrimatic(n - 4)) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            solve(N);
        }

        sc.close();
    }
}