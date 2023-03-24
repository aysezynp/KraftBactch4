package day12_SwitchCase;

import java.util.Scanner;

public class C03_IF_Else_Example {
    public static void main(String[] args) {
        //+,-,,/
        // 4 işlem yapacak şekilde bir hesap makinesi yapın
        // kullanıcıdan 2 sayı alın
        //yapmak istediği işlemi seçsin +,-,,/
        //hatalı işlem girişlerinde kullanıcıya uyarı verin
        //ekrana sonuç döndüren programı yazınız.
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayı seçiniz:");
        double sayi1=scan.nextDouble();
        System.out.print("Bir sayı seçiniz:");
        double sayi2=scan.nextDouble();
        System.out.println("Lütfen bir işlem seçiniz(+,-,*,/):");
        String islem=scan.next();

        if(islem.equals("toplama")){
            System.out.println(sayi1+sayi2);
        }else if(islem.equals("çıkarma")){
            System.out.println(sayi1-sayi2);
        }else if(islem.equals("çarpma")){
            System.out.println(sayi1*sayi2);}
        else if(islem.equals("bölme")){
            System.out.println(sayi1/sayi2);
        }else{
            System.out.println("Lütfen seçtiğiniz işlemi kontrol ediniz");}

















    }
}
