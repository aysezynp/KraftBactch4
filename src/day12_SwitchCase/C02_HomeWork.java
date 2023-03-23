package day12_SwitchCase;

public class C02_HomeWork {
    public static void main(String[] args) {
      /*   int x,y,z;
         x=50;
         y=60;
         z=15;
         System.out.println("max değer: "+Math.max(x,(Math.max(y,z))));*/







//3 sayı alın sayılar eşit olan sayıyı ekrana getiren
        //(min 2 sayı eşit olmalı)
        // eşit sayı yok ise ekrana eşit sayı yoktur
        // yazan programı yazınız
        // 1 ,2,3   eşit sayı yok
        // 1,2,2    2
        // 2,2,2    2
        //2,3,2     2

       int x=20;
        int y=30;
        int z=30;

        if (x == y) {
            System.out.println(x);
        } else if (y == z) {
            System.out.println(y);
        } else if (x == z) {
            System.out.println(z);
        } else {

            System.out.println("Eşit sayı yoktur");
        }

    }
}
