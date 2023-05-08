package day41_StaticAndInheritance;

public class FarkliClass {
    public static void main(String[] args) {
        BankaMusteri harun = new BankaMusteri();
        BankaMusteri mehmet = new BankaMusteri();
        System.out.println(mehmet.getHesapNo());
        mehmet.setHesapNo(BankaMusteri.hesapNoOlustur(),"harun");
        System.out.println(mehmet.getHesapNo());
        mehmet.setHesapNo(BankaMusteri.hesapNoOlustur(),"şafak");
        System.out.println(mehmet.getHesapNo());
    }

}