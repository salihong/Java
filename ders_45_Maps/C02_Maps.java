package ders_45_Maps;

import ders_44_Maps.MapDepo;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_Maps {
    public static void main(String[] args) {
        Map<Integer,String > ogrenciMap= MapDepo.ornekMapOlustur();

        Set<Integer>ogrenciKeySet=ogrenciMap.keySet();
        Collection<String>ogrenciValueCollection= ogrenciMap.values();
        System.out.println(ogrenciValueCollection);
    }
}
