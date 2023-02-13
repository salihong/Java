package day_04;

public class StringdekiSayilariTopla {
    public static void main(String[] args) {

        String kelime = "ade1r4d3";

        rakamlarToplami(kelime);

        }
        public static void rakamlarToplami(String  input){
            int toplam=0;

            for (int i = 0; i< input.length(); i++) {
                if (Character.isDigit(input.charAt(i))){
                    toplam+=Integer.valueOf(""+ input.charAt(i));
                }
            }
            System.out.println("Rakamların Toplamı : "+ toplam);

        }

      }

