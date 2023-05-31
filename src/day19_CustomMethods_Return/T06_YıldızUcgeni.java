package day19_CustomMethods_Return;

public class T06_YıldızUcgeni {
    public static void main(String[] args) {
   yildizUcgeni(3);
    }

    /**
     * Kullanıcıdan alınan sayısına göre yıldızlardan üçgen oluşturma
     * @param satirsayi
     */
    public static void yildizUcgeni (int satirsayi) {

        for (int i=satirsayi; i>0; i--) {
            for (int j=1; j<i; j++) {
                System.out.print(" ");}
            for(int k =(satirsayi+1)-i; k > 0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }




    }







