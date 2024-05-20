package LinkList;

public class q1 {
    static Node head;
// Creating a class of LinkList
    class Node {
        int info;
        Node next;

        Node(int info) {
            this.info = info;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Creating the single-list 
        q1 obj = new q1();
        obj.head = obj.new Node(10);
        Node second = obj.new Node(1);
        Node third = obj.new Node(8);
        Node fourth = obj.new Node(11);

    // Now we will connect them together

        obj.head.next = second;
        second.next = third;
        third.next=fourth;

        // Calling insetion at begginning of single Link List
        obj.insert(78);
        obj.insert(98);
        // Calling insetion at end  of single Link List
        obj.End(48);
        obj.End(8);



        // Printing the  single-link list
        Node x = obj.head;
        while (x != null) {
            System.out.print(x.info + " -> ");
            x = x.next;
        }
        System.out.println("null");

        // Length of single Link List
         int c=0;
         Node b=head;
         while (x !=null) {
            c++;
            x=x.next;
         }
        System.out.println(c);
       


    }    
    // Insertion at begging 
        public void insert(int v)
        {
            Node obj=new Node(v);
            obj.next=head;
            head =obj;
        }

          // Insertion at End 
          public void End(int v)
          {
            Node obj=new Node(v);
            if(head ==null)
            {
                head=obj;
                return;
            }
              Node c=head;
             while (null != c.next) {
                c=c.next;
              }
              c.next=obj;
          }

           // Insertion at Any 
          
}
