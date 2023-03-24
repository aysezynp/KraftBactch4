package day16_BranchingStatements;

import java.util.Scanner;

public class C01_Summary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*for (int i = 5; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 6 - i; k > 0; k--) {
                System.out.print("* ");
            }
            System.out.println();*/

/*boolean flag=true;
while(true){
    System.out.print("X: ");
    int x= scan.nextInt();
    System.out.print("Y:");
    int y=scan.nextInt();
    int result=x+y;
    if(result>=25){
        System.out.println("Toplam 25 e eşit veya büyük olduğu için programdan çıkılıyor.");
    break;
  }
    else{System.out.println("Toplam: "+result);}//burda else yazsak ta yazmasakta olur. break yazdığımız için greke yok aslında.*/

      /*  boolean flag = true;
        while (true) {
            System.out.print("X: ");
            int x = scan.nextInt();
            System.out.print("Y:");
            int y = scan.nextInt();
            int result = x + y;
            if (x == 0 && y == 0) {
                break;
            }
            if (result >= 25) {
                System.out.println("Toplam 25 e eşit veya büyük olduğu için sonuç veremiyoruz tekrar deneyiniz.");
                continue;
            }
            System.out.println("toplam:"+result);
        }*/

        for (int i=0;i<=100;i++){
        if(30<i&&i<60){
            continue;}
        System.out.print(i+ " ");}


     for (int i=0;i<=100;i++){
            if(i%13==0){
                continue;}
            System.out.print(i+ " ");}









    }









    }

