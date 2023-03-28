package day21_Class_And_Objects;

import java.util.Scanner;

public class C02_Davetiye {

    //Kullanıcıdan
//2 adet kelime isteyen bir metodunuz olsun Bu metot
//kullanıcıya ileteceğiniz mesajı size belirleme opsiyonu sunsun Eğer
//kullanıcı cümleleri yanlışlıkla aynı girerse Başka bir metot çağrılsın ve
//kullanıcıya kelimeler farklı olmalıydı mesajı ile tekrar ondan 2 kelime
//istesin Kelimeler farklı gelirse bir başka metot çağrılsın ve kelimeleri
//bağlayıp( concat önünü ve arkasını yıldızlarla süsleyip versin
    public static void main(String[] args) {
        davetiye();
    }


    public static void davetiye() {
        boolean flag = true;
        while (flag) {
            Scanner scan = new Scanner(System.in);
            System.out.print("1.kelime: ");
            String kelime1 = scan.nextLine();
            System.out.print("2.kelime: ");
            String kelime2 = scan.nextLine();
            if(kelimeKontrol(kelime1, kelime2)){
                System.out.println("Kelimeler farklı olmalıydı.");
                continue;
            }else{
                System.out.println(davetiyeYazdir(kelime1, kelime2));
                return;//flag=false;//break;
            }

        }
    }



    public static String davetiyeYazdir(String kelime1,String kelime2){
        return ("********"+kelime1+"*****"+kelime2+"*******");
    }

    private static boolean kelimeKontrol(String str,String str2) {
        return str.equals(str2);
    }
}
