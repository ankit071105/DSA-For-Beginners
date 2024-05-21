package LinkList.SinglyLinkList;

public class deletionLinkList {
    Node head;
    class Node {
        int info;
        Node next;

        Node(int info) {
            this.info = info;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        deletionLinkList obj = new deletionLinkList();
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
   System.out.println("Printing the  Link List after deleting the link list  at Beg");
        // Calling Deletion at beginning of single Linked List
        obj.deleteBeg();
        // Printing the single-linked list
        Node y = obj.head;
        while (y != null) {
            System.out.print(y.info + " -> ");
            y = y.next;
        }
        System.out.println("null");

              // Calling Deletion at End of single Linked List


System.out.println();

     // Printing the Link List Given at End
   System.out.println("Printing the  Link List after deleting the link list  at End");
   obj.deleteEnd();    
   Node z = obj.head;
        while (z != null) {
            System.out.print(z.info + " -> ");
            z = z.next;
        }
        System.out.println("null");

              // Calling Deletion at Any of single Linked List
       obj.deleteAny(2);
            // Printing the Link List Given at Any
       System.out.println("Printing the  Link List after deleting the link list  the position in between");
       obj.deleteEnd();    
       Node a = obj.head;
            while (a != null) {
                System.out.print(a.info + " -> ");
                a = a.next;
            }
            System.out.println("null");
    



}

 //    deleteBeg := Delete from Beginning
      public Node deleteBeg() {
        if(head == null)
        {
            return null;
        }
        Node t = head;
        head =head.next;
        t.next=null;
        return t;
      }
      //    deleteEnd := Delete from Delete any
      public Node deleteEnd() {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node curr = head;
        Node pre=null;
       while (curr.next != null) {
             pre=curr;
             curr=curr.next;
       }
       pre.next=null;
       return curr;
      }
      //  deleteAny := Delete from Any
      public  void  deleteAny(int pos) {
        if(pos==1)
        {
             head=head.next;
        }else
        {
        Node pre=head;
        int c=1;
       while ( c <  pos-1) {
             pre=pre.next;
            c++;
       }
    
      Node curr=pre.next;
       pre.next =curr.next;
    }
    }
}