package ders_48_GenelTekrar;

import java.util.HashMap;
import java.util.Map;

public class C01_NestedMaps {
    public static void main(String[] args) {
        Map<String,String> kullaniciBilgileriMap=new HashMap<>();
        kullaniciBilgileriMap.put("İsim","Mehmet");
        kullaniciBilgileriMap.put("hesap turu","Mehmet");

        Map<String, Map<String, String>> hesapHareketleriMap=new HashMap<>();

        Map<String ,String>hesapHareketDetayiMap=new HashMap<>();
        hesapHareketleriMap.put("101",hesapHareketDetayiMap);
    }
}
