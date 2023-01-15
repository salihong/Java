package ders20_MultidimensionalArrays;

import java.util.Arrays;

public class C08_MDAsoru3 {
    public static void main(String[] args) {
        int[][]arr={{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        int[] output=new int[arr.length];
            int innerArrayToplami=0;
        for (int i = 0; i < arr.length; i++) {
            innerArrayToplami=0;
            for (int j = 0; j < arr[i].length; j++) {

                innerArrayToplami+=arr[i][j];

                }
                output[i]=innerArrayToplami;
            }

        System.out.println(Arrays.toString(output));
        }
    }
