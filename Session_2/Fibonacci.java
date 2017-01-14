import java.util.Scanner;
 
public class Fibonacci
{
   /* 0,1,2,3,4,5,6, 7, 8 are the index numbers
    * 0,1,1,2,3,5,8,13,21 corresping fibonacci sequence
    */
   public static void main(String args[])
   {
      int n=1;
      int a=1;
      int b=1;
      int t;
      int i;
      System.out.println("Enter an integer 'n' to calculate the 'nth' fibonacci number");
      Scanner in = new Scanner(System.in);
 
      n = in.nextInt();
 
      if ( n == 0 )
         System.out.println(0);
      else if ( n==1 )
      {
         System.out.println(1);
      }
      else{
          for (i=0;i<n-1;i++){
              t=a;
              a=b;
              b=a+t;
            }
          System.out.println(a);       
        }
   }
}
