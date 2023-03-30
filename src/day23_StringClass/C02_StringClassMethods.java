package day23_StringClass;

public class C02_StringClassMethods {
    public static void main(String[] args) {
        //length

        String programmingLanguage="Java";//String pool içerisinde bir öbje oluşturdu
        System.out.println("programmingLanguage.length() = " + programmingLanguage.length());

        programmingLanguage="python";    //String immutable, javayı işaret ediyordu, string pool da yeni bir obje oluşturdu
                                         // o obejenin içerisine python yazdı

        System.out.println("programmingLanguage.length() = " + programmingLanguage.length());

        System.out.println("..................................................");

        //TOUPPERCASE(), tolowercase()

        System.out.println("programmingLanguage.toUpperCase() = " + programmingLanguage.toUpperCase());
        System.out.println("programmingLanguage = " + programmingLanguage);

        programmingLanguage= programmingLanguage.toUpperCase();
        System.out.println("programmingLanguage = " + programmingLanguage);

        System.out.println("programmingLanguage.toLowerCase() = " + programmingLanguage.toLowerCase());
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("..................................................");

        //charAt();programmingLanguage=PYTHON
        System.out.println("programmingLanguage.charAt(0) = " + programmingLanguage.charAt(0));
        System.out.println("programmingLanguage.charAt(5) = " + programmingLanguage.charAt(5));
        System.out.println("programmingLanguage.charAt(programmingLanguage.length()-1) = " + programmingLanguage.charAt(programmingLanguage.length() - 1));
        System.out.println("programmingLanguage.charAt(2) = " + programmingLanguage.charAt(2));
        System.out.println("programmingLanguage.charAt(programmingLanguage.length()-4) = " + programmingLanguage.charAt(programmingLanguage.length() - 4));

        System.out.println("..................................................");

      //concat()
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("programmingLanguage.concat(\" Programlama dili Java'dan daha kolaydır.\") = " + programmingLanguage.concat(" Programlama dili Java'dan daha kolaydır."));
        programmingLanguage=programmingLanguage.concat(" Programlama dili Java'dan daha kolaydır.");

        System.out.println("..................................................");

      //contains()
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("programmingLanguage.contains(\" dili\") = " + programmingLanguage.contains(" dili"));
        System.out.println("programmingLanguage.contains(\" dili J\") = " + programmingLanguage.contains(" dili J"));
        System.out.println("programmingLanguage.contains(\" python \") = " + programmingLanguage.contains(" python "));
        System.out.println("programmingLanguage.contains(\"P\") = " + programmingLanguage.contains("P"));
        System.out.println("programmingLanguage.contains(\"w\") = " + programmingLanguage.contains("w"));

        System.out.println("..................................................");

        //trim()
        String s="   Hello   World   ";
        System.out.println(s);
        System.out.println(s.trim());
        String trimeds=s.trim();

        System.out.println("..................................................");

        //replace()
        System.out.println("s.replace(\"Hello\", \"Big Big\") = " + s.replace("Hello", "Big Big"));
        System.out.println("trimeds.replace(\"Hello\",\"Developer\") = " + trimeds.replace("Hello", "Developer"));
        System.out.println("trimeds.replace(\"Hel\",\" \") = " + trimeds.replace("Hel", " "));

        System.out.println("..................................................");

        //indexOf()
        System.out.println(trimeds);
        System.out.println("trimeds.indexOf(\"H\") = " + trimeds.indexOf("H"));
        System.out.println("trimeds.indexOf(\"Hell\") = " + trimeds.indexOf("Hell"));
        System.out.println("trimeds.indexOf(\"World\") = " + trimeds.indexOf("World"));

    }
}
