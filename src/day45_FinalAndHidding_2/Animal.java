package day45_FinalAndHidding_2;

public abstract class Animal extends Canlilar {
    public abstract void konus();

  /* public void nefesAl(){
        System.out.println("Animal nefes alıyor");
    }*/

    public void hareketEt(){
        System.out.println("animal hareket ediyor");

    }
//Animal abstract klası canlılardaki abstact metodu tamamlamak zorunda değil,
// tamamlarsa animal sınıfına extend eden sınıflar tamamlama zorunluluğundan kurtulur;
// tamamlamazsa animal sınıfın alt klassları tamamlamak zorunda
}
