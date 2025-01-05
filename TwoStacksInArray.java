class TwoStacks {
    private int[] arr; // Array to store elements
    private int top1; // Top pointer for Stack 1
    private int top2; // Top pointer for Stack 2
    private int size; // Size of the array

    // Constructor
    public TwoStacks(int size) {
        this.size = size;
        arr = new int[size];
        top1 = -1; // Stack 1 starts from the left
        top2 = size; // Stack 2 starts from the right
    }

    // Push to Stack 1
    public void push1(int x) {
        if (top1 < top2 - 1) { // Check for available space
            arr[++top1] = x;
        } else {
            System.out.println("Stack Overflow in Stack 1");
        }
    }

    // Push to Stack 2
    public void push2(int x) {
        if (top1 < top2 - 1) { // Check for available space
            arr[--top2] = x;
        } else {
            System.out.println("Stack Overflow in Stack 2");
        }
    }

    // Pop from Stack 1
    public int pop1() {
        if (top1 >= 0) {
            return arr[top1--];
        } else {
            System.out.println("Stack Underflow in Stack 1");
            return -1; // Return -1 to indicate underflow
        }
    }

    // Pop from Stack 2
    public int pop2() {
        if (top2 < size) {
            return arr[top2++];
        } else {
            System.out.println("Stack Underflow in Stack 2");
            return -1; // Return -1 to indicate underflow
        }
    }

    // Display elements of Stack 1
    public void displayStack1() {
        System.out.print("Stack 1: ");
        for (int i = 0; i <= top1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Display elements of Stack 2
    public void displayStack2() {
        System.out.print("Stack 2: ");
        for (int i = size - 1; i >= top2; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class TwoStacksInArray {
    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(10);

        // Test Stack 1
        ts.push1(10);
        ts.push1(20);
        ts.push1(30);
        ts.displayStack1();

        // Test Stack 2
        ts.push2(40);
        ts.push2(50);
        ts.push2(60);
        ts.displayStack2();

        // Pop from Stack 1
        System.out.println("Popped from Stack 1: " + ts.pop1());
        ts.displayStack1();

        // Pop from Stack 2
        System.out.println("Popped from Stack 2: " + ts.pop2());
        ts.displayStack2();
    }
}
