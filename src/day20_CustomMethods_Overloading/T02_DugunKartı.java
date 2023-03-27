package day20_CustomMethods_Overloading;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class T02_DugunKartı {

    public static void main(String[] args) {
        kelime();
    }
    public static void kelime() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz\nKelime 1:");
        String kelime1 = scan.nextLine();
        System.out.print("Lütfen bir kelime giriniz\nKelime 2:");
        String kelime2 = scan.nextLine();
           if(kelime1.equals(kelime2)) {
              tekrar();
           }else{
              kelime(kelime1,kelime2);
        }
    }
    public static void tekrar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Girdiğiniz kelimeler farklı olmalıydı, Lütfen tekrar giriniz:");
        System.out.print("Kelime 1:");
        String kelime1 = scan.nextLine();
        System.out.print("Kelime 2:");
        String kelime2 = scan.nextLine();
        System.out.println();
        System.out.println("**{ " +kelime1.toUpperCase()+" & "+kelime2.toUpperCase()+" }**");
    }
    public static void kelime(String kelime1,String kelime2){
        System.out.println();
        System.out.println("**{ " +kelime1.toUpperCase()+" & "+kelime2.toUpperCase()+" }**");

    }


}