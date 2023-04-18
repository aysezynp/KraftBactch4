package day27_StringLab2;



import java.util.Scanner;

public class StringLab_soru21 {
    public static void main(String[] args) {
        System.out.println("kelimeKontrol() = " + kelimeKontrol());

    }

    //SORU 21: Kullanıcıdan 1 ila 4 harf olacak şekilde 2 kelime alın, 1. veya 2. kelimeyi
    //         girdiğinde hatalı giriş yaparsa uyarı verin ve kullanıcıya düzeltme imkanı verin.
    //         Her kelime için 3 kere hatalı giriş yaparsa programı sonlandırın. Kullanıcı doğru
    //         giriş yaparsa 2 kelimeyi arada boşluk olacak şekilde sadece concat() metodu ile
    //         birleştirerek yazdırın.

    /*public static void concatKelime() {
        int i = 0;
        System.out.println("Kelimeler 1 ila 4 harf olacak şekilde girilmelidir, 3 kere hatalı giriş yaparsanız program sonlanır");
        while(i<3) {
            Scanner scan = new Scanner(System.in);
            System.out.print("kelime1: ");
            String str1 = scan.nextLine();
            System.out.print("kelime2:");
            String str2 = scan.nextLine();
            if ((str1.length() <= 4 && str1.length() >= 1) && (str2.length() <= 4 && str2.length() >= 1)) {
                System.out.println(str1.concat(" ").concat(str2));
                break;
            } i++;
              if (i<3){
                  System.out.println("Lütfen tekrar deneyiniz");
            }

            if (i == 3) {
                System.out.println("!!!hatalı giriş");

            }

        }

    }*/

    public static String kelimeKontrol(){
        Scanner scan=new Scanner(System.in);
        String kelime1="";
        String kelime2="";
        int i=0;
        while(i<3) {
            System.out.print("kelime 1:");
            kelime1 = scan.nextLine();
            if (kelime1.length() > 0 && kelime1.length() < 5) {
                break;
            }
            System.out.println("Hatalı giriş, Lütfen tekrar deneyiniz");
            i++;
            if (i == 3) return null;
        }
        i=0;
        while(i<3) {
            System.out.print("kelime 2:");
            kelime2 = scan.nextLine();
            if (kelime2.length() > 0 && kelime2.length() < 5) {
                break;
            }
            System.out.println("Hatalı giriş, Lütfen tekrar deneyiniz");
            i++;
            if (i == 3) return null;
        }

    return kelime1.concat(" ").concat(kelime2);
    }







    }







































