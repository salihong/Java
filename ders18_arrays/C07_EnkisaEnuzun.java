package ders18_arrays;

public class C07_EnkisaEnuzun {
    public static void main(String[] args) {
        String[]arr={"Hasan","Adem","Şentürk","ömer Faruk"};
        enUzunEnkisaIsimleriYazdir(arr);


    }
    public static void enUzunEnkisaIsimleriYazdir(String[]arr){
        String enuzunKelime=arr[0];
        String enKisaKelime=arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > enuzunKelime.length()){
                 enuzunKelime=arr[i];

                }
            if(arr[i].length()<enKisaKelime.length()){
                enKisaKelime=arr[i];

            }

        } System.out.println("En uzun isim : "+enuzunKelime);
        System.out.println("En kısa isim : "+enKisaKelime);
    }
}
