package day34_Arrays_4;

import java.util.Arrays;

public class C06_2dArrayTask {
    public static void main(String[] args) {
        //«merhaba java insanları bugün nasılsınız» cümlesini [merhaba, java,
        //insanları] ve [bugün, nasılsınız] şeklinde 2 ayrı array a convert edin.

        System.out.println(Arrays.deepToString(splitArray("merhaba java insanları bugün nasılsınız")));

    }

    public static String[][] splitArray(String str) {

        String[] words = str.split(" ");
        String[][] yeni = new String[2][];
        String[] strArr1 = Arrays.copyOfRange(words, 0, 3);
        String[] strArr2 = Arrays.copyOfRange(words, 3, 5);
        String[][] result = {strArr1, strArr2};
        return result;
    }
}