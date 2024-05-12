// CHECK  IF AN ARRAY IS SORTED (STRICTLY INCREASING) //

// TIME COMPLEXITY :- O(N) N:-Array length

public class Q4 {
    
    public static boolean isSorted(int a[] , int i)
    {
        if(i==a.length-1)
        {
            return true;
        }
        if(a[i] <a[i+1])
        {
            return isSorted(a, i+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,5};
       System.out.println( isSorted(a, 0));

    }
}



