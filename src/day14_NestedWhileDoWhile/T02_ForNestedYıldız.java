package day14_NestedWhileDoWhile;

public class T02_ForNestedYıldız {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println(".....................................");

        for (int a=6;a>=0;a--){
            for(int b=1;b<=a;b++){
                System.out.print("*");
            }
            System.out.println();
        }

        }
    }

