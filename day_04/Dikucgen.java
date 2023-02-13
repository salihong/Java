package day_04;

import java.util.Scanner;

public class Dikucgen {
    public static void main(String[] args) {


        int[] kenarlar=new int[3];

        Scanner scan =new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            System.out.println(i+1 + ". Lütfen  kenarı giriniz");
            kenarlar[i] = scan.nextInt();
        }

        if(Math.pow(kenarlar[0],2)+ Math.pow(kenarlar[1],2)==Math.pow(kenarlar[2],2)||
            Math.pow(kenarlar[1],2)+ Math.pow(kenarlar[2],2)==Math.pow(kenarlar[0],2)||
             Math.pow(kenarlar[2],2)+ Math.pow(kenarlar[0],2)==Math.pow(kenarlar[1],2))
        {
        System.out.println("Bu bir dik üçgendir");

        }else System.out.println("Bu bir dik üçgen değildir");


    }

}
