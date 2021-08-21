package cdm.local;
import java.util.*;
import java.util.Scanner;

public class Sunset {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int a =input.nextInt();
        Risesun rs=new Risesun();
        System.out.println("Value of x for first method : "+rs.pool(a));
        int b =input.nextInt();
        System.out.println("Value of x for second method : "+rs.car(b));
    }
}
