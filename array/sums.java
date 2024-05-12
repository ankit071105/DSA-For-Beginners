import java.util.Scanner;

public class sums {
    final double pi =  3.1416;// O(1)
    double cir= 0.0;// O(1)
    float area(double rad){// O(1)
        cir =2*pi*rad;// O(1)
        return (float) cir;// O(1)

    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the radius");// O(1)
        double rad = sc.nextDouble();// O(1)
        sums obj = new sums();// O(1)
        
      double c =  obj.area(rad);// O(1)
      System.out.println(c);// O(1)
        }
    }
}

// Time Complexity :- // O(1)

/* 
 1 O(N+P), where P< N/2
 => O(N)
2 O(2N)  // Constant is neglacted
 => O(N)
3 O(N +logN) // log N is neglacted
=> O(N)
4 O(N +NlogN) //log N can neglated but it will form 
=> O(NlogN)
5  O(N +M) // they are different so the cannot merge
=> O(NM)
*/

