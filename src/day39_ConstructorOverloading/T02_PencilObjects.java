package day39_ConstructorOverloading;

public class T02_PencilObjects {
    public static void main(String[] args) {
        Pencil pencil1 = new Pencil();
        System.out.println(pencil1);
        System.out.println(".................................................");

        Pencil pencil2 = new Pencil("mavi");
        System.out.println(pencil2);
        pencil2.write();
        System.out.println(".................................................");

        Pencil pencil3 = new Pencil("Mavi", 13);
        System.out.println(pencil3);
        System.out.println(".................................................");

        Pencil pencil4 = new Pencil("Sarı", 5, true);
        System.out.println(pencil4);
        pencil4.write();
        pencil4.delete();
        pencil4.renkDegistir(pencil4,"Kırmızı");
        pencil4.haveEraser=false;
        pencil4.delete();



    }
}