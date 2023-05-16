package day53_ExceptionAndCollectrion_Summary;

import java.util.LinkedList;
import java.util.Queue;

public class C04_List_Summary_3 {

    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.add("Harun");
        queue.add("Ayşe");
        queue.add("Ziya");
        queue.add("Umit");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println("...................");
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.offer("Mehmet"));
        System.out.println(queue);
    }
}

