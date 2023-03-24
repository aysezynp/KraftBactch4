package day19_CustomMethods_Return;

public class T05_MathPow {
    public static void main(String[] args) {
        System.out.println("mathPow(3,4) = " + mathPow(3, 4));
        System.out.println("mathPow(2,3) = " + mathPow(2, 3));

    }

    /**
     * İlk sayı taban, ikinci sayı  üs olan mathPow metodu
     * @param num1
     * @param num2
     * @return
     */
    public static int mathPow(int num1, int num2){
        int base=num1;
        int power=num2;
        int result=1;
        if(base!=0&&power!=0){
            for(int i=0;i<power;i++) {
            result *= base;}
        }
        return result;
    }




    }








