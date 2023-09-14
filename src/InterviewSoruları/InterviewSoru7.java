package InterviewSoruları;

public class InterviewSoru7 {
    ////Which method would you use to learn if a string is a rotation of another string?
    //    //rotation of car->car, arc, rca
    //    //sarı->sarı,arıs,rısa,ısar  -->en baştaki harfin en sona geçmesiyle oluşan yeni kelime..sıra bozulmuyor
    //    //ve en fazla harf sayısı kadar oluyor

    public static void main(String[] args) {

        System.out.println("isRotation(\"arc\",\"car\") = " + isRotation("arc", "car"));

    }

    public static boolean isRotation(String rotation, String str) {
        if (rotation == null || str == null) {
            return false;
        }
        if (rotation.length() != str.length()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            str = str.substring(str.length() - 1, str.length()).concat(str.substring(0, str.length() - 1));
            if (str.equals(rotation)) {
                return true;
            }

        }
        return false;
    }

    public static boolean isRotation1(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        return (str1 + str2).contains(str2);
    }

}

