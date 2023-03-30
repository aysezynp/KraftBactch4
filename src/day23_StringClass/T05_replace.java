package day23_StringClass;

public class T05_replace {
    public static void main(String[] args) {
        //18/10/2022 20:50:55 tarih bildirimini tarih damgasına
        //döndürün 18102019145055

        String bildirim="18/10/2022 20:50:55";
        System.out.println("bildirim.replace(\"18/10/2022 20:50:55\", \"181020191450551\") = "
                + bildirim.replace("18/10/2022 20:50:55", "181020191450551"));


        String damga=bildirim.replace("18/10/2022 20:50:55","181020191450551");
        System.out.println("tarih damga = " + damga);
    }

          }


