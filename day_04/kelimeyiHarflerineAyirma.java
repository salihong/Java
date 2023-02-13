package day_04;

import java.util.Arrays;

public class kelimeyiHarflerineAyirma {
    public static void main(String[] args) {
       String name= "Veysel";
       charArray(name);



    }

    public static void charArray(String input){

        char[] output = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            output[i]= input.charAt(i);


        }
        System.out.println("Kelimenin harfleri Array'i : "+ Arrays.toString(output));

    }






}
