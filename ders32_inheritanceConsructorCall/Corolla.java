package ders32_inheritanceConsructorCall;

public class Corolla extends BToyota{

    Corolla(int pc){
        super(5);
    }
    Corolla(){

    };
    Corolla (String str){
        this();
        System.out.println("String parametreli...");
    }

    public static void main(String[] args) {
        Corolla corolla1=new Corolla();

        Corolla corolla3=new Corolla("ilker");

    }
}
