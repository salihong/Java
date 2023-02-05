package ders_37_CheckedException;

public class C04_ThrowKeyword {
    public static void main(String[] args) {

        String a= null;

        try{
            a.concat("b");

        }catch (NullPointerException e){
            a="a";
        }finally {
            System.out.println("c");
        }
    }


}
