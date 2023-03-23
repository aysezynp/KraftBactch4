package day13_ForLoops;

import java.sql.SQLOutput;

public class C06_Tasks {
    public static void main(String[] args) {
//0-100 arasındaki tüm sayıları yazdırın
        for(int i=0;i<=100; i++){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        System.out.println("---------------------------------------");

        //bir program yazın ve 15-100 arasındaki sayıları yan yana yazdırsın.

         for (int i=15;i<=100;i++){
             System.out.print(i+" ");
         }
        System.out.println(" ");
        System.out.println("---------------------------------------");
//0 dan 100 e kadar olana sayıları tersten yazdırın.
         for (int i=100; i>=0;i--){
             System.out.print(i+ " ");
         }

        System.out.println(" ");
        System.out.println("---------------------------------------");

//0-100 arasındaki tüm çift sayıları yazdırsın.
         for (int i=0;i<=100;i++){
             if(i%2==0){
                 System.out.print(i+ " ");
             }
         }

        System.out.println(" ");
        System.out.println("---------------------------------------");

//0-100 arasındaki tüm tek sayıları yazdırsın.
        for (int i=1;i<=100;i++){
            //if (i%2==1)
            if (!(i%2==0)){
                System.out.print (i+ " ");
            }
        }
        System.out.println(" ");
        System.out.println("---------------------------------------");
//bir program yazın. 1-100 arasındaki sayıların toplamını yazdırsın

        int sum= 0;
        for (int i=1;i<=100;i++){
             sum+=i;//sum=sum+i
        }
        System.out.println("sum = " + sum);

        System.out.println(" ");
        System.out.println("---------------------------------------");
//1-20 ye kadar olan sayıların küplerini yazınız.
        for (int i=1;i<=20;i++){
            System.out.println(i+" "+i*i*i);
        }

        //23 derece ile 50 derce arasında olan tüm fahrenheit değerlerini yazınız
        System.out.println(" ");
        System.out.println("---------------------------------------");
        for (int i=23;i<=50;i++){
         System.out.println(i+" C = "+i*1.8+32+ " F");
     }
        System.out.println(" ");
        System.out.println("---------------------------------------");
//A'dan Z'ye kadar olan harfleri yazdırın

        for (char ch='A';ch<='Z';ch++){
            System.out.print (ch+" ");
        }

        System.out.println(" ");
        System.out.println("---------------------------------------");

      for (int i=1;i<=10;i++){
          System.out.println("9 X "+i+" = "+ 9*i);
      }









    }
}
