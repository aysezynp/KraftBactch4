package InterviewSoruları;

import java.util.*;

public class InterviewSoru {
    public static void main(String[] args) {


        String str = "samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2, WA48J7700AW/AA',20916,\n" +
                "samsung, 'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV, WA52M7750AV/A4, WA52M7750AW, WA52M7750AW/A4', 91995,\n" +
                "samsung, 'SAMSUNG Washing Machine Spring Hanger, DC61-01257M', 22970,\n" +
                "samsung, 'Samsung DC97-17022B Assy Detergent', 32959,\n" +
                "samsung, 'Samsung DC66-00470A DAMPER SHOCK', 29981,\n" +
                "samsung, 'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150', 52000,\n" +
                "samsung, 'Samsung DC97-16991A Assembly Filter', 13000";

        System.out.println("sortedPrices(str) = " + sortedPrices(str));
            /*String[] arr = array[03].split(",");
            System.out.println(Arrays.asList(arr));
           String[] key = Arrays.copyOfRange(arr, 0, arr.length - 1);
            System.out.println(Arrays.asList(key));
            Integer value= arr[arr.length-1];

         System.out.println(value);
            //map.put(key, value);*/


    }

    /*   public static Map<String[], Integer> sortedPrices(String str) {
           Map<String[], Integer> map = new TreeMap<>();
           String[] array = str.split(",\n");
           for (int i = 0; i < array.length; i++) {
               String[] arr = array[i].split(",");
               String[] key = Arrays.copyOfRange(arr, 0, arr.length - 1);
               Integer value = Integer.valueOf(arr[arr.length - 1]);
               map.put(key, value);
           }

           return map;


       }
   */
    public static List<String> sortedPrices(String str) {
        List<String> list = new ArrayList<>();
        String[] array = str.split(",\n");
        String[] array2 = array[0].split(",");
        int max = Integer.parseInt(array2[array2.length-1]);
        for (int i = 1; i < array.length; i++) {
            array2 = array[i].split(",");
            if (Integer.parseInt(array2[(array2.length )- 1]) < max) ;
       list.add(array[i]);
        }
        return list;
    }

}
// String []arr= str.replace(" ","").split("");
//    Set<String>uniqueCharSet=new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//               uniqueCharSet.add(arr[i]);
//        }
//         return uniqueCharSet.size();
//
//            }