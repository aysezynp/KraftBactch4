package day50_Exceptions_Collection;

public class C05_Excepiton_9 {
    public static void main(String[] args) {
        try{
            throw new Exception("hata");//Exception
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        c();
    }

    static void c(){
        try{
            b();
        }catch(Exception a){
            System.out.println(a.getMessage());
        }
    }

    static void b() throws Exception {
        a();
    }

    static void a() throws Exception {           //throws anahtar kelimesi ise bir exceptionı declare ederiz,
                                                // throw anahtar kelimesi ile yeni bir exception fırlatabiliriz.
        throw new Exception("harun hata fırlattı");
    }


}
