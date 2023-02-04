package ders_35_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_Try_Catch {
     /* Kullanıcıdan istediği kadar sayı girmesini isteyip
        Girilen sayıları toplayın kullanıcının işlemi bitirmek için Q'ya basmasını isteyin Q'ya basıldığında
        toplam kaç sayı girdiğini  ve bu sayıların toplamının kac  oldugunu yazdırın
         */
     public static void main(String[] args) {

         Scanner scan =new Scanner(System.in);
         double girilenSayi=0;
         double sayilarintoplami=0;
         boolean devam=true;
         int sayac=0;

            while(devam){
         System.out.println("Toplanmak üzere Lütfen sayilaı giriniz.\nBitirmek için Q'ya basınız");

                try {
                    girilenSayi= scan.nextDouble();
                    sayilarintoplami+=girilenSayi;
                     sayac ++;


                } catch (InputMismatchException e) {
                  String str = scan.next();
                  if (str.equalsIgnoreCase("q"));

                break;
                }

                }
         System.out.println("Girilen " +sayac +"  sayınin toplami : "+ sayilarintoplami);


     }


}
