package exercise;

import java.util.Scanner;

public class ternaru {
    public static void main(String[] args) {
     /*   int n=6;
     String result= (n%2==0)?"Çift sayı":"Tek sayı";
        System.out.println(result);

// Soru: Girilen sayı 50den büyük ise 1, değilse 0 değerini ekrana yazdırınız
        // Ternary operator ile yapınız
      /*  Scanner scan=new Scanner (System.in);
        int sayi=scan.nextInt();
        int result1= (n>50)? 1:0;
        System.out.println(result1);*/

       //bir işci 2 saatin altındaki çalışma için 10
//2 ile 5 saat arası    20
//5 saatten fazla çalışırsa 35 dolar alıyor(önce if sonra ternary

      /*  Scanner scan=new Scanner(System.in);
        System.out.println("Çalışma saati: ");
        int x=scan.nextInt();
        if (x<=2){
            System.out.println("10 dolar");}
        else if (2<x&&x<5){
            System.out.println("20 dolar");
        }else{
            System.out.println("35 dolar");


        }*/

        //Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = oku.nextInt();
        int onlar=(sayi/10)%10;

        switch (onlar){

            case 0:
            System.out.println("sıfır");
            break;
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;


        }



    }
}

