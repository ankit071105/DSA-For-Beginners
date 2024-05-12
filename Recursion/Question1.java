  

public class Question1 {
//   ##  PRINT NUMBERS FROM 5 TO 1. ##  //
    public static void printNum(int n)
    {
        if(n==0){
        return;
        }
        System.out.println(n);
        printNum(n-1);  // RECURSION
    }
    //   ##  PRINT NUMBERS FROM 1 TO 5.  ##  //
    public static void printNums(int m)
    {
        if(m==6){
        return;
        }
        System.out.println(m);
        printNums(m+1); // RECURSION
     
    }


//   ## MAIN METHOD ##  //
    public static void main(String[] args) {
        int n=5,m=1;
        
        printNum(n);
        System.out.println();
        printNums(m);
    }
}
