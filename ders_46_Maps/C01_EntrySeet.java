package ders_46_Maps;

import ders_44_Maps.MapDepo;

import javax.swing.*;
import java.util.Map;
import java.util.Set;

public class C01_EntrySeet {
    public static void main(String[] args) {
        //öğrenci mapinde sıralı olarak tüm öğrencilerin bölüm sınıf sube isim ve soyisim ve no yazdırın.

        Map<Integer,String > ogrenciMap= MapDepo.ornekMapOlustur();

        Set< Map.Entry<Integer,String>> ogrenciEntrySeti =ogrenciMap.entrySet();
        System.out.println(ogrenciEntrySeti);
        ogrenciMap.put(108,"Mehmet-Erkan-12-K-MF");
        //Entr set içindeki entryleri sıra numarası vererk yazdıralım
         int siraNo=1;


        for (Map.Entry<Integer,String >achEntry: ogrenciEntrySeti
        ){
             System.out.println(siraNo +"-   "+ achEntry);
             siraNo++;

            System.out.println(achEntry.getKey());

        }
        String entryValue;
        String[] entryValueArr;

        for (Map.Entry<Integer,String >achEntry: ogrenciEntrySeti
        ){
           entryValue= achEntry.getValue();
            entryValueArr=entryValue.split("-");

            if (entryValueArr[2].equals("12")){
                achEntry.setValue("Mezun oldu");
            }else {
                int sinif=Integer.parseInt(entryValueArr[2]);
                sinif++;
                entryValueArr[2]=sinif+"";
                achEntry.setValue(entryValueArr[0]+"-" +
                        entryValueArr[1]+"-"+
                        entryValueArr[2]+"-"
                        +entryValueArr[3]+"-"+
                        entryValueArr[4]);

        }
    }
        System.out.println(ogrenciMap);
}
}