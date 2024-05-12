public class Question2 {
    //   ##  SUM OF FIRST NATURAL NUMBER. ##  //
    public static void Sum( int i ,int n, int sum)
    {
        if (i==n) {
            sum +=i;  // ADDED LAST NUMBER :- 5
            System.out.println(sum);
            return;
        }
        sum +=i;                                        
        
        Sum(i+1,n, sum); // RECURSION
        
    }
 //   ##  Mulitiplication OF FIRST NATURAL NUMBER. ##  //
 public static void Multiply( int i ,int n, int mul)
 {
     if (i==n) {
        mul *=i;  // Multiply LAST NUMBER :- 5
         System.out.println(mul);
         return;
     }
     mul *=i;                                        
     
     Multiply(i+1,n, mul); // RECURSION
     
 }

   //   ##  PRINT FACTORIAL OF FIRST 5 Natural number NUMBER. ##  //
    public static int calcfact(int m)
    {
        if(m==1 || m==0)
        {
            return 1;
        }
        int c= calcfact(m-1);
        int fact= m * c;
        return fact;
    }

//   ## MAIN METHOD ##  //
public static void main(String[] args) {
 // FOR N NUMBER FACTORIAL VALUE IS
 for (int i = 1; i < 6; i++) {
    System.out.println(" The Factprial value of  "+i+" is "+calcfact(i));
 }
 
 
 
 System.out.println();
    Sum(1, 5, 0);
   
}

}
