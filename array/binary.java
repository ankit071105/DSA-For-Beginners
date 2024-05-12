import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();

        }
        int flag=0;
        int m=8;
        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++)
            {
            if(a[j]==m)
            {
              flag=1;
              break;
            }
        }
            if(flag==1)
            {
                System.out.println("The Number is founded "+i);
            }
        }

    }
}
