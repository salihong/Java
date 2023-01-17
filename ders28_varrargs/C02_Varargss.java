package ders28_varrargs;

public class C02_Varargss {
    public static void main(String[] args) {
        topla(9,7);
        topla(9,7,5);
        topla(5);
        topla(4,5,4,8,7,9,6,3);
    }
    private static void topla(int... sayilar) {
        int toplamSonucu=0;
        for (int each:sayilar) {
            toplamSonucu+=each;

        }

        System.out.println(" sayiların toplami :"+(toplamSonucu));

    }
}

        // bir methodta parametre sayısını sınırlandırmak istenmezsek standart bir variable yerine
    // vararrgs kullanırız. variables argüments demek. kaç elemanlıysa uygular

