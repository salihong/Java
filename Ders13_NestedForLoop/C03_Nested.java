package Ders13_NestedForLoop;

public class C03_Nested {
    public static void main(String[] args) {
        // 1-4 sayılar için çarpım tablosu
        for (int i = 1; i <=99 ; i++) {
            for (int j = 1; j <=99 ; j++) {
                System.out.print(i*j +" ");
            } //aşağı inmek için hiçlik yazdırdık

            System.out.println("");
        }

    }

}
