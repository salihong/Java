package ders_45_Maps;

import ders_44_Maps.MapDepo;

import java.util.List;
import java.util.Map;

public class C04_Maps {
    public static void main(String[] args) {
        //ogrenci mapinde numarası verilensayıların arasında olan isim soyisim ve bölümlerini yazdırın
        // isim soyisim bolümlerini list şeklinde biz döndürsüm

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
        ogrenciMap.put(107,"Tugay-Cil-12-K-MF");
        int basNo=103;
        int bitNo=107;

        List<String> isimListesi=MapDepo.numaraDegerineGoreListeOlustur(ogrenciMap,basNo,bitNo);
        System.out.println(isimListesi);
    }
}
