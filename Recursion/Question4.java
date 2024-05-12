

public class Question4 {
  
     // PRINT  x ^ n  with normal height

     public static int Power(int x,int n)
     {
        if (x==0) {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
      int c=Power(x, n-1);
      int p = x* c;
      return p;

     }

       // PRINT  x ^ n  with logn height (Basic Binary Tree)
     public static int Powers(int x,int n)
     {
        if(n == 0)
        {
           return 1;
        }
        if(n == 1)
        {
            return 0;
        }
        if (n % 2 ==0) {
            return Power(x, n/2)*Power(x, n/2);
        }else{
            return Power(x, n/2)*Power(x, n/2) * x;
        }
       
     }


     // MAIN METHOD 

     public static void main(String[] args) {
        int x=2,n=5;
        int a=Power(x, n);
        System.out.println(a);
     }
}
