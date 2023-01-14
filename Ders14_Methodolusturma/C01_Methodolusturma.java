package Ders14_Methodolusturma;

import java.util.Scanner;

public class C01_Methodolusturma {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println(carpimMethodu(sayi1,sayi2));
        double carpimSonucu= carpimMethodu(sayi1,sayi2);

    }
    public static double carpimMethodu(double sayi1,double sayi2){
        System.out.println("carpim methodu calisti");
        return sayi2*sayi2;

    }

}
