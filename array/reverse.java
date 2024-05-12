public class reverse {
       int n =5;
  void display(int arr[])
  {
     for (int i = 0; i< n; i++) { // O(N)
            System.out.println(arr[i]);//O(1)
        }
        System.out.println(); //O(1)
  }
       void reverses(int arr[])
   {
     for (int i = n-1; i>=0; i--) {// O(N)
            System.out.println(arr[i]);//O(1)
        }
   }
    public static void main(String[] args) {
        int a[] = {11,23,34,45,56};//O(1)
        reverse obj =new reverse();//O(1)
        obj.display(a);//O(1)
        obj.reverses(a);//O(1)
        }
        

    }
// time complexity :- O(N^N)