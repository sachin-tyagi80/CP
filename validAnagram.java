import java.util.*; 

public class validAnagram { 
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in); 
        
        String a = sc.next(); 
        String b = sc.next(); 
        
        int f1[] = new int[26]; 
        for(char ch : a.toCharArray()) {
            f1[ch - 'a']++;
        }
        
        int f2[] = new int[26]; 
        for(char ch : b.toCharArray()) {
            f2[ch - 'a']++;
        }
        
        boolean ans = Arrays.equals(f1, f2); 
        
        System.out.println(ans); 
    } 
}
