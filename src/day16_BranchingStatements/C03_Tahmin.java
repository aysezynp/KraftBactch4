package day16_BranchingStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C03_Tahmin {
    public static void main(String[] args) {
        //   // Şifre tanımlayın ve kullanıcıya ekrandan
//// 5 defa şifreyi girmesini isteyin. Her bulamadığında şifre doğru değildir tekrar deneyin ikazı çıksın.
//// Şifreyi bulursa «tebrikler şifre doğru» yazısı gösterildikten sonra programdan çıkış işlemi gerçekleşsin.
        Scanner scan = new Scanner(System.in);
        String sifre = "Harun123";
        int i = 0;
        System.out.println("5 hakkın var");
        while (i < 5) {
            System.out.println((i + 1 + ".Tahmin: "));
            String tahmin = scan.next();
            if (tahmin.equals(sifre)) {
                System.out.println("tebrikler");
                break;
            }
            i++;
            if (i == 5) {
                System.out.println("hatalı, tahmin hakkınız doldu");
                break;
            }
            System.out.println("tekrar deneyiniz");
        }
    }
















    }

