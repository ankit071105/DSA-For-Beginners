public class hollowRectangle {
    public static void main(String[] args) {
       int n=5,m=10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
             if(j==0 || j==m-1 || i==0 || i==n-1)
             {
                System.out.print("*");
             }else{
                System.out.print(" ");
             }
            }
            System.out.println();
        }
    }
}
