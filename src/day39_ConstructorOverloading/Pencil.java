package day39_ConstructorOverloading;
public class Pencil {
    public String color;
    public int length;
    public boolean haveEraser;

    public Pencil() {
    }

    public Pencil(String color) {
        this.color = color;
    }

    public Pencil(String color, int length) {
        this.color = color;
        this.length = length;
    }

    public Pencil(String color, int length, boolean haveEraser) {
        this(color, length);
        this.haveEraser = haveEraser;
    }

    public void write() {
        System.out.println(color + " renkli " + length + " cm uzunluğundaki kalem yazıyor.");
    }

    public void delete() {
        if (haveEraser) {
            System.out.println(color + " renkli kalem silebiliyor");
        }else{
            System.out.println(color + " renkli kalem silgisi olmadığı için silemiyor");
        }
    }

    public String toString(){
        return "Pencil{"+
                "color='"+color+"', "+
                "length='"+length+"', "+
                "have eraser='"+haveEraser+"'}";
    }
    public Pencil renkDegistir(Pencil pencil,String renk){
        pencil.color=renk;
        return pencil;
    }
}
