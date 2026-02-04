import java.util.*;

class balancedParnthses {
    static void checkBalanced(String s) {

        int roundOpen = 0, roundClose = 0;
        int curlyOpen = 0, curlyClose = 0;
        int squareOpen = 0, squareClose = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') roundOpen++;
            else if (ch == ')') roundClose++;
            else if (ch == '{') curlyOpen++;
            else if (ch == '}') curlyClose++;
            else if (ch == '[') squareOpen++;
            else if (ch == ']') squareClose++;
        }

        if (roundOpen == roundClose &&
            curlyOpen == curlyClose &&
            squareOpen == squareClose) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        checkBalanced(s);
        sc.close();
    }
}