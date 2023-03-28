package day21_Class_And_Objects;

public class Car {
    String marka;
    int modelYil;
    int beygir;
    String saseNo;
    boolean isSuv;
    boolean isManual;

    public void hizlan(){
        System.out.println("Araç hızlanıyor");
    }
    public String beygirKarsilastir(){
        if(beygir>100){
            return "Güçlü araç";
        }
        return "Zayıf araç";
    }





}
