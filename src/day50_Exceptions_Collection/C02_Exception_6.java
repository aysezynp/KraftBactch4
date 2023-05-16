package day50_Exceptions_Collection;

public class C02_Exception_6 {
    public static void main(String[] args) {
      /*// 1.ALIŞTIRMA..............................................
       System.out.println("0");
            try {
                System.out.println("1");
                System.out.println("2");

            }catch (Exception e){
                System.out.println("3");
                try{
                    System.out.println(5/0);
                }catch(Exception f){
                    System.out.println("4");
                }
            }
           finally{
                System.out.println("5");
            }

            // 0,1,2,5

            */

       /* //2.ALIŞTIRMA..................................................................................

        System.out.println("0");

        try {
            System.out.println("1");
            System.out.println(5/0);
            System.out.println("2");

        }catch (Exception e){
            System.out.println("3");
            try{
                System.out.println(5/0);
            }catch(Exception f){
                System.out.println("4");
            }
        }
        finally{
            System.out.println("5");
        }

        //0,1,3,4,5

*/

   // 3.ALIŞTIRMA..................................................................................

        System.out.println("0");

        try {
            System.out.println("1");
            System.out.println(5/0);
            System.out.println("2");

        }catch (Exception e){
            System.out.println("3");
            try{
                System.out.println("4");
            }catch(Exception f){
                System.out.println("5");
                System.out.println(5/0);
            }
        }
        finally{
            System.out.println("6");
        }
        //0,1,3,4,6

        System.out.println("0");

        try {
            System.out.println("1");
            System.out.println(5/0);
            System.out.println("2");

        }catch (Exception e){

            System.out.println("3");
            try{
                System.out.println("4");
            }catch(Exception f){
                System.out.println("5");
                System.out.println(5/0);
            }
        }
        finally{
            System.out.println(5/0);
            System.out.println("6");
        }

        System.out.println("kod devam ediyor....");

    //0,1,3,4 burda kod devam ediyoru yazmaz

    /*   finally{//bu bloğun içinde de try catch yapabilirim.
       try{
            System.out.println(5/0);
            System.out.println("6");
        }
       catch (Exception e){
           System.out.println("ben bir öğretmenim");
       }

        System.out.println("kod devam ediyor....");*/

    }
}


