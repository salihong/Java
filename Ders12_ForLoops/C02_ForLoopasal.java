package Ders12_ForLoops;

public class C02_ForLoopasal {
    public static void main(String[] args) {
       int sayi=4365589;
        boolean asalMi= false;

        for (int i = 2; i <=sayi-1 ; i++) {
            if (sayi%i==0){
                asalMi=true;
                break;

            }

        }System.out.println("Sayi asal sayi");
    }
}
