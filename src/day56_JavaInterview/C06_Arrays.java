package day56_JavaInterview;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        int[]numbers={5,10,15,20,25,30};//array literal used if we know all the elements
        //  int[]num;
        //num={1,2,3,4,5};

        System.out.println("numbers[3] = " + numbers[3]);
        numbers[5]=50;


        int[]numbers2=new int[6];
        for (int i = 0; i <numbers2.length ; i++) {
            numbers2[i]=(int)Math.pow(2,i);//MathPow double dönüyor

        }

        String[]arr1={"Ayşe","Serkan","Emine"};
        String[]arr2={"hatice","salih","Umit"};

        String[][] arr2D={arr1,arr2};
        System.out.println("arr2D[0][2] = " + arr2D[0][2]);
        System.out.println("Arrays.deepToString(arr2D) = " + Arrays.deepToString(arr2D));
        //new keyword if we know number of elements
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));

        char[] hollyNameChars = "harun".toCharArray();
        for (int i = 0; i < hollyNameChars.length; i++) {
            System.out.print(hollyNameChars[i]+" ");

            System.out.println();
        }
        for (char hollyNameChar : hollyNameChars) {
            System.out.print(hollyNameChar+ " ");
        }


    }
}
