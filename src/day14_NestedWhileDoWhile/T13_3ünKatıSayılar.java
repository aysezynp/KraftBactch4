package day14_NestedWhileDoWhile;

public class T13_3ünKatıSayılar {
    public static void main(String[] args) {
//0 ile 20 arasındaki 3 ün katı olan tüm sayılarının küpleri alarak
//ekrana yazdırın.
        int i=0;
        while(i<=20){
            if(i%3==0){
                System.out.println (i+"     "+i*i*i);}
            i++;

        }


    }
}
