package ders20_MultidimensionalArrays;

public class C03_MDA_EnuzunKelime {
    public static void main(String[] args) {

        String[][] arr={{"ilker","Nesrin"},{"Hasan","Heysem","Adem,Yusuf Enes"}};
        String enUzunKelime=arr[0][0];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].length()> enUzunKelime.length()){
                    enUzunKelime=arr[i][j];

                }

            }

        }
        System.out.println("En uzun Kelime: "+ enUzunKelime);

    }
}
