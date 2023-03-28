package day21_Class_And_Objects;

import java.util.Scanner;

public class C04_UcunKati_2 {
    public static void main(String[] args) {
     sayiAl();
    }
    //Konsoldan
    //kullanıcıdan 2 sayı almanızı sağlayan bir
    //metodu çağırın İkinci sayı 3 ün katı olan bir sayı değilse,
    //başka bir metodtan geçirin ve 3 katı olacak şekilde size
    //döndürsün Sonra bu sayıları kabul eden başka bir
    //metotla da sayıları toplayın

    public static void sayiAl(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı 1:");
        int sayi1=scan.nextInt();
        System.out.print("Sayi 2:");
        int sayi2= scan.nextInt();
        if(sayi2%3==0){
            System.out.println(toplam(sayi1, sayi2));
        }else {
            System.out.println(toplam(sayi1, ucunKati(sayi2)));
        }

    }

    private static int ucunKati(int sayi2) {
       int sayi3=sayi2*35
               ;
        return sayi3;

    }
    public static int toplam(int sayi1, int sayi2){
      return sayi1+sayi2;


}

}
