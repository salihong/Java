package ders_47_MapsMetodlari;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C06_TreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> mp1= new TreeMap<String, Integer>();

        mp1.put("A",5);
        mp1.put("H",3);
        mp1.put("C",7);
        mp1.put("T",3);
        mp1.put("F",8);
        System.out.println(mp1);
        System.out.println(mp1.tailMap("F"));
    }
}
