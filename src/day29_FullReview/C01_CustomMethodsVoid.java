package day29_FullReview;

public class C01_CustomMethodsVoid {
    public static void main(String[] args) {
        System.out.println(ageOfPerson(1984));
    }


    public static void oddOrEven(int num){
     if(num%2==0){
         System.out.println(num+" is an even number");
     }else{
         System.out.println(num+" is an odd number");
     }


    }
    public static boolean isEven(int num){
        return num%2==0?true:false;
    }

    public static int ageOfPerson(int birthYear){
        return 2023-birthYear;
    }





}
