package day50_Exceptions_Collection;

public class HarunException extends Exception {
    public String message;
    public HarunException(String message){
        this.message=message;
    }

}
class Demo {
    public static void main(String[] args) {
        try {
            throw new HarunException("hata");
        } catch (Exception a) {
            a.printStackTrace();
            System.out.println(a.getMessage());
        }
    }
}