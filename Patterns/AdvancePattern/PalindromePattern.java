public class PalindromePattern {
    public static void main(String[] args) {
    
        for(int i= 1; i <= 6; i++){


            // Spaces 

            for(int j= 1; j <=6-i;j++)
            {
               System.out.print("  ");
            }

            // 1st Half
            for(int j= i; j >=1;j--)
            {
               System.out.print(j+" ");
           
            }


// 2nd Half
            for(int j= 2; j <=i;j++)
            {
               System.out.print(j+" ");
           
            }
            System.out.println();
        }
    }
}
