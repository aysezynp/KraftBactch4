package day08_ScannerAndOperators;


import java.util.Scanner;

public class C07_ScannerTask2 {
    public static void main(String[] args) {
        //      Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
        //        Isminiz : Himmet
        //        Soyisminiz : Abi
        //        Yasiniz : 38
        //      Dogum Yeriniz: Kayseri
        //        Kaydiniz basariyla tamamlanmistir.

        Scanner scan= new Scanner (System.in);
        System.out.println ("Lütfen ismi giriniz:");
        String isim= scan.nextLine();
        System.out.println("Lütfen soyisminiz giriniz:");
        String soyİsim= scan.nextLine();
        System.out.println("Lütfen yaşınızı giriniz");
        int yas= scan.nextInt();
        scan.nextLine();
        System.out.println("Doğum yerinizi giriniz");
        String dogumYeri=  scan.nextLine();



       /* System.out.println("İsminiz:"+ isim);
        System.out.println("Soyisminiz:"+ soyİsim);
        System.out.println("Yasiniz:" + yas);
        System.out.println("Doğum yeriniz:"+dogumYeri);
        System.out.println("Kaydınız başarıyla tamamlanmıştır");*/

        System.out.print ("İsminiz:"+isim+"\nSoyisminiz:"+soyİsim+
                "\nYasiniz:"+yas+  "\nDoğum Yeriniz:"+ dogumYeri+ "\nKaydınız başarı ile tamamlanmıştır.");










    }
}
