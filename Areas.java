package com.fun;
import java.util.*;
public class Areas {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length : ");
        double l1=input.nextDouble();
        System.out.println("Enter the breath : ");
        double l2=input.nextDouble();
        System.out.println("Enter the radius :");
        double r1=input.nextDouble();
        Basicinfo shape;
        Rectangle rect=new Rectangle();
        shape=rect;
        shape.setLength(l1);
        shape.setBreath(l2);
        System.out.println("The area of the rectangle is : "+rect.getArea());
        Circle crl=new Circle();
        shape=crl;
        shape.setRadius(r1);
        System.out.println("The area of the circle is : "+crl.getArea());
    }
}
