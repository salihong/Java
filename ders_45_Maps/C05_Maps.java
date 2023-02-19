package ders_45_Maps;

import ders_44_Maps.MapDepo;

import java.util.Map;

public class C05_Maps {
    public static void main(String[] args) {
        //isim soyisim numara yazdıralım
        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
        ogrenciMap.put(110,"Süleyman-Sah-11-T-MF");
        MapDepo.numaraIsimSoyisimYazdir(ogrenciMap);

    }
}
