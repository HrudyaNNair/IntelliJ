import java.util.LinkedList;

class DoublyLinkedListNode {
    int data;
    DoublyLinkedListNode prev, next;

    public DoublyLinkedListNode(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}

class DoublyLinkedList {
    private DoublyLinkedListNode head;

    public void add(int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        DoublyLinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    public void display() {
        DoublyLinkedListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class CircularLinkedListNode {
    int data;
    CircularLinkedListNode next;

    public CircularLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private CircularLinkedListNode head;

    public void add(int data) {
        CircularLinkedListNode newNode = new CircularLinkedListNode(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        CircularLinkedListNode current = head;
        while (current.next != head) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next = head;
    }

    public void display() {
        if (head == null) return;
        CircularLinkedListNode current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}

public class CollectionsDemo {
    public static void main(String[] args) {
        // Working with Arrays
        System.out.println("Array Example:");
        int[] array = {10, 20, 30, 40, 50};
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Working with LinkedList
        System.out.println("LinkedList Example:");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        for (int value : linkedList) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Working with Doubly Linked List
        System.out.println("Doubly Linked List Example:");
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.add(10);
        doublyLinkedList.add(20);
        doublyLinkedList.add(30);
        doublyLinkedList.display();

        // Working with Circular Linked List
        System.out.println("Circular Linked List Example:");
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.add(10);
        circularLinkedList.add(20);
        circularLinkedList.add(30);
        circularLinkedList.display();
    }
}
