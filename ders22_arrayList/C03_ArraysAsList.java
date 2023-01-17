package ders22_arrayList;

import java.util.Arrays;
import java.util.List;

public class C03_ArraysAsList {
    public static void main(String[] args) {
        Integer []arr={1,2,3};
        List<Integer>arraydenList= Arrays.asList(arr);
        System.out.println(arraydenList);

        arraydenList.remove(1);

    }
}
