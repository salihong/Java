package ders_38_abstraction;

public class BChild extends AParent{
    public static void main(String[] args) {

        /*
        Bir parent class'da child class'ların mutlaka override edeceği bir method olusturdugumuzda
        method body'si gereksizlerşir cünkü hiç çalışmayacaktır

        1- Abstract Parent class'dan obje oluşturulamayacağı için objeler için bu method kullanılamaz
        2-Chıld class'larda mecburen bu method'u override edeceklerinden, bu merhod'ların body'si asla
        KULLANILMAYACAKTIR.
        Java hiç kullanılmayacak bu method body'leri yazmamamıza imkan tanımıştır.

        Chıld class'ların mutlaka override etmesini istediğimiz method'ları abstract olarak tanımlar ve
        body'siz olarak oluştururuz.
         */

    }

}
