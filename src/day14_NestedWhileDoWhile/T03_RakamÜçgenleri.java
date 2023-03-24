package day14_NestedWhileDoWhile;

public class T03_RakamÜçgenleri {
    public static void main(String[] args) {
        for (int a = 1; a <= 6; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(b);
            }
            System.out.println();
        }

        System.out.println(".......................................");

        for (int y = 1; y <= 6; y++) {
            for (int z = 1; z <= y; z++) {
                System.out.print(y);
            }
            System.out.println();
        }

        System.out.println(".......................................");

        for (int i = 1,c=0; i <= 5; i++) {
            for (int k = 1;k <= i; k++) {
            c++;
                System.out.print(+c+ " ");
            }
            System.out.println();

        }

    }
}