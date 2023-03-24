package day19_CustomMethods_Return;

public class T03_DersNotu {
    public static void main(String[] args) {
        System.out.println("grades(45,55,87) = " + grades(45, 55, 87));
        System.out.println("grades(10,0,60) = " + grades(10, 0, 60));
        System.out.println("grades(75,86,90) = " + grades(75, 86, 90));
    }
    /**
     * 3 ders notu kabul eden ve ortalamayı harf cinsinden döndüren metot
     * @param score1
     * @param score2
     * @param score3
     * @return
     */
    public static char grades (int score1, int score2,int score3){
    char grade=' ';
    double ort= ((double)score1+score2+score3)/3;
    if (ort>75)
        grade='A';
    else if(ort>50)
        grade='B';
    else
        grade='C';

    return grade;

}
}