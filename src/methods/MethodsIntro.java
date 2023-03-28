package methods;

public class MethodsIntro {
    public static void main(String[] args) {
        System.out.println(oddOrEven(5));
    }
    public static int add(int num1,int num2){
        return num1+num2;


    }
/*public static void oddOrEven(int n) {
    if (n % 2 == 0) System.out.println("Even number");
    else System.out.println("odd number");

}*/
public static String oddOrEven(int n1){
        String result="";
        if (n1%2==0)
            result ="even number";
        else result="odd number";
return result;

}







}
