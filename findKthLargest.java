import java.util.PriorityQueue;
import java.util.Scanner;

public class findKthLargest {

    // Function to find kth largest element
    public static int kthLargest(int[] nums, int k) {

        // Min-Heap (smallest element stays on top)
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        // Traverse all elements of array
        for (int n : nums) {

            // Add current element to heap
            heap.add(n);

            // If heap size exceeds k, remove smallest element
            if (heap.size() > k) {
                heap.poll();
            }
        }

        // Top of heap is the kth largest element
        return heap.peek();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Read array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Read k
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        // Call function
        int result = kthLargest(nums, k);

        // Print result
        System.out.println("Kth Largest Element = " + result);

        sc.close();
    }
}
