package ders_35_exceptions;

import java.util.Scanner;

public class C02_ArithmeticException {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=0;
        try {
            System.out.println(sayi1/sayi2);
            System.out.println("Bakalım satır çalışacak mı?");
            System.out.println("Bana ne exceptiondan");
        } catch (ArithmeticException e) {
            System.out.println("Sayi sıfıra bölünemez");

        }

    }



}

