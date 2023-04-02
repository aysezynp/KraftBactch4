package day22_ClassAndObject_Memory;

public class Math2 {

    public static int pow(int taban, int kuvvet) {
        if(taban==0){
            return 0;
        }
        int sonuc = 1;
        for (int i = 0; i < kuvvet; i++) {
            sonuc *= taban;
        }
        return sonuc;
    }

}







