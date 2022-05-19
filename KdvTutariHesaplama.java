package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen ürünün fiyatını giriniz : ");
        double kdvsizFiyat = scan.nextDouble();
        double kdvliFiyat = 0;
        double kdv = 0;
        if (kdvsizFiyat < 1000 && 0 < kdvsizFiyat){

            kdv = ((kdvsizFiyat * 18) / 100 );
            kdvliFiyat =  kdvsizFiyat + kdv;
            

        }
        else if (kdvsizFiyat >= 1000){

            kdv = ((kdvsizFiyat * 8) / 100 );
            kdvliFiyat =  kdvsizFiyat + kdv;

        }

        System.out.println("KDV tutarı : " + kdv + " TL");
        System.out.println("KDV'li fiyat : " + kdvliFiyat + " TL");
        
        
    }
}
