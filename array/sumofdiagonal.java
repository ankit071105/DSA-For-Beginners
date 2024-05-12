/*Write a function called middle that takes an array 
and returns a new array that contains all but the first and last elements. */

import java.util.Scanner;

public class sumofdiagonal {
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        int n= sc.nextInt();
         int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
        {
             a[i][j] = sc.nextInt();
          
        }
 }
        System.out.println();
        int t= 0;
          for(int i=0;i<n;i++)
        {
             for(int j=0;j<n;j++)
        {
             if (i==j) {
              t +=a[i][j];
             }
        }
  
 }
  System.out.println(t);
      }
    }

}
