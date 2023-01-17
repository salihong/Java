package ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_Fibonacci {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();

        if (girilenSayi<0){
            System.out.println("0 den büyük girmelisin");

        }else if (girilenSayi==0){
            System.out.println("0 dan küçük fibanocci sayısı yoktur");
        }else if(girilenSayi==1){
            System.out.println("1 den küçük tek fibanoci vardır :0 ");
        }else{
            fibanocciSayilariyazdir(girilenSayi);
        }

    }

    private static void fibanocciSayilariyazdir(int girilenSayi) {
        List<Integer>fibonaccilistesi=new ArrayList<>();
        fibonaccilistesi.add(0);
        fibonaccilistesi.add(1);
        fibonaccilistesi.add(1);
        int yenifibonacciSayisi=0;
        int index=3;

        while (yenifibonacciSayisi<girilenSayi){
            yenifibonacciSayisi=fibonaccilistesi.get(index-2)+fibonaccilistesi.get(index-1);
            if(yenifibonacciSayisi<girilenSayi){
                fibonaccilistesi.add(yenifibonacciSayisi);
            }
            index++;
        }
        System.out.println(fibonaccilistesi);


    }
}
