package day21_Class_And_Objects;

public class Person {
    //isim, cinsiyet ve yaş
    //uyu() ve oyun oyna()


String isim;
String cinsiyet;
int yas;
String tcNo;

public void uyu() {
    System.out.println(isim+ " uyuyor");
}
public void oyunOyna(){

    System.out.println(isim+ " oyun oynuyor");
}

public void tumBilgileriGetir(){

    System.out.println("isim = " + isim);
    System.out.println("yas = " + yas);
    System.out.println("cinsiyet = " + cinsiyet);
    System.out.println("tcNo = " + tcNo);

}

}
