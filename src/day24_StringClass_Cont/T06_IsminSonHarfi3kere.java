package day24_StringClass_Cont;

public class T06_IsminSonHarfi3kere {
    public static void main(String[] args) {
        //İsminizin son 3 harfini 3 kez yazdıran bir method oluşturun
        String name="Ayşe";
        for (int i=0;i<3;i++){
           System.out.println(name.substring(name.length()-3,name.length()));
        }

    }
}
