package ders_46_Maps;

import ders_44_Maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {

        Map<Integer,String >ogrenciMapi= MapDepo.ornekMapOlustur();
        ogrenciMapi.put(109,"Adem-Demir-11-D-Soz");
        //Soz,11,D,Adem Demir,109 formatta Strin oluşturup treesete atalım

        Set<String>siraliOgrenciListesi=MapDepo.siraliOgrenciListesiOlustur(ogrenciMapi);
        System.out.println(siraliOgrenciListesi);
    }
}
