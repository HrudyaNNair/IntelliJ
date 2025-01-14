import java.io.*;
import java.util.*;

public class Solution {

    public static int nearlyLucky(int[] Arr, int N) {
        int num = 0;  // To count the Nearly Lucky numbers

        for (int i = 0; i < N; i++) {
            int count = 0;  // Reset lucky digit count for each number
            int number = Math.abs(Arr[i]);  // Take absolute value to handle negatives

            // Count the lucky digits (3, 4, 7) in the current number
            while (number > 0) {
                int dig = number % 10;
                if (dig == 3 || dig == 4 || dig == 7) {
                    count++;
                }
                number /= 10;
            }

            // If the count of lucky digits is 3, 4, or 7, increment num
            if (count == 3 || count == 4 || count == 7) {
                num++;
            }
        }

        return num;  // Return the total count of Nearly Lucky numbers
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();  // Input the number of elements in the array
        int[] Arr = new int[N];

        // Input the numbers into the array
        for (int j = 0; j < N; j++) {
            Arr[j] = scan.nextInt();
        }

        // Calculate the result
        int result = nearlyLucky(Arr, N);

        // Output the result
        System.out.print(result);
    }
}
