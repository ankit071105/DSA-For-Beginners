
public class Question3 {
     //   ##  PRINT THE FIBONACCI SEQUENCE TILL Nth NUMBER ##  //
     public static void FIBONACCI(int a,int b,int n)
    {
        if( n==0)
        {
            return;
        }
          int c =a +b;
          System.out.print(c+" ");
            
          FIBONACCI(b, c ,n-1);
    }

        //   ##  MAIN METHOD  ##  //
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.println();
        System.out.print(a+" ");
        System.out.print(b+" ");
        int n=7;
        
        FIBONACCI(a, b, n-2);
        
    }
}
