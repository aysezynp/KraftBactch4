package day43_Task_Banka;

public class Sube extends Banka {
    String subeAdi;
    int subeKodu;
    private int musteriAdet;

    public Sube() {
    }
    public Sube (String subeAdi){
        this.subeAdi=subeAdi;
    }

    public Sube(String BankName, String subeAdi, int subeKodu) {
        super(BankName);
        this.subeAdi = subeAdi;
        this.subeKodu = subeKodu;
    }

    public int getMusteriAdet() {
        return musteriAdet;
    }

    public void setMusteriAdet(int musteriAdet) {
        if (musteriAdet < 0) {
            return;
        }
        this.musteriAdet = musteriAdet;
    }

}
