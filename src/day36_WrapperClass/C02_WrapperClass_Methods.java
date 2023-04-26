package day36_WrapperClass;

public class C02_WrapperClass_Methods {
    public static void main(String[] args) {

        //value of int ve String alıyor ve çağrıldığı metoda göre dğer oluşturuyor
        String s = "123";
        int x = Integer.valueOf(s);
        int y = x + 5;
        // System.out.println(y);

        //parseInt() String alıp Integer döndürüyor.
        int z = Integer.parseInt("123");
        //System.out.println(z);

        //typeValue()
        Integer t = Integer.valueOf("123");
        int m = t.intValue();
        //System.out.println("m = " + m);

  /*  String str="Bugün hava 25 derece";
    //hava sıcaklığı 10 derece daha artar ise hava sıcaklığı kaç derece olur?
    String[] strArray=str.split(" ");
    int result=Integer.parseInt(strArray[2]);
    System.out.println(result);*/


        String str="Bugün hava 40 derece;Bugün hava çok sıcak";
        // 40 ve üzerinde ise "Bugün hava çok sıcak"
        //Altında ise bugün hava mevsim normallaerinde

        int havaSicakligi=Integer.parseInt(str.split(" ")[2]);
        String expectedResult1 = "Bugün hava çok sıcak";
        String expectedResult2 = "Bugün hava mevsim normallerinde";
        String actualResult = str.split(";")[1];
        if (havaSicakligi >= 40) {
            System.out.println(expectedResult1.equalsIgnoreCase(actualResult));
        } else {
            System.out.println(expectedResult2.equalsIgnoreCase(actualResult));
        }



    //"Ali'nin doğum yılı 1996" ise 10 yıl sonra ali kaç yaşında olur?
        String str1="Ali'nin doğum yılı 1996";
        int dogumYili=Integer.parseInt(str1.split(" ")[3]);
        int onYilSonra=(2023-dogumYili)+10;
        String name=str1.split("'")[0];
        System.out.println(name+" "+onYilSonra+" yaşında olur.");



    }






}