package exercise;


import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Arrays;

public class FreeStudy {
    public static void main(String[] args) {

        String[] str = {"ali", "ahmet", "veli"};
        String[] str1 = Arrays.copyOfRange(str, 0, 3);
        System.out.println(Arrays.toString(str1));
        int[]x={3,6,4,9,6};
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
        int[]x3={3,6,4,9,6};
        Arrays.fill(x3,0,2,1);
        System.out.println(Arrays.toString(x3));
    }
}



