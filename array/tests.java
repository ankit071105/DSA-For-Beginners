public class tests {
    public static void main(String[] args) {
    // Q15
        int x=5;
int y=x++ + ++x + ++x;// y=5+7+8=> y =20
int z=--y + x++ + y++;//19+8+19 =>  z=46  , x=9
int p=z++ - (z%10) + (p=z); //z=47    -> 46-7+47 =86
System.out.println(x+" "+y+" "+z+" "+p);
    }
}
