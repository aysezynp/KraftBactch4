package day38_Constructors;

public class C04_StringArgsExample {
    // özel bir metod
    //args=arguments
    //String [] args String arraysimiz var ve adı args
    //bu argümanlar dısarıdan girilen veriler
    public static void main(String[] args) {
        System.out.println("args.length = " + args.length);
        for (String arg : args) {
            System.out.println(arg);
        }
        args[0]="isa";
        args[1]="musa";
        System.out.println(".....................");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
