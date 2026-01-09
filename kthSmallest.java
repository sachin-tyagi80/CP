import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Scanner;

public class kthSmallest {

    // Function to find kth smallest element
    public static int findSmallest(int[] arr, int k) {

        // Max Heap (largest element stays on top)
        PriorityQueue<Integer> heap =
                new PriorityQueue<>(Collections.reverseOrder());

        // Traverse array
        for (int n : arr) {
            heap.add(n);

            // If heap size exceeds k, remove largest element
            if (heap.size() > k) {
                heap.poll();
            }
        }

        // Top of heap is kth smallest element
        return heap.peek();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        // Call function
        int result = findSmallest(arr, k);

        // Output result
        System.out.println("Kth Smallest Element = " + result);

        sc.close();
    }
}
