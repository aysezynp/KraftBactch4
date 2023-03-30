package day23_StringClass;

import java.util.Scanner;

public class T06_Index {
    public static void main(String[] args) {

        // Kullanıcıdan 2 kelime yazmasını isteyin ilk kelimenin baş harfi
        //2. kelimede varsa index ini alın

       /* Scanner scan = new Scanner(System.in);
        System.out.print("Kelime 1: ");
        String kelime1 = scan.nextLine();
        System.out.print("Kelime 2: ");
        String kelime2 = scan.nextLine();*/


        String kelime1 = "ayse";
        String kelime2 = "Sümeyra";
        boolean bl = kelime2.contains("a");
        if (bl) {
            System.out.println(kelime2.indexOf("kelime1.charAt(0)"));
        }

    }
    }




