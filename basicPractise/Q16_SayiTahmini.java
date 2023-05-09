package basicPractise;

import java.util.Random;
import java.util.Scanner;

public class Q16_SayiTahmini {
    public static void main(String[] args) {

        System.out.println("Hoşgeldiniz");

        Random r = new Random(100);
        int num = r.nextInt();
        int bul=num;
        System.out.println(num);

        Scanner scan =new Scanner(System.in);
        int count=1;
        num=1;

        do {
            if (count==1){
                System.out.println("Tahmin et");
            } else if (bul<num) System.out.println("Daha büyük");
            else System.out.println("Daha Küçük");
            count++;


        }while (num!=bul);
        System.out.println();
    }
}
