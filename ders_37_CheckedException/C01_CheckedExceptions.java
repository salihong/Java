package ders_37_CheckedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;

public class C01_CheckedExceptions {
    public static void main(String[] args) throws IOException {
        String dosyayolu="src/ders_36_checkedExceptions/Deneme.txt";
        try {

            FileInputStream fis= new FileInputStream(dosyayolu);
            int k=0;

            while((k=fis.read())!=-1) System.out.print((char)k);

        } catch (FileNotFoundException e) {
            System.out.println("Dosya yolu yanlıs veya dosya arizali");

        } catch (IOException e){
            System.out.println("Dosya okuma veya yazma ile ilgili bir sorun var");
        }


    }
}
