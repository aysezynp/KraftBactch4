package day19_CustomMethods_Return;

public class MyStudy {
    public static void main(String[] args) {
        System.out.println("biggestNumber(5,4) = " + biggestNumber(5, 4));
        System.out.println("initial(\"ayşe\", \"arslan\") = " + initial("ayşe", "arslan"));

    }

    public static int biggestNumber(int x,int y){
        int result;

        if(x>y)
            result=x;
        else
            result=y;

        return result;



    }


public static String initial(String firstname, String lastname){
        String result=" ";
        result= firstname.charAt(0)+"." +lastname.charAt(0);
        return result.toUpperCase();


}









}





