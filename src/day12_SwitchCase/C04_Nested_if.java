package day12_SwitchCase;

import java.util.Scanner;

public class C04_Nested_if {
    public static void main(String[] args) {


        //Bir konsere girişte kullanıcaya 18 yaşında olup olmadığını
        // sorun 18 yaşın altında ise giremezsiniz şeklinde ikaz verip
        // 18 ve üzrinde ise yanında bayan olup olmadığını sorun
        //bayan yok ise giremesin
        //bayan var ise yüzme bilip bilmediğini sorun
        // yüzme bilmiyorsa giriş yapamasın


        Scanner scan = new Scanner(System.in);
        System.out.print("Yaşınız:");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.print("yanınızda bayan var mı (Evet/Hayır: ");
            String c = scan.next();
            if (c.equals("Evet")) {
                System.out.print("Yüzme biliyor musunuz (Evet/Hayır: ");
                String c1 = scan.next();
                if (c1.equals("Evet")) {
                    System.out.println("Hoş geldiniz");
                } else {
                    System.out.println("Yüzme bilmeyenler giriş yapamaz");
                }

            } else {
                System.out.println("Yanınızda bayan olmadığı için giriş yapamazsınız");
            }
        } else {
            System.out.println("Giremezsiniz");
        }







    }
}
