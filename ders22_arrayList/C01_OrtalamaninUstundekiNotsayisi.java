package ders22_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_OrtalamaninUstundekiNotsayisi {
    public static void main(String[] args) {
       // List<Double> notlar=listeolustur();
       // System.out.println(notlar);
       // raporla(notlar);

        Scanner scan =new Scanner(System.in);
        Double girilenNot=(double)5;

        while(girilenNot>0){
            System.out.println("Lütfen Listeye eklemek için not giriniz"+"\nBitirmek için Q basınız");
            girilenNot= scan.nextDouble();
            if(girilenNot>0){
               // notlar.add(girilenNot);

            }

        }


    }public static void raporla(List<Double>notlar){
        int ogrencisayisi=notlar.size();
        double notlarToplami=0.0;
        double sinifNotOrtalamasi=0.0;
        int ortalamaUstündekiOgrenciSayisi=0;

    }
    //inifNotOrtalamasi=notlaToplami/ogrencisayisi;


}
