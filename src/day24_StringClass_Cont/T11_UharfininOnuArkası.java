package day24_StringClass_Cont;

public class T11_UharfininOnuArkası {
    //Dün akşam eve giderken onları görmüştüm. Cümlesindeki ü
    //harfinin önünde ve arkasında olan harflerden bir string üreten
    //bir method yazın

    public static void main(String[] args) {
        System.out.println("önArka(\"Dün akşam eve giderken onları görmüştüm.\") = "
                + onArka("Dün akşam eve giderken onları görmüştüm."));
    }


    public static String onArka(String cumle){
    String yeniCumle=cumle.replace("akşam eve giderken onları ","").replace("ü","");
    return yeniCumle;


    }











}
