import java.util.Arrays;
import java.util.Scanner;

public class rotationarray {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
          System.out.println();
          System.out.println();
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i; j++) {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp; 
            }
        }
          System.out.println(Arrays.toString(a));
        
    }
}
