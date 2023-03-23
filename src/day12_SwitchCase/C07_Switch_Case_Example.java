package day12_SwitchCase;

import java.util.Scanner;

public class C07_Switch_Case_Example {
    public static void main(String[] args) {
        //+,-,,/
        // 4 işlem yapacak şekilde bir hesap makinesi yapın
        // kullanıcıdan 2 sayı alın
        //yapmak istediği işlemi seçsin +,-,,/
        //hatalı işlem girişlerinde kullanıcıya uyarı verin
        //ekrana sonuç döndüren programı yazınız.


       Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayı seçiniz:");
        double x=scan.nextDouble();
        System.out.print("Bir sayı seçiniz:");
        double y=scan.nextDouble();
        System.out.println("Lütfen bir işlem seçiniz(+,-,*,/):");
        String islem=scan.next();

        switch (islem){

            case "+":
                System.out.println(x+y);
                break;
            case "-":
                System.out.println(x-y);
                break;
            case"*":
                System.out.println(x*y);
                break;
            case "/":
                System.out.println(x/y);
                break;
            default:
                System.out.println("hatalı giriş yaptınız");}

        //haftanın gününü kullanıcıdan alın ve ekrana o günün ismini yazdırın

       /*int haftaninGünü=6;

        switch (haftaninGünü){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("hatalı giriş 1 ila 7 arasında bir gün giriniz");}
*/

//Bir program yazın switch yapısını kullanın.
        // Şu beden numaralarını: small(38,40,42),
        //medium(44,46,48),large(50,52,54) yakalasın.Aşağıdaki şekilde çıktı alın.
        //Example output: 50 numara bir large bedendir

       /* Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen beden numaranızı giriniz: ");
        int beden=scan.nextInt();

        switch (beden){
            case 38,40,42:
                System.out.println(beden+ " numara bir small bedendir.");
                break;
            case 44,46,48:
                System.out.println(beden+ " numara bir medium bedendir." );
                break;
            case 50,52,54:
                System.out.println(beden+ " numara bir large bedendir.");
                break;
                default:
            System.out.println("hatalı beden girişi yaptınız");*/






        }













    }

