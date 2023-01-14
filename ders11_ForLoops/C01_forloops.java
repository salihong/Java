package ders11_ForLoops;

public class C01_forloops {
    public static void main(String[] args) {
        String str="Jawa\n";
        System.out.println(str.repeat(5));

        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
            // 2 basamaklı sayılardan 7 ile bölünebilenleri yan yana yazdırın
            for (int j = 10; j <100 ; j++) {
                if (j%7==0);
                System.out.println(j+" ");

            }


        }
    }
}
