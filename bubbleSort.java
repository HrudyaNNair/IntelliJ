import java.util.Scanner;
public class bubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            System.out.println("Enter element: ");
            arr[i] = sc.nextInt();
        }
        //Sorting
        for (int i=0;i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
