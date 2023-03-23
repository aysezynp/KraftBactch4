package day18_CustomMethods;

public class C06_ReturnTheBiggest {
    public static void main(String[] args) {
        System.out.println(max(5, 10));
        int maxNumber=max(5,4);
        System.out.println(maxNumber);

    }
    
    public static int max(int a,int b){
        int result=0;
        if(a>b) {
            result=a;
        }else{
            result=b;
        }
        return result;

    }






















}
