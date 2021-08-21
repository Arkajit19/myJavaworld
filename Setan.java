package cdm.local;
import java.util.*;
import java.math.*;
public class Setan {
    public static void main(String[] args) throws Exception {
       try {
           Scanner input=new Scanner(System.in);
           System.out.println("Please enter the number : ");
           int num1= input.nextByte();
           int  factorial= fact(num1);
           System.out.println("Factorial of the number is : "+factorial);
       }
        catch (Exception e){

            System.out.println("Please check again !!!");
        }
       finally {
           System.out.println("Finished");
       }
    }

    static int fact(int n){

        int output;
        if (n==0){
            return 1;
        }

        output=n*fact(n-1);
        return output;
    }
}
