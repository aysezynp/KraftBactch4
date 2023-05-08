package day43_Task_Banka;

public class Banka {
    String bankName;
    String genelMerkezAdresi;
    String genelMerkezTel;
    private int subeSayisi;

    static {
        System.out.println("Bankamıza Hoş geldiniz");
    }

    public Banka() {
    }

    public Banka(String bankName) {
        this.bankName = bankName;
    }

    public Banka(String bankName, String genelMerkezAdresi, String genelMerkezTel, int şubeSayisi) {
        this(bankName);
        this.genelMerkezAdresi = genelMerkezAdresi;
        this.genelMerkezTel = genelMerkezTel;
        this.subeSayisi = şubeSayisi;
    }

    public void setSubeSayisi(int subeSayisi) {
        if (subeSayisi < 0) {
            return;
        }
        this.subeSayisi = subeSayisi;
    }

    public int getSubeSayisi() {
        return subeSayisi;
    }

}