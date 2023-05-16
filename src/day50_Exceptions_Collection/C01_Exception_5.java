package day50_Exceptions_Collection;

public class C01_Exception_5 {
    public static void main(String[] args) {
        System.out.println(faktoriyel(5));
    }

    public static int faktoriyel(int n){
        int result=1;
        for (int i = 1; i <=n ; i++) {
            result*=i;
        }
        return result;
    }

    public static int faktoriyelbetter(int n) {//Harika çözüm
        int result = 1;
        try {
            for (int i = 1; i <= n; i++) {
                result*= i;
            }
            return result;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }











}
