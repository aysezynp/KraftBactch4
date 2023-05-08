package day41_StaticAndInheritance;

import java.util.Random;

public class BankaMusteri {
    private String adSoyad;
    private String hesapNo;
    private double bakiye;
    private static int count=1;
    private final static String SIFRE="şafak";



    {
        this.hesapNo=hesapNoOlustur();
    }

    public BankaMusteri() {}

    public BankaMusteri(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public BankaMusteri(String adSoyad, double bakiye) {
        this.adSoyad=adSoyad;
        this.bakiye=bakiye;
    }

    public String getAdSoyad(){
        return this.adSoyad;
    }

    public void setAdSoyad(String adSoyad){
        this.adSoyad=adSoyad;
    }

    public String getHesapNo(){
        return this.hesapNo;
    }

    public void setHesapNo(String hesapNo,String sifre){
        if(sifre.equals(SIFRE)){
            this.hesapNo=hesapNo;
        }
    }

    public double getBakiye() {
        return bakiye;
    }

    public void paraEkle(double para){
        this.bakiye+=para;
    }

    public void paraCek(double para){
        if(this.bakiye>para){
            this.bakiye-=para;
        }
    }

       public static String hesapNoOlustur(){
       Random rm=new Random();
       int x=rm.nextInt(9000)+1000;//1000-9999 arası yapmış olduk.
       String hesapNo=count+""+2023+x;
       count++;
       return hesapNo;
    }

}