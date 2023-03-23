package day19_CustomMethods_Return;

public class C07_Initials {
    public static void main(String[] args) {
    System.out.println(initials("ayşe", "Aşcı"));
    }
//Create a method that can display the initials of the person.
// initials(String firstName, String lastName)
    public static String initials(String firstname,String lastName){
       String result="" ;
       result=firstname.charAt(0)+"."+lastName.charAt(0);
       result=result.toUpperCase();
       return result;



    }







}
