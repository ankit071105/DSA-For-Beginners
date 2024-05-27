package LinkList.DoubleLinkList;
public class basic {
    Node head;
    Node tail;
    int length;
    class Node {
        int info;
        Node next;
        Node prev;

        Node(int info) {
            this.info = info;
            this.next = null;
            this.prev = null;
        }
    }
    // Basic Constructor
    public basic() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    // Checking if list is empty
    public boolean isEmpty() {
        return length == 0;
    }
    // Returning length of the list
    public int length() {
        return length;
    }
    // Displaying the Doubly Link-list
    public void display() {
        System.out.println();
        Node t = head;
        while (t != null) {
            System.out.print(t.info + " <--> ");
            t = t.next;
        }
        System.out.println("null");
        System.out.println();
    }
    public void append(int info) {
        Node c = new Node(info);
        if (isEmpty()) {
            head = c;
            tail = c;
        } else {
            tail.next = c;
            c.prev = tail;
            tail = c;
        }
        length++;
    }
     public static void main(String[] args) {
        basic obj = new basic();
        int[] elements = {10, 3, 5, 6, 7, 9, 12};
        for (int elem : elements) {
            obj.append(elem);
        }
        obj.display();
    }
}
