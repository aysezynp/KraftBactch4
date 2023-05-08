package day43_Task_Banka;

import java.util.Random;
import java.util.Scanner;

public class Musteri extends Sube{
    private String musteriAdSoyad;
    private String tlHesapNo;
    private double bakiye;
    boolean isPersonel;
    private static int count=1;
    private final static String SIFRE="şafak";

    {
        this.tlHesapNo=hesapNoOlustur();
    }

        public static void islemYap(Musteri musteri){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: 1.Bakiye 2.Para ekle 3. Para çek");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                System.out.println(musteri.getBakiye());
                break;
            case 2:
                System.out.print("Yatırmak istediğiniz tutarı giriniz:");
                double ekpara = scan.nextDouble();
                musteri.paraEkle(ekpara);
                break;
            case 3:
                System.out.print("Çekmek istediğiniz tutarı giriniz:");
                double cekpara = scan.nextDouble();
                if(musteri.bakiye>cekpara){
                musteri.paraCek(cekpara);}
                break;
        }
    }
    public Musteri(String musteriAdSoyad) {
        this.musteriAdSoyad = musteriAdSoyad;
    }

    public Musteri(String musteriAdSoyad, double bakiye, boolean isPersonel) {
        this(musteriAdSoyad);
        this.bakiye=bakiye;
        this.isPersonel=isPersonel;
    }
    public Musteri(String musteriAdSoyad, double bakiye) {
        this.musteriAdSoyad=musteriAdSoyad;
        this.bakiye=bakiye;
    }

    public String getMusteriAdSoyad() {
        return musteriAdSoyad;
    }

    public void setMusteriAdSoyad(String musteriAdSoyad) {
        this.musteriAdSoyad = musteriAdSoyad;
    }

    public String getTlHesapNo() {
        return tlHesapNo;
    }

    public void setTlHesapNo(String tlHesapNo,String sifre) {
        if(sifre.equals(SIFRE)){
            this.tlHesapNo = tlHesapNo;
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

    public static String hesapNoOlustur() {
        Random rm = new Random();
        int x = rm.nextInt(9000) + 1000;
        String hesapNo = count + "" + 2023 + x;
        count++;
        return hesapNo;

    }


















}
