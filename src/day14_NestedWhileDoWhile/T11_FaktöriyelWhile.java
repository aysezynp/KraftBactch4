package day14_NestedWhileDoWhile;

public class T11_FaktöriyelWhile {
    public static void main(String[] args) {

        int faktöriyel=1;
        int sayi=8;
        int i=1;

        while(i<=sayi){
            faktöriyel*=i;
            i++;
        }

        System.out.println(sayi+ "! = "+faktöriyel);
    }
}


