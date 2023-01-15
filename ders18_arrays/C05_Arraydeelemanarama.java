package ders18_arrays;

public class C05_Arraydeelemanarama {
    public static void main(String[] args) {
        int[]arr={1,2,4,5,3,6,7,4,2,3,5,1,3,2};

        int arananeleman=2;
        elemanAra(arr,arananeleman);

            }
    public static void elemanAra(int[]arr,int arananeleman){
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==arananeleman){
                sayac++;
            }

        } if (sayac==0){
            System.out.println("Aranan eleman yok");

        }else{
            System.out.println("Aranan  "+arananeleman+"  sayisi Array'de " + sayac+ " kere kullanılmış.");

    }

    }

    }

