// PRINT A STRING IN REVERSE
 
// TIME COMPLEXITY :- O(N) N-> String Length
public class Q2 {
    public static void  Reverse(String a , int i)
    { 
     if(i==0)
     {  
         System.out.println(a.charAt(i));
        return ;
     }
   
       System.out.print(a.charAt(i));
       Reverse(a, i-1);
        
      
    }
    public static void main(String[] args) {
    System.out.println();
        String a ="abcd";
     Reverse(a, a.length()-1);
     System.out.println();
     System.out.println();
    }
}
