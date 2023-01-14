package ders11_ForLoops;

public class C09_asalsayi {
    public static void main(String[] args) {
        int sayi= 130;
        int bayrak=0;

        for (int i = 2; i <sayi-1 ; i++) {
            if (sayi %i==0){
         bayrak++;
        }
            System.out.println(bayrak);
            if (bayrak==0 ){
                System.out.println("asal sayi degil");
            }else {
                System.out.println("asal sayi");

}
}
    }
    }
