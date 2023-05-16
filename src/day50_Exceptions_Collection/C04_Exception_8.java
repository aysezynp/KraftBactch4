package day50_Exceptions_Collection;

import java.sql.SQLOutput;

public class C04_Exception_8 { //MULTİPLE CATCH BLOCKS (CATCH İÇERİSİNDEKİ EXCEPTIONLAR ÖZELDEN GENELE DOĞRU SIRALANMALIDIR
    public static void main(String[] args) {

  /*  int i=50;

        if(i<Integer.MAX_VALUE){
            System.out.println(1);
        }else if(i<70){
            System.out.println(2);
        }else if(i<50){
            System.out.println(3);
        }else{
            System.out.println(4);
        }
        //sonuçta 1 yazar
        ik ifte koşulu sağlar ve oraya girer
*/
        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException a) {
            System.out.println(1);
        } catch (Exception e) {
            System.out.println(2);
        }
        System.out.println("kod devam ediyor");
// sonuçta 1 i yazar, çünkü 5/0 arithmeticException o yüzden ilk catch bloğuna girer

String str=null;
        try {
            for (int i = 0; i <str.length() ; i++) {
                System.out.println(i);
            }
        } catch (ArithmeticException a) {
            System.out.println("aritmetik exception hatası alındı");
        } catch (NullPointerException a) {
            System.out.println("null a dikkat");
        } catch (RuntimeException a) {
            a.printStackTrace();
            System.out.println("Run time hatası dikkat");
        } catch (Exception a) {
            a.printStackTrace();
            System.out.println("exception var kontrol et");
        }finally{
            System.out.println("her zaman çalışır");
        }

    //finally :try catch blokları ile birlikte kullanılan  kod İSTER çalışsın ister çalışmasın
        // yani hata fırlatılsın fırlatılmasın finally her zaman çalışan bir bloktur.


        System.out.println("........................................................................");
        //AYNI CATCH BLOĞUNDA BİRDEN FAZLA EXCEPTION

        try {
            System.out.println(5/0);//ArithmeticException

        } catch (ArithmeticException | NullPointerException a) {      //aynı catch bloğunda birden fazla exception vermek istediğimizde
            a.printStackTrace();                                     // bunlar arasında is A ilişkisi olmamalı
            System.out.println("hata alındı");
        } catch (RuntimeException a) {
            a.printStackTrace();
            System.out.println("Run time hatası dikkat");
        } catch (Exception a) {
            a.printStackTrace();
            System.out.println("exception var kontrol et");
        }finally{
            System.out.println("her zaman çalışır");
        }

        System.out.println(".........................");
        try{                                      //burda try da hata alıcak ve catch olmadığı için devamındaki kod devam ediyor u yazmıcak;
                                                  // ancak finally bloğu çalışır
            System.out.println(5/0);
        }finally {
            System.out.println(1);
        }
        System.out.println("kod devam ediyor");
    }

    }