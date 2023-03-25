package day19_CustomMethods_Return;

public class T07_ArmstrongSayi {
    public static void main(String[] args) {

        System.out.println("armstrong() = " + armstrong());
    }

    /**
     * 100 ile 999 arasındaki Armstrong sayılarını yazdıran metot.
     * @return
     */
    public static String armstrong() {
        String result="";
        for (int i=101; i < 999; i++) {
            int birler = i % 10;
            int onlar = (i / 10) % 10;
            int yuzler = i/100;

            int kuplerToplami = (int) (Math.pow(birler, 3) + Math.pow(onlar, 3) + Math.pow(yuzler, 3));
            if (kuplerToplami == i) {
                result+=i+ " ";

            }
        }return result;


        }

    }














