public class FloydsTriangle {
public static void main(String[] args) {
     int c=1;
    for (int i = 0; i < 6; i++) {
        for (int j= i; j > 0; j--) {
           System.out.print(c+" ");
           c++;
        }
        System.out.println();
    }
}
    
}