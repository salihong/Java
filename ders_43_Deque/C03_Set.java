package ders_43_Deque;

import java.util.HashSet;
import java.util.Set;

public class C03_Set {
    public static void main(String[] args) {
        // verilen arrayin tekrar eden elementlerini silip bir kez kullanılan hale getirin

        int[]arr={6,4,3,2,3,5,6,4,3,2,4,6,3,1,2,4,5,5,1};
        Set<Integer> geciciSet=new HashSet<>();

        for (Integer each:arr
             ) {geciciSet.add(each);

        }
            int[] geciciArr=new int[geciciSet.size()];

        int index=0;
        for (Integer each:geciciSet){
                geciciArr[index]=each;
                index++;

    }
        arr=geciciArr;
        System.out.println(arr.toString());
    }
}
