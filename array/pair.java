public class pair {
          String c ;    int n =4;
   void pairs(int arr[])
{
   
     for (int i = 0; i < n; i++) {
     
              System.out.println();
             for (int j = 1; j < n; j++) {
                c = arr[i]+""+arr[j]+" ";
              System.out.print(c);
             } 
}   
}
   public static void main(String[] args) {
        int a[] = { 1,3,4,5};
       pair obj = new pair();
       obj.pairs(a);
}

}
// TIME COMPLEXITY :- O(N ^ 2)