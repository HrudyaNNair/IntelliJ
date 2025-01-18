import java.util.HashSet;
public class Hashset {
    public static void main(String [] args){
       HashSet<Integer> set = new HashSet<>();
       set.add(10);
       set.add(12);
       System.out.println(set.contains(10));
    }
}
