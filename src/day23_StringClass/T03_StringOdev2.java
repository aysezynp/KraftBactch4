package day23_StringClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class T03_StringOdev2 {
    public static void main(String[] args) {
        // Kullanıcıdan 3 kelime alın ve length i uzun olandan kısa
        // olana hepsini birleştirin. Concat() kullanın. (Ödev)

        Scanner scan=new Scanner(System.in);
        System.out.print("Kelime 1: ");
        String kelime1= scan.nextLine();
        System.out.print("Kelime 2: ");
        String kelime2= scan.nextLine();
        System.out.print("Kelime 3: ");
        String kelime3= scan.nextLine();
        int kelime1length=kelime1.length();
        int kelime2length=kelime2.length();
        int kelime3length=kelime3.length();

        if(kelime1length>kelime2length&&kelime2length>kelime3length){
            System.out.println(kelime1.concat(" "+kelime2.concat(" "+kelime3)));

        }else if(kelime1length>kelime3length&&kelime3length>kelime2length){
            System.out.println(kelime1.concat(" "+kelime3.concat(" "+kelime2)));

        }else if(kelime2length>kelime1length&&kelime1length>kelime3length) {
            System.out.println(kelime2.concat(" "+kelime1.concat(" "+kelime3)));

        }else if(kelime2length>kelime3length&&kelime3length>kelime1length){
                System.out.println(kelime2.concat(" "+kelime3.concat(" "+kelime1)));

        }else if(kelime3length>kelime1length&&kelime1length>kelime2length){
            System.out.println(kelime3.concat(" "+kelime1.concat(" "+kelime2)));

        }else {
            System.out.println(kelime3.concat(" "+kelime2.concat(" "+kelime1)));

        }






    }

    }
