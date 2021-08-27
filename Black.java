package lit.votom;
import java.util.*;
public class Black {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Holi hl=new Holi();
        System.out.println("Enter number1 : ");
        double num1=input.nextDouble();
        System.out.println("Enter number2 : ");
        double num2=input.nextDouble();
        System.out.println("Enter number3 : ");
        double num3=input.nextDouble();
        hl.Gelam(num1,num2,num3);
    }
}
