import java.util.Scanner;

public class LinearSearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[] = new int[7];
    for(int i=0;i<a.length;i++){
      a[i] = sc.nextInt();
    }
    System.out.println("Enter target value:");
    int n = sc.nextInt();
    for(int j=0;j<7;j++){
      if(a[j] == n){
        System.out.println("found");
      }
    }
    //sc.nextLine();
    //String name =  sc.nextLine();
    System.out.println(a);

  }
  
}
