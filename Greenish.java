package field;
import java.util.*;
import java.math.*;
import java.lang.*;
import java.io.*;
public class Greenish {
    public static void main(String[] args) {

        System.out.println("ax2+bx+c=0");
        try {
            Scanner input=new Scanner(System.in);
            System.out.println("The value of a is : ");
            double a=input.nextDouble();
            System.out.println("The value of b is : ");
            double b=input.nextDouble();
            System.out.println("The value of c is : ");
            double c=input.nextDouble();
            double k1=(Math.pow(b,2)-(4*a*c));
            double k2=(2*a);
            double x1= ((-b)+Math.sqrt(k1))/k2;
            double x2= ((-b)-Math.sqrt(k1))/k2;
            if (k1>0||k1==0){

                System.out.println("One root is : "+x1);
                System.out.println("Another root is "+x2);
            }
            else {

                System.out.println("The roots are not real");
            }
        }

        catch (Exception e){

            System.out.println(e);
            System.out.println("Please try again!!!");
        }
        finally {
            System.out.println("Finished");
        }

    }
}
