package day43_Task_Banka;

public class MainBanka {
    public static void main(String[] args) {

        Banka bank1 = new Banka("ziraat", "jcjhjklbkşnlşm", "33485769",9);

       Musteri musteri1=new Musteri("ayşe",20000,true);
        System.out.println(musteri1.getBakiye());
        Musteri.islemYap(musteri1);
        System.out.println(musteri1.getBakiye());


    }
}