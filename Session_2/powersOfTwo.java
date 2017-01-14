import java.lang.*;

public class powersOfTwo
{
    public static void main(String[] args)
    {   
        //Variables
        int num=2;
        int power=2;
        int i;
        for (i=0;i<=20;i++){
            if (i==0){
                num=0;
                System.out.println("2^0 = " + " " + num);  
            }
            else if (i==1){
                num=2;
                System.out.println("2^1 = " + " " + num);
            }
            else{
                //num is the current value
                num=num*power;
                System.out.println("2^" + i + " = " + num);
            }
        }
        
        //Using Math.pow method
        for (i=0;i<=20;i++){
            System.out.println(Math.pow(2,i));
        }
          
    }
}
