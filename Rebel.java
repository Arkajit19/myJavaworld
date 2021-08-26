package com.fun;
import java.util.*;
public class Rebel {
    public static void main(String[] args) {
        Amal aml=new Amal();
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number");
        int a=input.nextInt();

            if (aml.isArmstrong(a)){

                System.out.println("This is an Armstrong number");

            }
            else {

                System.out.println("This is not an Armstrong");
            }
        }

    }

