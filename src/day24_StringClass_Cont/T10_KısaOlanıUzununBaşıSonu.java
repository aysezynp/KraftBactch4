package day24_StringClass_Cont;

public class T10_KısaOlanıUzununBaşıSonu {

   // Girilen 2 kelimeden kısa olanı uzun olanın başına ve sonuna
   // ekleyen bir method yazın.

   public static void main(String[] args) {
       System.out.println("kisaUzunBasSon(\"ANNE\",\"çocuk\") = " + kisaUzunBasSon("ANNE", "Çocuk"));
       System.out.println("kisaUzunBasSon(\"Mental\",\"UP\") = " + kisaUzunBasSon("Mental", "UP"));
   }
    public static String kisaUzunBasSon(String kelime1,String kelime2){
        if(kelime1.length()<kelime2.length()){
            return kelime1.concat(kelime2.concat(kelime1));}
        else{
            return kelime2.concat(kelime1.concat(kelime2));
        }






        }





    }











