package day14_NestedWhileDoWhile;

public class T10_10_1000_Bölünebilme10While {
    public static void main(String[] args) {
        //10 ile 1000 arasında olan 10 a tam bölünebilen tüm sayıları
        //ekrana yazdırın.
        int num=10;
        while(num<=1000){
            if(num%10==0){
                System.out.print(num+" ");
            }num++;
        }





    }
}
