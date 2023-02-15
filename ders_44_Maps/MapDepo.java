package ders_44_Maps;

import java.util.*;

public class MapDepo {
    // ogrenci map olusturup bize donduren bir method olusturun
    public static Map<Integer, String> ornekMapOlustur(){
        Map<Integer,String> ogrenciMap= new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-11-M-Soz");
        ogrenciMap.put(103,"Ali-Cem-11-H-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Ayse-Cem-11-M-TM");
        ogrenciMap.put(106,"Fatma-Han-10-K-Soz");
        return ogrenciMap;
    }
    public static String isimSoyisimDondur(Map<Integer, String> ogrenciMap, int ogrenciKey) {
        String ogrenciValue= ogrenciMap.get(ogrenciKey); // "Ayse-Cem-11-M-TM"
        String[] valueArr=ogrenciValue.split("-"); // [Ayse, Cem, 11, M, TM]
        String isimSoyisim= valueArr[0]+" "+valueArr[1]; // Ayse Cem
        return isimSoyisim;
    }
    public static Map<Integer, String> ogrenciyeYeniSubeAta(Map<Integer, String> ogrenciMap, int ogrenciKey,String yeniSube) {
        // ogrenci key map'de var mi ? 104
        if (ogrenciMap.containsKey(ogrenciKey)) {
            // istenen Key varsa, update edip yeni map'i dondurecegiz
            String istenenKeyinValuesu = ogrenciMap.get(ogrenciKey); // Ayse-Can-10-H-MF
            String[] istenenKeyvalueArr = istenenKeyinValuesu.split("-"); // [Ayse, Can, 10, H , MF]
            // yeni sube degerini atayalim
            istenenKeyvalueArr[3] = yeniSube; // // [Ayse, Can, 10, K , MF]
            String istenenKeyinYeniValesu = istenenKeyvalueArr[0] + "-" +
                    istenenKeyvalueArr[1] + "-" +
                    istenenKeyvalueArr[2] + "-" +
                    istenenKeyvalueArr[3] + "-" +
                    istenenKeyvalueArr[4];
            ogrenciMap.put(ogrenciKey, istenenKeyinYeniValesu);
        }
        return ogrenciMap;
    }


    public static void ogrenciBilgileriYazdir(Map<Integer, String> ogrenciMap, String subeAdi) {


    }

    public static List<String> numaraDegerineGoreListeOlustur(Map<Integer, String> ogrenciMap, int basNo, int bitNo) {
        Set<Integer>ogrenciKeySeti =ogrenciMap.keySet();
                Collection<String >ogrenciValueColl =ogrenciMap.values();
                ArrayList<String> isimListesi=new ArrayList<>();
                    String value;
                    String[] valueArr;
        for (Integer eachKey: ogrenciKeySeti
             ) {
            if (basNo<=eachKey&& eachKey>=bitNo){
                value=ogrenciMap.get(eachKey);
                valueArr=value.split("-");
                String istenenIsim = valueArr[0] + " " + valueArr[1] + " " + valueArr[2];
            }

        }
        return isimListesi;
    }

    public static void numaraIsimSoyisimYazdir(Map<Integer, String> ogrenciMap) {
        Set<Integer>keySeti=ogrenciMap.keySet();
         String value;
         String [] valueArr;
        for (Integer eachKey:keySeti
             ) {
            value=ogrenciMap.get(eachKey);
            valueArr=value.split("-");
            System.out.println(eachKey+" "+ valueArr[0]+" "+ valueArr[1]);

        }
            
        }

    public static Set<String> siraliOgrenciListesiOlustur(Map<Integer, String> ogrenciMapi) {
        Set<String >siraliOgrenciListesi=new TreeSet<>();
        Set<Map.Entry<Integer,String >>ogrenciEntrySeti=ogrenciMapi.entrySet();

        String istenenBilgi;
        String value;
        String[] valueArr;
        for (Map.Entry<Integer,String >eachEntry : ogrenciEntrySeti
             ) {
           value=eachEntry.getValue();
           valueArr=value.split("-");

           istenenBilgi=valueArr[4]+ ", "+valueArr[2]+", "+valueArr[3]+", "+valueArr[0]+", "+ valueArr[1]+", "+
                   eachEntry.getKey();
           siraliOgrenciListesi.add(istenenBilgi);
        }


        return siraliOgrenciListesi;
    }

    public static Map<Integer, String> soyisimleriBuyukHarfYap(Map<Integer,String>ogrenciMapi) {

        String istenen;
        String value;
        String[] valueArr;
        int eachEntry;

        //for (Map.Entry<Integer,String >eachEntry: ogrenciEntrySeti
              {

        }
        return ogrenciMapi;
    }
}


