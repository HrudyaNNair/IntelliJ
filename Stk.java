import java.util.Stack;
public class Stk {
    public static  void main(String[] args){
        Stack<Integer> stack = new Stack();
        stack.push(10);
        stack.push(1);
        stack.push(30);
        stack.push(100);
        stack.push(101);
        while ((stack.size()>0))
                System.out.println(stack.pop());

    }
}
