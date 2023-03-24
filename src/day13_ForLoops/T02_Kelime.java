package day13_ForLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class T02_Kelime {
    public static void main(String[] args) {
        //Kullanıcıdan bir kelime alın ve kaç defa yazdırmak istediğini
        //sorun . Kullanıcıdan aldığınız kelimeyi kullanıcının istediği kadar
        //ekrana yazdırın.

        Scanner scan= new Scanner(System.in);
        System.out.print ("Lütfen bir kelime giriniz: ");
        String kelime=scan.next();
        System.out.print ("Seçmiş olduğunuz kelimenin kaç kere yazılmasını istiyorsunuz:");
        int tekerrür= scan.nextInt();

        for (int i=1; i<=tekerrür; i++ ){

            System.out.println (kelime);
        }





    }
}
