package day18_CustomMethods;

public class T01_TaskMethods {
    public static void main(String[]args) {

        mathematicalView(5,4);
        System.out.println("-----------------------------");
        mathematicalOperation(4,8,"*");
    }

    /**
     * A method that can calculate the age of the person from the birthYear
     * @param birthyear
     */
    public static void ageCalculator(int birthyear){
        int age=2023-birthyear;
        System.out.println("The age of a person was born in "+birthyear+ " is "+age);

    }

    /**
     *  A method that can make the first number the power of the second number
     * @param firstNum
     * @param secondNum
     */
    public static void exponentialNumber(int firstNum, int secondNum) {
        int result = (int) Math.pow(secondNum, firstNum);
        System.out.println( secondNum+ " to the power "+firstNum+" = "+result);
    }

    /**
     * A method that can display the mathematical view of two numbers
     * @param number1
     * @param number2
     */

    public static void mathematicalView(int number1,int number2){
        int result=number1+number2;
        System.out.println(number1+" + "+number2+" = "+result);

    }

    /**
     * A method that can make the mathematical operation of two numbers
     * @param number1
     * @param number2
     * @param operation
     */
    public static void mathematicalOperation(int number1,int number2,String operation){
        if(operation.equals("+")) System.out.println(number1+number2);
        else if(operation.equals("-")) System.out.println(number1-number2);
        else if(operation.equals("*")) System.out.println(number1*number2);
        else if(operation.equals("/")) System.out.println(number1/number2);
        else System.out.println("Hatalı işlem");

    }







}
