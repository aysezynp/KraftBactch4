package day19_CustomMethods_Return;

public class C03_Faktöriyel {
    public static void main(String[] args) {
    int sonuc=faktoriyelHesapla(4);
        System.out.println("sonuc = " + sonuc);
    }



    // verdigimiz bir sayinin faktoryelini hesaplayip
    // sonucu bize donduren bir method olusturun
    public static int faktoriyelHesapla(int sayi){
    int faktoriyel=1;
    for (int i=1; i<=sayi ;i++){
    faktoriyel*=i;}
    return faktoriyel;
}







}
