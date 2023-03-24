package day13_ForLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C02_If_Switch_Ternary {
    public static void main(String[] args) {
       /*Kullanicidan bir harf isteyin
        o harfle baslayan gun ismi varsa yazdirin
        yoksa "gecersiz harf" yazdirin*/

      Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir harf giriniz:");
        char harf=scan.next().charAt(0); //scanner sınııfı ile harf alamıyoruz, scan.next () String

if (harf=='p'||harf=='P'){
    System.out.println("Pazar,Pazartesi,Perşembe");
}else if (harf=='s'||harf=='S'){
    System.out.println("Salı");
}else if(harf=='c'||harf=='Ç'){
    System.out.println("Carşamba, Cuma,Cumartesi");}
else {
    System.out.println("Geçersiz harf");
}

        System.out.println(".....................................................");

switch(harf){
    case 'p','P':
        System.out.println("Pazar,Pazartesi,Perşembe");
        break;
    case 's','S':
        System.out.println("Sali");
        break;
    case 'c':
    case'C':
        System.out.println("Carşamba, Cuma,Cumartesi");
        break;
    default:
        System.out.println("Geçersiz harf");}

        System.out.println(".....................................................");

        String result=(harf=='p'||harf=='P')? "Pazar,Pazartesi,Perşembe":
                (harf=='s'||harf=='S')?"Sali":(harf=='c'||harf=='Ç')?"Carşamba, Cuma,Cumartesi":"Geçersiz harf";
        System.out.println(result);





    }
}
