package day16_BranchingStatements;

public class c06_NestedLoop_Branching {
    public static void main(String[] args) {
       /* outerLoop: for (int i = 0; i < 5; i++) {
            System.out.print("A");
            innerLoop:for(int j=0;j<5;j++){
                if(j==2){
                    break outerLoop;
                }

                System.out.print("B");


            }


        }*/

     /*   outerLoop: for (int i = 0; i < 5; i++) {
            System.out.print("A");
            innerLoop: for (int j = 0; j < 5; j++) {
                System.out.print("B");
                harun: for (int k = 0; k < 10; k++) {
                    System.out.print("C");
                    if (k == 0) {
                        break outerLoop;
                    }

                }
            }
        }*/
        outerLoop: for (int i = 0; i < 3; i++) {
            System.out.print("A");
            innerLoop: for (int j = 0; j < 5; j++) {
                System.out.print("B");
                harun: for (int k = 0; k < 10; k++) {
                    System.out.print("C");
                    if (k == 0) {
                         continue outerLoop;
                    }

                }
            }
        }
    }
}
