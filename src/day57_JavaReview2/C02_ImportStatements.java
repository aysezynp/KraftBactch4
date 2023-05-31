package day57_JavaReview2;

import java.util.Arrays;//regular import statement java.util package name Arrays classname

import static java.util.Arrays.sort;//regular import statement java.util package name Arrays classname
import static java.lang.Math.PI;//


public class C02_ImportStatements {
    public static void main(String[] args) {
        String[] alayı={"Hans","Sam","Tony","Jony","Herge","Frank"};

        Arrays.sort(alayı);
        sort(alayı);
        System.out.println(Arrays.toString(alayı));
        System.out.println(Math.PI);
        System.out.println(PI);
        //RestAssured,HamcrestMathhers

    }
}
