package ders22_arrayList;

public class C04_ForEachLoop {
    public static void main(String[] args) {
        int[]arr ={3,5,7,8,4,2,6,9,4,5};
        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>5){
                toplam+=arr[i] ;
            }


        }
        System.out.println("for loop ile :"+ toplam);

        for(int each:arr);
    }
}
