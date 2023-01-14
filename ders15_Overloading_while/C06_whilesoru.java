package ders15_Overloading_while;

import java.util.Scanner;

public class C06_whilesoru {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        boolean sifreGecerlimi= false;
        String sifre="";
        int bayrak=0;

                while(sifreGecerlimi!=true){
                    System.out.println("Lutfen Sifrenizi Giriniz");
                    sifre =scan.nextLine();
                     bayrak++;

                    if (!(sifre.charAt(0)>='a') && sifre.charAt(0)<='z'){
                        System.out.println("sifrenin ilk karakteri kucuk harf olmalı");
                        bayrak++;

                    }
                    if (!(sifre.charAt(sifre.length()-1)<='0')&& sifre.charAt(sifre.length()-1)<=-1){
                        System.out.println("sifrenin son carakteri sayi olmalı");
                        bayrak++;
                    }
                }
    }
}
