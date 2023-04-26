package day37_WrapperAndArrayList;

import java.util.ArrayList;

public class C03_ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Harun");
        name.add("Ziya");
        name.add("mehtap");
        name.add("sami");
        name.add("Harun");
        name.add("Ziya");


        ArrayList<String> name2 = new ArrayList<>();
        name2.add("Harun");
        name2.add("Ziya");

        name.removeAll(name2);
        System.out.println(name);

        //
    }
}
