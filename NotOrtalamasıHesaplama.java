package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int math , phys , chem , hist , music ;

        Scanner input = new Scanner(System.in);

        System.out.println("Your math grade: ");
        math = input.nextInt();

        System.out.println("Your physic grade: ");
        phys = input.nextInt();

        System.out.println("Your chemistry grade: ");
        chem = input.nextInt();

        System.out.println("Your history grade: ");
        hist = input.nextInt();

        System.out.println("Your music grade: ");
        music = input.nextInt();

        int sum = math + phys + chem + hist + music;
        double avgGrade = sum / 5 ;


        String b = (avgGrade >= 60 ) ? "You nailed it!" : "You failed :(" ;
        System.out.println(b);





    }
}
