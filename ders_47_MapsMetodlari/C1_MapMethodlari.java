package ders_47_MapsMetodlari;

import java.util.HashMap;
import java.util.Map;

public class C1_MapMethodlari {
    public static void main(String[] args) {
        Map<String,Integer> mp1=new HashMap<>();

        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);

        System.out.println(mp1.putIfAbsent("B",9));
        System.out.println(mp1);

        System.out.println(mp1.putIfAbsent("D",15));

        Map<Integer,String> mp2=new HashMap<>();
        mp2.put(2,"S");
        System.out.println(mp2.putIfAbsent(3, "K"));
        System.out.println(mp2);

    }

}
