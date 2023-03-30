package day23_StringClass;

import java.util.Scanner;

public class T01_KarakterSayisi {

    public static void main(String[] args) {
       karakterYazdirma();

    }
        public static void karakterYazdirma(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir mesaj yazınız: ");
        String message=scan.nextLine();
        int messagelength= message.length();
        for(int i=0; i<=(messagelength-1); i++){
            System.out.println(message.charAt(i));
            }
    }

            // soru1: Konsoldan kullanıcıdan bir mesaj alın ve method onun karakter sayısını versin.
            // soru 4: Aldığınız mesajın son index ini yazdırın

            public static void karakterSayisi(){
                Scanner scan=new Scanner(System.in);
                System.out.print("Lütfen bir mesaj yazınız: ");
                String message=scan.nextLine();
                System.out.println("message.length() = " + message.length());
                System.out.println("Mesajın son indeksi= " + message.charAt(message.length()-1));
            }


    }


