package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int a = 0;
        int b = 0;
        double hypotenuse = 0;


        System.out.print("Value of first side of the triangle: ");

        a = scan.nextInt();
        System.out.print("Value of second side of the triangle: ");
        b = scan.nextInt();
        hypotenuse = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        if (Math.abs(a-b) > hypotenuse || Math.abs(a+b) < hypotenuse){
            System.out.println("It is not proper triangle change your values");
        }

        else if (Math.abs(hypotenuse-b) > a || Math.abs(hypotenuse+b) < a){
            System.out.println("It is not proper triangle change your values");
        }
        else if (Math.abs(hypotenuse-a) > b || Math.abs(a+hypotenuse) < b){
            System.out.println("It is not proper triangle change your values");
        }
        else{
            System.out.println(hypotenuse);
        }

        double u = (a+b+hypotenuse)/ 2;
        double area = Math.sqrt(u * (u-a) * (u-b) * (u-hypotenuse));
        System.out.println("Area: " + area);






    }
}
