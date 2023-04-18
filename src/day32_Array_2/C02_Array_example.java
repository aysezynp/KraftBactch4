package day32_Array_2;

import java.util.Scanner;

public class C02_Array_example {
        public static void main(String[] args) {
           //kullanıcıdan 3 farklı kelime alın ve bu üç farklı kelimeyi array içerisine atalım
            Scanner scan=new Scanner(System.in);
            String str[]=new String[3];
            System.out.print("1.kelime: ");
            String kelime1= scan.nextLine();
            str[0]=kelime1;
            System.out.print("2.kelime: ");
            String kelime2= scan.nextLine();
            str[1]=kelime2;
            System.out.print("3.kelime: ");
            String kelime3= scan.nextLine();
            str[2]=kelime3;

            System.out.println("Girmiş olduğun kelimelerden hangisini istiyorun 1-2-3");
            int tercih= scan.nextInt();
         switch(tercih){
             case 1:
                 System.out.println(str[0]);
                 break;
             case 2:
                 System.out.println(str[1]);
                 break;
             case 3:
                 System.out.println(str[2]);
                 break;
             default:
                 System.out.println("hatalı giriş");


         }








    }
}
