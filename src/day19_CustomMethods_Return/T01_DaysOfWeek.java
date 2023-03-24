package day19_CustomMethods_Return;

public class T01_DaysOfWeek {
    public static void main(String[] args) {
        System.out.println("daysOfWeek(1) = " + daysOfWeek(1));
        System.out.println("daysOfWeek(5) = " + daysOfWeek(5));
    }

    //Create a method that returns the name of the day based on the given number to the method
    public static String daysOfWeek(int number) {
        String day = " ";
        switch (number){
            case 1:
                day="Monday";
                break;
            case 2:
                day="Tuesday";
                break;
            case 3:
                day="Wednesday";
                break;
            case 4:
                day="Thursday";
                break;
            case 5:
                day="Friday";
                break;
            case 6:
                day="Saturday";
                break;
            case 7:
                day="Sunday";
                break;
            default:
                day= "Invalid";

        }return day;

    }
}