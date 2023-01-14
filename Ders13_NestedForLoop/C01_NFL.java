package Ders13_NestedForLoop;

public class C01_NFL {
    public static void main(String[] args) {
        String input="Java ne kadar güzel";
        for (int i = input.length()-1; i>=0 ; i--) {
            System.out.print(input.charAt(i));
        }
    }
}
