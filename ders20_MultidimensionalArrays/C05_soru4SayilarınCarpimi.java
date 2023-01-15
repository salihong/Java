package ders20_MultidimensionalArrays;

public class C05_soru4SayilarınCarpimi {
    public static void main(String[] args) {

        int[][]arr={{5,7},{5,8,9},{0,1}};
            int carpim=1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpim*=arr[i][j];

            }


        }System.out.println(carpim);
    }

    }

