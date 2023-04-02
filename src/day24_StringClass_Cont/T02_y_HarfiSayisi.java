package day24_StringClass_Cont;

public class T02_y_HarfiSayisi {
    public static void main(String[] args) {
       // "javayı Seviyor muyum?" ifadesindeki y harfinin sayısını veren
       //  bir program yazın
        String str="javayı Seviyor muyum?";
        int length=str.length();
        int finalLength=str.replace("y","").length();
        int yHarfSayisi=length-finalLength;
        System.out.println(str+" ifadesinde bulunan y harfi sayısı: "+yHarfSayisi );






    }


}
