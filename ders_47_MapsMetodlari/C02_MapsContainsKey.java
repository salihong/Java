package ders_47_MapsMetodlari;

import ders_44_Maps.MapDepo;

import java.util.Map;

public class C02_MapsContainsKey {
    public static void main(String[] args) {
        Map<Integer,String>ogrenciMap= MapDepo.ornekMapOlustur();

        System.out.println(ogrenciMap.containsKey(105));
        System.out.println(ogrenciMap.containsKey(111));

        System.out.println(ogrenciMap.containsValue("Fatma"));

    }


}
