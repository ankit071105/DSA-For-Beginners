package LinkList.SinglyLinkList;

public class insetionLinkList {
     Node head;

    // Creating a class for LinkedList node
    class Node {
        int info;
        Node next;

        Node(int info) {
            this.info = info;
            this.next = null;
        }
    }

   
    public static void main(String[] args) {
        insetionLinkList obj = new insetionLinkList();
        obj.head = obj.new Node(10);
        Node second = obj.new Node(1);
        Node third = obj.new Node(8);
        Node fourth = obj.new Node(11);

        // Now we will connect them together
        obj.head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println();
        // Printing the Link List Given at first
        System.out.println("Printing the Link List Given at first");
        Node x = obj.head;
        while (x != null) {
            System.out.print(x.info + " -> ");
            x = x.next;
        }
        System.out.println("null");

System.out.println();
     // Printing the Link List Given at first
   System.out.println("Printing the  Link List after insetion the link list  at Beg");
        // Calling insetion at beginning of single Linked List
        obj.insertBeg(2);
        // Printing the single-linked list
        Node y = obj.head;
        while (y != null) {
            System.out.print(y.info + " -> ");
            y = y.next;
        }
        System.out.println("null");

              // Calling insetion at End of single Linked List
System.out.println();

     // Printing the Link List Given at End
   System.out.println("Printing the  Link List after insetion the link list  at End");
   obj.insertEnd(32);    
   Node z = obj.head;
        while (z != null) {
            System.out.print(z.info + " -> ");
            z = z.next;
        }
        System.out.println("null");

              // Calling insetion at Any of single Linked List
       obj.insertAny(22 , 4);
            // Printing the Link List Given at Any
       System.out.println("Printing the  Link List after insetion the link list  the position in between");
       obj.insertAny(49, 2);    
       Node a = obj.head;
            while (a != null) {
                System.out.print(a.info + " -> ");
                a = a.next;
            }
            System.out.println("null");
    



}

    // Insertion at beginning
    public void insertBeg(int v) {
        Node obj = new Node(v);
        obj.next = head;
        head = obj;
    }

    // Insertion at end
    public void insertEnd(int v) {
        Node obj = new Node(v);
        if (head == null) {
            head = obj;
            return;
        }
        Node c = head;
        while (c.next != null) {
            c = c.next;
        }
        c.next = obj;
    }

    // Insertion at any position
    public void insertAny(int v, int pos) {
        Node obj1 = new Node(v);
        if (pos == 1) {
            obj1.next = head;
            head = obj1;
            return;
        }
        Node pre = head; // Start pre from head
        int c = 1;
        while (c < pos - 1 && pre != null) { // Ensure pre does not become null
            pre = pre.next;
            c++;
        }
        if (pre != null) { // Ensure pre is valid
            Node curr = pre.next;
            obj1.next = curr;
            pre.next = obj1;
        }
    }
}
