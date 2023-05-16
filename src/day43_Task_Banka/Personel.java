package day43_Task_Banka;


import java.util.Random;

public class Personel extends Sube{
        private String personelAdiVeSoyadi;
        private String personelNo;
        boolean isStajyer;
        String birim;
        private static int count=1;


       {
           this.personelNo=personelNoOlustur();
       }

        public Personel(String bankName,String subeAdi,String personelAdiVeSoyadi,boolean isStajyer,String birim){
           super.bankName=bankName;
            super.subeAdi=subeAdi;
            this.personelAdiVeSoyadi=personelAdiVeSoyadi;
            this.isStajyer=isStajyer;
            this.birim=birim;
        }

    public String getPersonelAdiVeSoyadi() {
        return personelAdiVeSoyadi;
    }

    public void setPersonelAdiVeSoyadi(String personelAdiVeSoyadi) {
        this.personelAdiVeSoyadi = personelAdiVeSoyadi;
    }

    public String getPersonelNo() {
        return personelNo;
    }

    public void setPersonelNo(String personelNo) {
            this.personelNo = personelNo;
        }

    public  static String personelNoOlustur(){
           Random rm=new Random();
           int x= rm.nextInt(1000,9999);
           String personelNo="BANK"+count+x;
           count++;
           return personelNo;
    }

    }



