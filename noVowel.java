import java.util.Scanner;
public class noVowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String line = sc.nextLine();
        StringBuilder res = new StringBuilder();
        String str = line.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            switch(c)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    break;
                default:
                    System.out.print(c);
            }

    }
}
}
