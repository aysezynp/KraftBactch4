package day16_BranchingStatements;

public class C02_Branching_Statements {
    public static void main(String[] args) {
        //break, continue, return
       /* System.out.println("program başladı");
        int x=1;
        for (int i=0;i<10;i++){
            x++;
            if (x==5){
                break;
            }

            System.out.print(x+" ");

       int toplam=0;
for(int i=0;i<=20;i++){
    if (i%2==1){
        continue;
    }

        toplam+=i;
    }
    System.out.println(toplam);*/

       /* for (int i=0;i<10;i++){
            if(i%2==0){
                continue;
            }
            System.out.print(i+" ");

        }
      for (int i=0;i<10;i++){
           if(i%2==1){
            continue;}
          System.out.print(i+" ");


}*/

   /*  int toplam=0;
     for(int i=0;i<=20;i++){
         if(i%2==1){
             continue;
         }
         toplam+=i;

     }
        System.out.println(toplam);*/



      /*  for(int i=0;i<100;i++){
            if(i%2==1){
                continue;
            }
            if(i>10){

            break;}

            System.out.print(i+" ");
        }*/

//1 den 100 e kadar 5 in katlarını ekrana yazdıran programı continue kullanarak yazınız.

      /*  for(int i=1;i<100;i++){
            if(i%5!=0){
                continue;
            }

            System.out.print(i+" ");}*/


        for (int i = 0; i < 2; i++) {
            System.out.print("A");
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    break;
                }
                System.out.print("B");


            }


        }


    }

}