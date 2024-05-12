public class Triangle01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                int sum=i+j;
                if(sum%2==0){
                    System.out.print(" 1 ");
                }else if(sum%2!=0){
                    System.out.print(" 0 "); 
                }

            }
            System.out.println();
        }
    }
}
