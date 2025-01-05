import java.util.Scanner;

public class binarySearch {

    // Recursive binary search method
    public boolean binaryS(int[] arr, int left, int right, int x) {
        if (left > right) {
            return false; // Element not found
        }

        int mid = left + (right - left) / 2; // Avoid overflow

        if (arr[mid] == x) {
            return true; // Element found
        } else if (x < arr[mid]) {
            return binaryS(arr, left, mid - 1, x); // Search in the left half
        } else {
            return binaryS(arr, mid + 1, right, x); // Search in the right half
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements in sorted order:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter search element: ");
        int x = sc.nextInt();

        binarySearch binarySearch = new binarySearch();
        boolean result = binarySearch.binaryS(arr, 0, n - 1, x);

        if (result) {
            System.out.println("Element found.");
        } else {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}
