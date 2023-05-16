package day50_Exceptions_Collection;

public class C03_Exception_7 {

    public static void main(String[] args) {
        b();

    }

   static void b(){
        try {
            a();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   static void a() throws InterruptedException {
        Thread.sleep(3000);
    }
}
