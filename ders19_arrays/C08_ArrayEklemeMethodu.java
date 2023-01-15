package ders19_arrays;

import java.util.Arrays;

public class C08_ArrayEklemeMethodu {
    public static void main(String[] args) {

        int[]abc={3,5,8,9};
        int eklenecekSayi=1;
        abc=arrayeElemanEkleme(abc,eklenecekSayi);
        System.out.println(Arrays.toString(abc));
    }
    public static int [] arrayeElemanEkleme(int[]eklenecekArr,int ekleneceksayi){
        int[]yeniArray=new int[eklenecekArr.length+1];
        for (int i = 0; i < eklenecekArr.length; i++) {
            yeniArray[i]=eklenecekArr[i];

        }
        yeniArray[yeniArray.length-1]=ekleneceksayi;
        return yeniArray;
    }

}
