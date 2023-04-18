package day33_Arrays_3;

import java.util.Arrays;
import java.util.Random;

public class C03_ArrayMethods {
    public static void main(String[] args) {

    //  split()

        String str="Merhaba Güzel Insanlar";
        String[] strArr=str.split(" ");


        System.out.println("strArr.length = " + strArr.length);
        System.out.println(Arrays.toString(strArr));
        System.out.println("strArr[1] = " + strArr[1]);
        for (String s:strArr){
            System.out.println(s);
             }
        System.out.println(".............................................");

        String[] strArr2=str.split("");
        System.out.println("strArr2.length = " + strArr2.length);
        System.out.println(Arrays.toString(strArr2));

        System.out.println(".............................................");

        Arrays.sort(strArr);
        System.out.println("Sorted strArr = " + (Arrays.toString(strArr)));

        //toCharArray

        char[] charArr=str.toCharArray();
        System.out.println("Arrays.toString(charArr) = " + Arrays.toString(charArr));
        Arrays.sort(charArr);
        System.out.println("Sorted charArr = " + Arrays.toString(charArr));

        System.out.println(".............................................");

    // copyOfRange()

       String[]students={"yunus","emre","emine","ayşe","serkan","ümit"};
       //                   0      1       2      3        4      5


      String[] ourClass= Arrays.copyOfRange(students,2,6);
      System.out.println("Arrays.toString(ourClass) = " + Arrays.toString(ourClass));

      System.out.println(".............................................");


    // sort()
       Random random=new Random();
       int[]numbers= new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= random.nextInt(50);
        }

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int min=numbers[0];
        int max=numbers[numbers.length-1];
        System.out.println("min = " + min);
        System.out.println("max = " + max);


        //fill()

        int[]num2=new int[4];
        num2[0]=5;
        num2[1]=4;
        num2[2]=3;
        num2[3]=2;
        System.out.println("Arrays.toString(num2) = " + Arrays.toString(num2));
        Arrays.fill(num2,9);
        System.out.println("Arrays.toString(num2) = " + Arrays.toString(num2));
        Arrays.fill(num2,2,4,7);
        System.out.println("Arrays.toString(num2) = " + Arrays.toString(num2));
        Arrays.fill(num2,0,3,5);
        System.out.println("Arrays.toString(num2) = " + Arrays.toString(num2));






}







    }




















