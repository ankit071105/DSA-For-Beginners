import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1;
        int temp=0;
        System.out.println("The Fibo Series is :-");
        for (int i = 0; i < 10; i++) {
            temp=b;
            b=a+b;
            a=temp;
            System.out.print(b+" ");
        }


     int p=0,q=1;
     System.out.println();
     for (int i = 0; i < 10; i++) {
        if (i %2==0) {
            p +=2;
            System.out.print(p+" + ");
        }else if (i % 2!=0) {
            q++;
            System.out.print(q+" - ");
        }
     }


     int r=27;
    int flag=0;
     for (int i = 2; i < r/2; i++) {
        if(r % i ==0){
          flag=1;
          break;
        }
   
     }
if(flag==0)
{
    System.out.println("prime Number");
}else{
    System.out.println("Not a prime Number"); 
}

    }
}
