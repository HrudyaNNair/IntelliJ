import java.util.Scanner;
public class Demo {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            System.out.println("Enter element:");
            arr[i] = sc.nextInt();
        }
        int m = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int product = arr[i]* arr[j];
                for(int k =0; k<n;k++) {
                    if (arr[k]==product) {
                        if(product>m)
                            m = product;
                    }
                }
            }
        }
        System.out.println(m);



    }

}
