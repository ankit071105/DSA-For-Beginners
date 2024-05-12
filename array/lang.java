import java.util.Scanner;

public class lang {
    public static void main(String[] args) {
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                int x = a + (int)(a+(b-a+1)*Math.random());
                int y = a + (int)(a+(b-a+1)*Math.random());
                int roll = x + y ; 
                System.out.println("Sum of two random integers between 1&6is "+roll);
        }

    }

