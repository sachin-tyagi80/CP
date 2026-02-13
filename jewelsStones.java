import java.util.*;

public class jewelsStones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // user input
        System.out.print("Enter jewels string: ");
        String jewels = sc.next();

        System.out.print("Enter stones string: ");
        String stones = sc.next();

        // create HashMap
        HashMap<Character, Integer> map = new HashMap<>();

        // count frequency of stones
        for(int i = 0; i < stones.length(); i++){
            char ch = stones.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // calculate answer
        int ans = 0;
        for(int i = 0; i < jewels.length(); i++){
            char ch = jewels.charAt(i);
            if(map.containsKey(ch)){
                ans += map.get(ch);
            }
        }

        // output result
        System.out.println("Number of jewels in stones: " + ans);

        sc.close();
    }
}
