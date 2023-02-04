package ders_34_overriding_polimorfism;

public class BChild extends AParent{
    public void method1(){
        System.out.println("Child class method1");
    }
    public void method2(int a){
        System.out.println("Child class method2");
    }
    public void method2(String isim){
        System.out.println("Child class string parametreli method");
    }

    @Override
    public void method3() {
        super.method3();
    }
}
