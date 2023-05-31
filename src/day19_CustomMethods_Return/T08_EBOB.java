package day19_CustomMethods_Return;

public class T08_EBOB {
    public static void main(String[] args) {
        System.out.println("obeb(6,12) = " + obeb(6, 12));
    }

    /**
     * Verilen iki sayının en büyük ortak bölenini bulan program
     * @param num1
     * @param num2
     * @return
     */
    public static int obeb(int num1, int num2) {
        int obeb=1;                ;
        for (int i = 1; i<=num1&&i<=num2; i++){
            if(num1 % i == 0 && num2 % i == 0){
                    obeb = i;
                }
        }
        return obeb;


    }


}
//Kullanıcıdan 2 sayı alın ve bu iki sayının en büyük ortak bölenini ekrana yazdırın. 1 ile 7
