public class test {

        public static void  main(String[]  args)  {
           //Q3
            int a=2,b=5,c;
            a=a*a++ - --a; // a=2*2-2 =2
            c=b++ - b--;  //c=  5 -6 = -1
            System.out.println("a="+a+",b="+b+",c="+c); 
            System.out.println(a++ + ++a * a--); //2+4*4 =18 _  // a=3
            System.out.println(b=b++ * b--); //5*6 =30
            System.out.println("a="+a+",b="+b+",c="+c); // 2 , 30 ,-1
         
       
      
            
            //Q4
            System.out.print(011+ 1.94 + "C" + "S");

           // Q5
            System.out.println(2+3+"bc"+'c'+'a'); 
            System.out.println('c'+'a'+2+3+"bc"); 
            System.out.println("bc"+'c'+'a'+2+3);
             System.out.println("bc"+('c'+'a')+(2)+3);

             //Q6
             int x = - 4;
     System.out.println(x>>1);
     int y = 4;
     System.out.println(y>>1);

     //Q7
     System.out.println(10 + 15 + "Hello");
     System.out.println("Hello" + 10 + 15);

     //Q8

     byte bb = 10;
     bb = (byte) (bb + 10);
     System.out.println(bb);


     // Q9
     int i = 4;
     int j = 21;
     int k = ++i * 7 + 2 - j--; // 5*7 +2-21=37-21 = 16
     System.out.println("k = " + k);
     
     // Q11
     int xx=-5;
      System.out.println(~xx);
      //Q12
      int xxx=Integer.MAX_VALUE; 
      System.out.println(xxx>>28);
      //Q13
      int xy=10,yx=5; System.out.println(xy++^++yx|(xy=yx)&101);

      //Q14
      int xxy=-4,yyx=4;
      System.out.println((xxy>>>30)+" "+(xxy>>30)+" "+ (yyx>>1));
   } }

