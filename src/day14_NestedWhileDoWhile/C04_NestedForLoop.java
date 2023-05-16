package day14_NestedWhileDoWhile;

public class C04_NestedForLoop {

    public static void main(String[] args) {
       for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print(j);
            }


            System.out.println();
        }


        System.out.println("-----------------------------------------");

        for(int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){

                System.out.print("*");
            }
            System.out.println();

        }


for (int i=6;0<=i;i--){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }

    System.out.println();
}

for (int a=1;a<=6;a++){
    for(int b=1;b<=6;b++){
        System.out.print(1);
    }
    System.out.println();
}


        for (int i = 1,k=0; i <4 ; i++) {//1
            for (int j=1;j<=i; j++) {
                k++;
                System.out.print(k);

            }
            System.out.println();
        }



    }

}


