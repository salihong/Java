package ders17_practice;

import java.util.Scanner;

public class DogumGunuKiyaslama {
    public static void main(String[] args) {
        System.out.println("Dogum gununuzu Yil/Ay/Gün olarak giriniz");
        Scanner scan= new Scanner(System.in);

        int yil1= scan.nextInt();
        int ay1= scan.nextInt();
        int gun1= scan.nextInt();

        System.out.println("Karşılastırmak istediğiniz ikinci doğum gününü giriniz");

        int yil2= scan.nextInt();
        int ay2=scan.nextInt();
        int gun2=scan.nextInt();

        if (yil1< yil2){
            System.out.println("ilk kişi daha yaslı");
        }else if(yil1>yil2){
                System.out.println("ikinci kişi daha yaslı");
        }else if(ay1<ay2){
            System.out.println("ilk kiş daha yaşlı");
        }else if (ay1>ay2){
            System.out.println("ikinci kişi daha yaşlıdır");

        } else if (gun1<gun2) {
            System.out.println("ilk büyük");
        } else if (gun1>gun2) {
            System.out.println("ikinci büyük");
        }else{
            System.out.println("ikisi eşit yaştadır");
        }
    }
}
