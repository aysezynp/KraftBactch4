package day20_CustomMethods_Overloading;

public class C05_MethodOverloading3 {
    public static void main(String[] args) {
        // name sadece bu iki süslü parantez içinde olan local bir değişken
        {
            String name="Ali Fuat";
            System.out.println(name);
        }
        //System.out.println(name);

        methodx(10,"Ali Osman",true);
        methodx(10,"Ali Osman",false);
    }

public static void methodx(int i,String str,boolean bl){
    if(bl){
        System.out.println(i+str);
    }else{
         methodx(i,str);
    }

}
public static void methodx(int num, String str){

    for(int i=1;i<=num;i++){
        System.out.println(str);
    }
}
}
/*
 * 3 parametreli bir method yazin int ve String ve boolean tipinde 3 parametre alsin
 * Boolean true ise int ve String değeri concat yapsın.
 * false ise başka bir methodu çağırsın ve String değeri int kadar yazdırsın.*/