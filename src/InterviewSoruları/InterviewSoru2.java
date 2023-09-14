package InterviewSoruları;

import day19_CustomMethods_Return.T05_MathPow;

import java.util.Arrays;

import static day50_Exceptions_Collection.C01_Exception_5.faktoriyel;

public class InterviewSoru2 {
    public static void main(String[] args) {
        int[]arr={1,2,2,3,3,3,5,7,11,15};
        System.out.println("sigma(arr) = " + sigma(arr));

    }
        public static int sigma(int[]arr){
            int sum=0;
            for (int i = 0; i < arr.length; i++) {
                sum+= ((int)Math.pow(arr[i],i))/ faktoriyel(i);
        }
            return sum;
    }
}

