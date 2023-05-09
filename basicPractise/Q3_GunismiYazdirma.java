package basicPractise;

import java.util.Scanner;

public class Q3_GunismiYazdirma {
    /*    Kullanicidan gun ismini alin
    ve girilen gun ismine gore
    hafta ici veya hafta sonu yazdirin
         */
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
                System.out.println("Lütfen gün ismi giriniz:  ");
                String gunismi=scan.nextLine();
                gunismi=gunismi.toUpperCase();

                switch (gunismi){
                    case "pazartesi":System.out.println("Girdiğiniz gün haftaiçidir");
                    case "salı":System.out.println("Girdiğiniz gün haftaiçidir");
                    case "çarşamba":System.out.println("Girdiğiniz gün haftaiçidir");
                    case "perşembe":System.out.println("Girdiğiniz gün haftaiçidir");
                    case "cuma": System.out.println("Girdiğiniz gün haftaiçidir");
                    case "cumartesi":
                    case "pazar": System.out.println("Girdiğiniz gün hafta sonudur");

                    default:
                        System.out.println("yok");




                }

    }
}
