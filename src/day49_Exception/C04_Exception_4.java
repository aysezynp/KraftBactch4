package day49_Exception;

import day39_ConstructorOverloading.Cat;

public class C04_Exception_4 {
    public static void a() {
   // b();
    }

    public static void b() throws InterruptedException {
    d();
    }

    public static void c() {
    try {
        d();
    }catch(Exception e){}
    }

    public static void d() throws InterruptedException {//checked exception, ya handle edilmeli yada throws ile sıkıntılı olduğu declare edilmeli
     Thread.sleep(3000);

    }

    public static void main(String[] args) {
        metotC();
    }
    public static void metotA()throws Exception{
        throw new Exception("hata bulundu");
    }
     public static void metotB() throws Exception{
      metotA();
   }

   public static void metotC(){
       try{
           metotB();
       }catch (Exception e){
           e.printStackTrace();
       }
   }

}

