package day17_Methods;

public class C05_KendiMetotCalismam {
    public static void main(String[] args) {
       message_2();

    }

    public static void message_1() {
        message_3();
        System.out.print("1");
    }
    public static void message_2(){
        message_1();
        System.out.print("2");
    }
    public static void message_3(){
        System.out.print("3");


    }
}