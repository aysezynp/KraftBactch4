package day30_Review;

public class C04_LocalVariables {
    /*
  1.
  2.For,While etc döngülerinde kendi scopeları vardır.Loop dizisinde kullanmayız
  3.Lacal değişkenler değer atamadan oluşturulabilinir.Ancak değer atamadan bu değişkenleri kullanamam.



     */
public static void main(String[]args)
{
    String isim;
//    System.out.println(isim);//local değişken initialize edilemeden kullanılmaz.
    int i;
    //i++; //initialize edilmeden değişken kullanılamaz

    {
        int i2=5;
        System.out.println(i2);
    }
    //System.out.println(i2); i2 is out of scope

    for (int j = 0; j < 10; j++) {
        System.out.println(j+" ");}
   // System.out.println(j);// j for döngüsünün içerisinde bir local değişken dışında kullanılmaz
}




}
