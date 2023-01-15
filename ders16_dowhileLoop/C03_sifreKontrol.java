package ders16_dowhileLoop;

import java.util.Scanner;

public class C03_sifreKontrol {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
            String sifre;
            int bayrak;
            boolean sifreDogruMu;

            do {
            System.out.println("Lutfen sifrenizi giriniz");
            sifre= scan.nextLine();
             bayrak=0;
                for (int i = 0; i <sifre.length() ; i++) {
                    if (sifre.charAt(i)>='a' && sifre.charAt(i)<='z'){
                        bayrak++;
                    }
                }
           if (bayrak==0){
               System.out.println("sifre kucuk harf icermelidir");
           }


        }while (bayrak!=4);
    }
}
