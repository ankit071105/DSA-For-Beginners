  // ## Find first & last occurrence of element ## //

  // TIME COMPLEXITY :- O(N)

public class Q3 {
    public static int first =-1;
    public static int last =-1;
    public static void findOccurance(String s, int i, char element)
    {
      if (i ==s.length()) {
        System.out.println("The First Occurenece of letter "+element+"  is  "+first);
        System.out.println("The Last Occurenece of letter "+element+"  is  "+last);
        return;
      }





        char current=s.charAt(i);
        if(current ==element)
        {
            if(first == -1)
            {
                first =i;

            }else{
                last =i;
            }
        }
findOccurance(s,i+1,element);
    }
    public static void main(String[] args) {
        String s="abahsuauidnaiaakijiuudybyanka";
        findOccurance(s, 0, 'a');
    }
}
