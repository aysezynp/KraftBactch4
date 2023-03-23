package day16_BranchingStatements;

import java.util.Scanner;

public class C05_toplama {
    public static void main(String[] args) {
        //Nested loop kullanarak kullanıcıdan hangi işlemi yapmak
// istediğini sorun. 1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış
// kullanıcının isteğine göre işlem yapın. Kullanıcının seçimine göre Girilen ekrandan
// 2 sayı alın ve işlemin sonucunu ekrana yazın çıkmak sonuç 0  devam etmek için 1 girmesini isteyin.
Scanner scan=new Scanner(System.in);
        while(true){
            System.out.print("1 Toplama, 2 çıkarma,3 çarpma, 4 çıkış =");
            int tercih_1= scan.nextInt();
            if(tercih_1==1) {
            while (true) {
            System.out.print("1.sayi: ");
            int x=scan.nextInt();
            System.out.print("2.sayi: ");
            int y= scan.nextInt();
            System.out.println("Sonuç= "+(x+y));
            System.out.print("bir üst menü için 0 işleme devam etmek için 1 basınız: ");
            int tercih_2= scan.nextInt();
            if(tercih_2==0){
                break;
            }else if (tercih_2==1){
                continue;
            }else{
                System.out.println("hatalı işlem nedeniyle çıkış yapılıyor");
            }
            }}else if(tercih_1==2) {
                while (true) {
                    System.out.print("1.sayi: ");
                    int x = scan.nextInt();
                    System.out.print("2.sayi: ");
                    int y = scan.nextInt();
                    System.out.println("Sonuç= " + (x - y));
                    System.out.print("Bir üst menü için 0 işleme devam etmek için 1 basınız: ");
                    int tercih_2 = scan.nextInt();
                    if (tercih_2 == 0) {
                        break;
                    } else if (tercih_2 == 1) {
                        continue;
                    } else {
                        System.out.println("hatalı işlem nedeniyle çıkış yapılıyor");
                        break;
                    }
                }
            }else if(tercih_1==3){
                while (true) {
                    System.out.print("1.sayi: ");
                    int x = scan.nextInt();
                    System.out.print("2.sayi: ");
                    int y = scan.nextInt();
                    System.out.println("Sonuç= " + (x*y));
                    System.out.print("bir üst menü için 0 işleme devam etmek için 1 basınız: ");
                    int tercih_2 = scan.nextInt();
                    if (tercih_2 == 0) {
                        break;
                    } else if (tercih_2 == 1) {
                        continue;
                    } else {
                        System.out.println("hatalı işlem nedeniyle çıkış yapılıyor");
                        break;
                    }
                }}else if(tercih_1==4){
                break;
                }else{
                System.out.println("hatalı işlem tekrar deneyiniz");
            }










































        }









































    }
}