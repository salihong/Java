package day_04;

import java.util.Scanner;

public class CumledeKelimeArama {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");

        String cumle= scan.nextLine();

        System.out.println("Aratmak istediğiniz kelimeyi giriniz");
        String kelime= scan.nextLine();
            int sayac=0;

            for (int i=0; i<=cumle.length()-kelime.length(); i++){
                if(cumle.substring(i,i+kelime.length()).equalsIgnoreCase(kelime)){
                    sayac++;
                }

               }
                System.out.println("Cümlenin içerisinde "+ sayac+ " kez geçmektedir");

        }

    }

