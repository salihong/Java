package ders_36_checkedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C01_IOExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis=new FileInputStream("src/ders_36_checkedExceptions/Deneme.txt");
       // FileOutputStream fos= new FileOutputStream(src/ders_36_checkedExceptions/Deneme.txt);
    }




}
