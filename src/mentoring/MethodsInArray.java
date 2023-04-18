package mentoring;


import java.sql.SQLOutput;

public class MethodsInArray {
    public static void main(String[] args) {
        int plakalar[]={1,4,34,56,47,6,35};


        System.out.println("Soru 1:");
        ilkVeSonElementKontrol(plakalar);
        System.out.println("................................");

        System.out.println("Soru 2:");
        String[]klupler={"Galatasaray","Beşiktaş","Fenerbahçe","Trabzonspor","Ankaraspor"};
        ilkElementKontrol(klupler,new String[]{"Galatasaray","barcelona","milan","Real MAdrid"});
    }

//SORU 1:
   public static void ilkVeSonElementKontrol(int[]abc){
        if(abc[0]==abc[abc.length-1]){
        System.out.println("Dizinin ilk ve son elemanları birbirine eşittir.");
    }else{
        System.out.println("Dizinin ilk ve son elemanı eşit Değildir");
    }

}//SORU2:

    public static void ilkElementKontrol(String[]str1,String[]str2){
        if(str1[0].equals(str2[0])){
            System.out.println("Stringin ilk elemanları birbirine eşittir.");
        }else{
            System.out.println("Stringin ilk elemanları eşit Değildir");
        }

    }

//Soru 3:

    public static int[] reverseArray(int[]arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - (i + 1)];
        }
        return reversed;
    }}