package day24_StringClass_Cont;

import java.util.Scanner;

public class T05_CocukBayramı {
    public static void main(String[] args) {
       // Kullanıcıdan çocuk bayramı ile ilgili bir cümle söylemesini
       // isteyin cümle içinde sev köküne sahip bir kelime var ise bir
       // method what a lovely person(ne hoş bir insan) mesajı döndürsün

        Scanner scan=new Scanner(System.in);
        System.out.println("Çocuk bayramı ile ilgili bir cümle giriniz: ");
        String cumle= scan.nextLine();
        if(cumle.contains("sev")){
            System.out.println(dondur());
        }else{
            System.out.println("girdiğiniz cümlede \"sev-\" köküne sahip bir kelime yoktur");
        }
    }

        public static String dondur(){
        return "what a lovely person";

    }
}
