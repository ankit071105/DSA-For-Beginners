package LinkList.SinglyLinkList;

public class sortingLinkList {
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
        sortingLinkList list = new sortingLinkList();
        list.head = null;
        list.insertSorted(5);
        list.insertSorted(3);
        list.insertSorted(8);
        list.insertSorted(1);

        list.printList(); 
    }

    public void insertSorted(int value) {
        Node obj = new Node(value);

        if (head == null || head.info >= obj.info) {
            obj.next = head;
            head = obj;
        } else {
            Node current = head;
            while (current.next != null && current.next.info < obj.info) {
                current = current.next;
            }
            obj.next = current.next;
            current.next = obj;
        }
    }
    public void printList() {
        Node t = head;
        while (t != null) {
            System.out.print(t.info + " -> ");
            t = t.next;
        }
        System.out.println();
    }
}
