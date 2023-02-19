package ders_47_MapsMetodlari;

import java.util.HashMap;
import java.util.Map;

public class C04_Soru {
    public static void main(String[] args) {
        //verilen bir Cümlede kullanılan karakterleri kaçar kere kullanıldığını yazdırın

        String str="Javayi balonu patlatmadan bitirelim";
        String[] strArr= str.split("");
        Map<String,Integer> kullanimMiktarlariMap=new HashMap<>();
        for (int i = 0; i < strArr.length; i++) {
            kullanimMiktarlariMap.computeIfPresent(strArr[i],(k,v)->v+1);
            kullanimMiktarlariMap.putIfAbsent(strArr[i],1);
           //

        }
        System.out.println(kullanimMiktarlariMap);
    }
}
