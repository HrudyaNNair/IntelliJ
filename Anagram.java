import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String s3 = new String(arr1);
        String s4 = new String(arr2);
        System.out.println(s3.equals(s4)?"Anagram":"Not anagram");

    }
}
