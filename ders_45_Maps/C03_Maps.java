package ders_45_Maps;

import ders_44_Maps.MapDepo;

import java.util.Map;

public class C03_Maps {
    public static void main(String[] args) {
             /* {101=Ali-Can-10-H-MF,
                102=Veli-Cem-11-M-Soz,
                103=Ali-Cem-11-H-TM,
                104=Ayse-Can-10-H-MF,
                105=Ayse-Cem-11-M-TM,
                106=Fatma-Han-10-K-Soz}
            */

        Map<Integer,String > ogrenciMap= MapDepo.ornekMapOlustur();

            ogrenciMap.put(101,"Adem");
           String subeAdi="H";

           MapDepo.ogrenciBilgileriYazdir(ogrenciMap,subeAdi);


            }


    }



