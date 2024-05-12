import java.util.Scanner;

public class calendar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
          System.out.println();
            System.out.println(">>>>>>>> CALENDAR  2024 >>>>>>>>>");
             System.out.println("===========================");
              
             String a[][] ={ {" ","1 ","2 ","3 ","4 ","5  ","6"},
                        {"7 ","8 ","9 ","10 ","11","12","13"},
                        {"14","15","16","17","18","19","20"},
                        {"21","22","23","24","25","26","27"},
                        {"28","29","30","31"," "," "," "},
                              };
                               String e[][] ={ {" "," ","1 ","2 ","3 ","4  ","5 "},
                        {"6","7","8","9","10","11","12"},
                        {"13","14","15","16","17","18","19"},
                        {"20","21","22","23","24","25","26"},
                        {"27","28","29","30","31"," "," "},
                              };
                                          String f[][] ={ {" "," ","  ","  1 ","2 ","3  ","4 "},
                        { "5 ","6 ","7 ","8 ","9 ","10","11"},
                        {"12","13","14","15","16","17","18"},
                        {"19","20","21","22","23","24","25"},
                        {"26","27","28","29","30","31"," "},
                              };
               String b[][] ={ {" "," 1 ","2 ","3 ","4 ","5  ","6"},
                        {"7"," 8"," 9 ","10 ","11 ","12","13"},
                        {"14","15","16","17","18","19","20"},
                        {"21","22","23","24","25","26","27"},
                        {"28","29","30"," "," "," "," "},
                              };
          
                String c[][] ={ {" ","   ","  "," "," 1 "," 2"," 3",},
                        {"4 " ,"5 ","6 ","7 ","8 ","9 ","10"},
                        {"11","12","13","14","15","16","17"},
                        {"18","19","20","21","22","23","24"},
                        {"25","26","27","28","29"," "," "}};
          
                String d[][] ={ {" ","   ","  "," ","1 "," 2"," 3",},
                        {"4 " ,"5 ","6 ","7 ","8 ","9 ","10"},
                        {"11","12","13","14","15","16","17"},
                        {"18","19","20","21","22","23","24"},
                        {"25","26","27","28","29","30","31"}};
                             String g[][] ={ {" ","   "," "," "," ","    1"," 2 ",},
                        {"3 ","4 " ,"5 ","6 ","7  ","8 ","9 "},
                        {"10","11","12","13","14","15","16",},
                        {"17","18","19","20","21","22","23",},
                        {
                          "24","25","26","27","28","29","30"},
                        {"31"," "," "," "," "," "," "}}; 
          
                                           String h[][] ={ {" ","   "," "," "," ","    1"," 2 ",},
                        {"3 ","4 " ,"5 ","6 ","7  ","8 ","9 "},
                        {"10","11","12","13","14","15","16",},
                        {"17","18","19","20","21","22","23",},
                        {
                          "24","25","26","27","28","29","30"},
                    }; 
          
                                           String m[][] ={ {" ","   "," "," "," ","   ","   1 ",},
                        {"2 ","3 ","4 " ,"5 ","6 ","7  ","8 ",},
                        {"9 ","10","11","12","13","14","15",},
                        {"16","17","18","19","20","21","22",},
                        {
                          "23","24","25","26","27","28","29"},
                        {"30"," "," "," "," "," "," "}}; 
          
          
          
                        
             String x[][] ={ {"1 ","2 ","3 ","4 ","5  ","6 ","7 "},
                        {"8","9","10","11","12","13","14"},
                        {"15","16","17","18","19","20","21"},
                        {"22","23","24","25","26","27","28"},
                        {"29","30","31"," "," "," "," "},
                              };
                                        
             String y[][] ={ {"1 ","2 ","3 ","4 ","5  ","6 ","7 "},
                        {"8","9","10","11","12","13","14"},
                        {"15","16","17","18","19","20","21"},
                        {"22","23","24","25","26","27","28"},
                        {"29","30"," "," "," "," "," "},
                              };
                                  
            
             System.out.println("Enter the Montn You Want to see the Calendar to Last");
             System.out.println("==============================================");
             System.out.println();
                  int day = sc.nextInt();
          
              
          
                  switch (day) {
                    case 1:
                      System.out.println("Januaray");
                            System.out.println("---------------------");
                      System.out.println("S M T  W  Ts   F  S"); 
                      System.out.println();
                            for (int i =0 ; i<5;i++) {
                      for (int j =0; j<7;j++) {
                    
          
                          System.out.print(a[i][j]+" ");
                      }
                      System.out.println();
                  } System.out.println();
                      // break;
                    case 2:
                      System.out.println("February");     
                          System.out.println("---------------------");
               System.out.println("S  M  T  W  Ts  F  S  "); 
               System.out.println();
                            for (int i =0 ; i<5;i++) {
                      for (int j =0; j<7;j++) {
                    
          
                          System.out.print(c[i][j]+" ");
                      }
                      System.out.println();
                  } System.out.println();
                      // break;
                    case 3:
                      System.out.println("March");      
                        System.out.println("---------------------");
             System.out.println("S  M  T  W  Ts  F  S  "); 
              System.out.println();
                            for (int i =0 ; i<6;i++) {
                      for (int j =0; j<7;j++) {
                    
          
                          System.out.print(g[i][j]+" ");
                      }
                      System.out.println();
                  }
                   System.out.println();
                      // break;
                    case 4:
                      System.out.println("April");       
                       System.out.println("---------------------");
             System.out.println("S  M  T  W  Ts  F  S  ");
              System.out.println();
                            for (int i =0 ; i<5;i++) {
                      for (int j =0; j<7;j++) {
                    
          
                          System.out.print(b[i][j]+" ");
                      }
                      System.out.println();
                  } System.out.println();
                      // break;
                    case 5:
                      System.out.println("May");      
                          System.out.println("---------------------");     
                             System.out.println("S  M  T  W  Ts  F  S  ");  
                             System.out.println();
                            for (int i =0 ; i<5;i++) {
                      for (int j =0; j<7;j++) {
                    
          
                          System.out.print(f[i][j]+" ");
                      }
                      System.out.println();
                  } System.out.println();
                      // break;
                    case 6:
                      System.out.println("June");      
                           System.out.println("---------------------");   
                              System.out.println("S  M  T  W  Ts  F  S  ");
                               System.out.println();
                            for (int i =0 ; i<6;i++) {
                      for (int j =0; j<7;j++) {
                    
          
                          System.out.print(m[i][j]+" ");
                      }
                      System.out.println();
                  } System.out.println();
                      // break;
                    case 7:
                      System.out.println("July");     
                           System.out.println("---------------------"); 
                                System.out.println("S  M  T  W  Ts  F  S  "); 
                                 System.out.println();
                        for (int i =0 ; i<5;i++) {
                      for (int j =0; j<7;j++) {
                    
          
                          System.out.print(a[i][j]+" ");
                      }
                      System.out.println();
                  } System.out.println();
                      // break;
                        case 8:
                      System.out.println("August");     
                          System.out.println("---------------------"); 
                             System.out.println("S  M  T  W  Ts  F  S  "); 
                              System.out.println();
                        for (int i =0 ; i<5;i++) {
                      for (int j =0; j<7;j++) {
                    
          
                          System.out.print(d[i][j]+" ");
                      }
                      System.out.println();
                  } System.out.println();
                      // break;
                        case 9:
                      System.out.println("September");  
                              System.out.println("---------------------"); 
                                 System.out.println("S  M  T  W  Ts  F  S  "); 
                                  System.out.println();
                        for (int i =0 ; i<5;i++) {
                      for (int j =0; j<7;j++) {
                    
          
                          System.out.print(y[i][j]+" ");
                      }
                      System.out.println();
                  } System.out.println();
                      // break;
                        case 10:
                      System.out.println("October");   
                              System.out.println("---------------------");  
                                   System.out.println("S  M  T  W  Ts  F  S  "); 
                                   System.out.println();
                        for (int i =0 ; i<5;i++) {
                      for (int j =0; j<7;j++) {
                    
          
                          System.out.print(e[i][j]+" ");
                      }
                      System.out.println();
                  } System.out.println();
                      // break;
                        case 11:
                      System.out.println("November");  
                         System.out.println("---------------------");  
                            System.out.println("S  M  T  W  Ts  F  S  ");
                             System.out.println();
                        for (int i =0 ; i<5;i++) {
                      for (int j =0; j<7;j++) {
                    
          
                          System.out.print(h[i][j]+" ");
                      }
                      System.out.println();
                  } System.out.println();
                      // break;
                        case 12:
                      System.out.println("December");         
                        System.out.println("---------------------"); 
                          System.out.println("S  M  T  W  Ts  F  S  ");
                           System.out.println();
                        for (int i =0 ; i<5;i++) {
                      for (int j =0; j<7;j++) {
                    
          
                          System.out.print(x[i][j]+" ");
                      }
                      System.out.println();
                  } System.out.println();
                  break;
             
                      default:
                      System.out.println("Input Wrong Month");
                  }
        }
        
    }
}

