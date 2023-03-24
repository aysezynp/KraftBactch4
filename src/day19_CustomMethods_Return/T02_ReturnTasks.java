package day19_CustomMethods_Return;

public class T02_ReturnTasks {

    public static void main(String[] args) {
        System.out.println("lastDigitOfNumber(45,35) = " + lastDigitOfNumber(45, 35));
        System.out.println("lastDigitOfNumber(37,76) = " + lastDigitOfNumber(37, 76));
        System.out.println(".................................................");
        System.out.println("primeNumber(8) = " + primeNumber(8));
        System.out.println("primeNumber(29) = " + primeNumber(29));
        System.out.println(".................................................");
        System.out.println("negativeToPositive(-5) = " + negativeToPositive(-5));
        System.out.println("negativeToPositive(-4) = " + negativeToPositive(-4));
        System.out.println("negativeToPositive(10) = " + negativeToPositive(10));

    }

    //Bir method yazın boolean değer dondursun ve 2 sayı
    //kabul etsin sayıların son rakamı aynı ise true farklı ise
    //false döndürsün.

    /**
     * @param num1
     * @param num2
     * @return
     */
    public static boolean lastDigitOfNumber(int num1, int num2) {

        boolean lastDigit;

        if (num1 % 10 == num2 % 10) {
            lastDigit = true;
        } else {
            lastDigit = false;
        }

        return lastDigit;
    }

    /*Bir method yazın boolean değer döndürsün 1 sayı kabul
    etsin asal sayı ise true versin*/

    /**
     *
     * @param number
     * @return
     */
    public static boolean primeNumber(int number) {
        boolean prime = true;
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                } else {
                    prime = true;
                }
            }
        }
        return prime;
    }


    //Bir method yazın ve verdiğiniz sayıyı negatifse pozitif e
    // pozitifse pozitif olarak versin.

    /**
     *
     * @param sayi
     * @return
     */
    public static int negativeToPositive(int sayi) {
        if (sayi < 0) {
            sayi = -(sayi);
        } else{
            sayi = sayi;
        }
         return sayi;}








}








