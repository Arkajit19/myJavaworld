package field;
import java.util.*;
public class Panam {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number : ");
        double a=input.nextDouble();


        if (a>0){

            System.out.println("The number is positive");
        }
        else if (a==0){

            System.out.println("This is zero");
        }
        else {

            System.out.println("The number is negative");
        }
    }
}
