package day11_ControlFlowStatements_IF;

public class C04_IF_ELSE {
    public static void main(String[] args) {
        int fizik = 50;
        int kimya = 55;

        int ort = (fizik + kimya) / 2;
        boolean result = (ort > 50);
        if (result) {
        System.out.println("Ali geçti");
    }else{
            System.out.println("Ali kaldı");
        }
}
}