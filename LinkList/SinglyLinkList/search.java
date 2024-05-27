package LinkList.SinglyLinkList;

public class search {
    static Node head;

    class Node {
        int info;
        Node next;

        Node(int info) {
            this.info = info;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        search obj = new search();
        obj.head = obj.new Node(30);
        Node second = obj.new Node(1);
        Node third = obj.new Node(8);
        Node fourth = obj.new Node(11);
        Node fifth = obj.new Node(10);
        obj.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        System.out.println("Printing the Link List Given at first");
        Node x = obj.head;
        while (x != null) {
            System.out.print(x.info + " -> ");
            x = x.next;
        }
        System.out.println("null");
        System.out.println();

        if (obj.find(obj.head, 10)) {
            System.out.println("Key Found");
        } else {
            System.out.println("Key Not Found");
        }

        Node r = obj.Reverse(obj.head);
        System.out.println("Printing the Reversed Link List");
        x = r;
        while (x != null) {
            System.out.print(x.info + " -> ");
            x = x.next;
        }
        System.out.println("null");
    }

    // SEARCHING
    public boolean find(Node head, int searchKey) {
        if (head == null) {
            return false;
        }
        Node current = head;
        while (current != null) {
            if (current.info == searchKey) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // REVERSING
    public Node Reverse(Node head) {
        if (head == null) {
            return head;
        }
        Node c = head;
        Node p = null;
        Node next = null;
        while (c != null) {
            next = c.next;
            c.next = p;
            p = c;
            c = next;
        }
        return p;
    }
}
