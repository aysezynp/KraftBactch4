package day17_Methods;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C04_Methods_02 {
    public static void main(String[] args) {
       // aritmetikOrtalama();
       // büyükOlan();
      // int sayi=5;
      // kareHesaplama(sayi);
      //isimYaz("Mehmet");
ortalama3(4,5,6);

    }

//3 sayının ortalamasını veren metod
  /*  public static void aritmetikOrtalama() {
        double x = 3, y = 5, z = 10;
        double result = (x + y + z) / 3;
        System.out.println("ortalama: " + result);

    }
//2 sayıdan büyük olanı veren metod
      public static void büyükOlan() {
        int x = 5, y = 6;
        int max;
       // System.out.println(Math.max(x, y));
       if(x>y){
          max=x;
       }else {
           max=y;
       }
          System.out.println("En büyük sayı: "+max);
    }
//kiloyu okkaya çeviren metodu yazınız.
      public static void kiloOkkaCeviriMetodu(){
          Scanner scan=new Scanner(System.in);
          System.out.print("Kilogram: ");
          double kilo=scan.nextInt();
          double okka=kilo/1.282;
          System.out.println(kilo+" kg "+okka+" okkadır");

      }*/

// 1 sayının karesini yazan metodu yazınız.

   /* public static void kareHesaplama(int x){
        int result=x*x;
        System.out.println("Sonuç: "+ result);
    }*/

// parametre olarak isim alan ve sonucunda .... dır yazan programı yazınız.
    /*public static void isimYaz(String name){
        System.out.println("İsminiz: "+ name);

    }*/
// 2 sayinin ortalamasını veren metodu yazınız:
   /* public static void ortalama2(int x,int y){
        double ortalama=((double)(x+y)/2;
        System.out.println("ortamala= "+ortalama);
    }*/
    public static void ortalama3(int x,int y,int z){
        double ortalama=((double)(x+y+z))/3;
        System.out.println("ortamala= "+ortalama);
}
}