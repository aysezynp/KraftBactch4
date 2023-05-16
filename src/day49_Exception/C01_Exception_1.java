package day49_Exception;

import java.util.Scanner;

public class C01_Exception_1 {
    public static void main(String[] args) {
       /* Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        try{
            int x=scan.nextInt();
            System.out.println(x*10);
        }catch (Exception e){
            System.out.println("Hata alındı");
        }

        System.out.println("Kod devam ediyor.......");
        System.out.println("Kod devam ediyor.......");
        System.out.println("Kod devam ediyor.......");
        System.out.println(bolme(5, 2));
        System.out.println(bolme(5, 0));

    }

    public static int bolme(int sayi,int bolen){
        try{
            return sayi/bolen;
        }catch (Exception e){
            return -1;
        }

String[]arr={"Harun","Mehmet","Ahmet"};
try{
    System.out.println(arr[5]);
}catch(Exception e){
    System.out.println("Hata: "+e.getMessage());

}*/
        System.out.println("kod başladı");
try{
    int x=5/0;
}catch(Exception e){
    System.out.println("Hata:"+e.getMessage());
    Scanner scanner=new Scanner(System.in);
    System.out.println("Kararınız nedir? 1 işleme devam,2 programı sonlandır");
    int karar= scanner.nextInt();
    if(karar!=1) {
        System.exit(0);
    }
    }
        System.out.println("kod devam ediyor....");

    }
    public static int sayiGir(){
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi");

        try{
           int sayi=scan.nextInt();
            return sayi;
        }catch (Exception e){
            System.out.println("Hatalı Giriş:" +e.toString());
            return sayiGir();
        }



    }

}
