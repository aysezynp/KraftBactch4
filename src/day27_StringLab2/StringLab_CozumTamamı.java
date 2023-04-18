package day27_StringLab2;

public class StringLab_CozumTamamı {
    public static void main(String[] args) {
        System.out.println("SORU 1:");
        System.out.println("ilkUcHarf(\"Merhaba\") = " + ilkUcHarf("Merhaba"));
        System.out.println("......................................................");
        System.out.println("SORU 2:");
        System.out.println("boslukDoldur(\"Merhaba Dün ya\",\"%\") = " + boslukDoldur("Merhaba Dün ya", "%"));
        System.out.println("......................................................");
        System.out.println("SORU 3:");
        System.out.println("ikinciYariDondur(\"sanayagı\") = " + ikinciYariDondur("sanayagı"));
        System.out.println("ikinciYariDondur(\"Sanatyagı\") = " + ikinciYariDondur("Sanatyagı"));
        System.out.println("......................................................");
        System.out.println("SORU 4:");
        System.out.println("harfDegistir(\"Merhaba\",\"a\",\"e\") = " + harfDegistir("Merhaba", "a", "e"));
        System.out.println("......................................................");
        System.out.println("SORU 5:");
        System.out.println("harfAdetKere(\"ali\",3) = " + harfAdetKere("ali", 3));
        System.out.println("......................................................");
        System.out.println("SORU 6:");
        System.out.println("karakterSay(\"Ankara\",\"a\") = " + karakterSay("Ankara", "a"));
        System.out.println("......................................................");
        System.out.println("SORU 7:");
        System.out.println("harfSil(\"adana\",\"a\") = " + harfSil("adana", "a"));
        System.out.println("......................................................");
        System.out.println("SORU 8:");
        System.out.println("ilkKelimeBul(\"Kinlenmek\",\"kin\") = " + ilkKelimeBul(" Kinlenmek", "kin"));
        System.out.println("ilkKelimeBul(\"Ekin ektim\",\"kin\") = " + ilkKelimeBul(" Ekin ektim", "kin"));
        System.out.println("ilkKelimeBul(\"Keskin ilçesi\",\"kin\") = " + ilkKelimeBul("Keskin ilçesi", "kin"));
        System.out.println("......................................................");
        System.out.println("SORU 9:");
        System.out.println("kisaKelimeBastaUzunKelimeOrtada(\"ayşe\",\"mehmet\",3,2,3) = " + kisaKelimeBastaUzunKelimeOrtada("ayşe", "mehmet", 3, 2, 3));
        System.out.println("......................................................");
        System.out.println("SORU 10:");
        System.out.println("istenenKarakterSayısınaTamamla(\"Merhaba\",5) = " + istenenKarakterSayısınaTamamla("Merhaba", 5));
        System.out.println("istenenKarakterSayısınaTamamla(\"ali\",6) = " + istenenKarakterSayısınaTamamla("ali", 6));
        System.out.println("......................................................");
        System.out.println("SORU 11:");
        System.out.println("ilkSonKelimeKontrol(\"ankara\",2) = " + ilkSonKelimeKontrol("ankara", 2));
        System.out.println("ilkSonKelimeKontrol(\"kafka\",2) = " + ilkSonKelimeKontrol("kafka", 2));
        System.out.println("......................................................");
        System.out.println("SORU 12");
        System.out.println("soyad(\" Harun KEnan ÖZSOY  \") = " + soyad(" Harun KEnan ÖZSOY  "));
        System.out.println("......................................................");
        System.out.println("SORU 13");
        System.out.println("yinelenenKarakter(\"ankara\") = " + yinelenenKarakter("ankara"));
        System.out.println("yinelenenKarakter(\"merhaba\") = " + yinelenenKarakter("merhaba"));
        System.out.println("......................................................");
        System.out.println("SORU 14:");
        System.out.println("yinelenenKelimeleriBul(\"ankara\") = " + yinelenenKelimeleriBul("ankara"));
        System.out.println("yinelenenKelimeleriBul(\"javva\") = " + yinelenenKelimeleriBul("javva"));
        System.out.println("yinelenenKelimeleriBul(\"derslerime cok calisiyorum\") = " + yinelenenKelimeleriBul("derslerime cok calisiyorum"));
        System.out.println("......................................................");
        System.out.println("SORU 15:");
        System.out.println("unluUnsuzHarf(\"ankara\") = " + unluUnsuzHarf("ankara"));
        System.out.println("unluUnsuzHarf(\"Zeynep Nilda\") = " + unluUnsuzHarf("Zeynep Nilda"));
        System.out.println("......................................................");
        System.out.println("SORU 16:");
        System.out.println("ilkAdetHarfKesSonaEkle(null,3) = " + ilkAdetHarfKesSonaEkle(null, 3));
        System.out.println("ilkAdetHarfKesSonaEkle(\"Merhaba\",3) = " + ilkAdetHarfKesSonaEkle("Merhaba", 3));
        System.out.println("......................................................");
        System.out.println("SORU 17:");
        System.out.println("sonAdetHarfKesBasaEkle(\"Merhaba\",3) = " + sonAdetHarfKesBasaEkle("Merhaba", 3));
        System.out.println("......................................................");
        System.out.println("SORU 18:");
        System.out.println("benzersizHarf(\"aabbcc\") = " + benzersizHarf("aabbcc"));
        System.out.println("benzersizHarf(\"Araba\") = " + benzersizHarf("Araba"));
        System.out.println("......................................................");
        System.out.println("SORU 19:");
        System.out.println("kelimelerAyniHarflerdenOlusuyorMu(\"ayşe\",\"eşyaa\") = " + kelimelerAyniHarflerdenOlusuyorMu("ayşe", "eşyaa"));
        System.out.println("kelimelerAyniHarflerdenOlusuyorMu(\"iftar\",\"tarif\") = " + kelimelerAyniHarflerdenOlusuyorMu("iftar", "tarif"));
        System.out.println("kelimelerAyniHarflerdenOlusuyorMu(\"ennfes\", \"nefess\") = " + kelimelerAyniHarflerdenOlusuyorMu("ennfes", "nefess"));
        System.out.println("...........................................................");
        System.out.println("SORU 20:");
        System.out.println("ardiArdinaTekrarEdenHarfler(\"aabcccceeeeffff\") = " + ardiArdinaTekrarEdenHarfler("aabcccceeeeffff"));
        System.out.println("ardiArdinaTekrarEdenHarfler(\"abaccb\") = " + ardiArdinaTekrarEdenHarfler("abaccb"));
        System.out.println("...........................................................");
        System.out.println("SORU 23:");
        System.out.println("palindrome(\"kelek\") = " + palindrome("kelek"));
        System.out.println("palindrome(\"nalan\") = " + palindrome("nalan"));
        System.out.println("...........................................................");
        System.out.println("SORU 25:");
        System.out.println("kacAdetkelime(\"sevmek ya da sevmemek\",\"sev\") = " + kacAdetkelime("sevmek ya da sevmemek", "sev"));
        System.out.println("kacAdetkelime(\"javajavaJavaAvva\", \"ava\") = " + kacAdetkelime("javajavaJavaAvva", "ava"));
        System.out.println("...........................................................");
        System.out.println("SORU 26:");
        System.out.println("ikiKelimeAyniSayida(\"Ankara ile Bursa arası 500 km.\",\"ankara\",\"bursa\") = " + ikiKelimeAyniSayida("Ankara ile Bursa arası 500 km.", "ankara", "bursa"));
        System.out.println("ikiKelimeAyniSayida(\"Ankara Bursa kadar yeşil değil. Bursa bir başka\",\"ankara\",\"bursa\") = " + ikiKelimeAyniSayida("Ankara Bursa kadar yeşil değil. Bursa bir başka", "ankara", "bursa"));
        System.out.println("...........................................................");
        System.out.println("SORU 27:");
        System.out.println("sonuBitiyorsa(\"zamlanacak\",\"acak\") = " + sonuBitiyorsa("zamlanacak", "acak"));
        System.out.println("sonuBitiyorsa(\"kelime\",\"acak\") = " + sonuBitiyorsa("kelime", "acak"));
        System.out.println("...........................................................");
        System.out.println("SORU 28:");
        System.out.println(kelimeIcindeHarfSayisi("merhaba"));
        System.out.println("kelimeIcindeHarfSayisi(\"seni seviyorum\") = " + kelimeIcindeHarfSayisi("seni seviyorum"));
        System.out.println("...........................................................");
        System.out.println("SORU 29:");
        System.out.println("enCokHarf(\"merhaba\") = " + enCokHarf("merhaba"));


    }
    //SORU 1: Kullanıcıdan bir input alın ve girilen inputun ilk 3 harfini yazan , 3 kelimeden az
    //       ise inputu döndüren bir metot yazınız.

    public static String ilkUcHarf(String str){
        if(str==null) return null;
        String result="";
        if(str.length()<3){
            result=str;
        }
        result=str.substring(0,3);

       return result;
    }
    //SORU 2: Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin.

    public static String boslukDoldur(String str,String target){
        if(str==null) return null;
        return str.replace(" ", target);
    }

    //SORU 3: Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını döndüren bir program
    //        yazdırın.

    public static String ikinciYariDondur(String str){
        if(str==null) return null;
        String result="";
        if(str.length()%2==0){
            result=str.substring(str.length()/2);
            return result;
        }else{
           result= "Girilen kelime eşit uzunlukta değildir";}
        return result;
    }

    //SORU 4: Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve yeni harfi/harfleri
    //       alan ve buna göre kelimede/dizede sadece ilk bulduğu yeri değiştiren metodu
    //       yazınız.

    public static String harfDegistir(String str,String ch,String target){
        if(str==null) return null;
        return str.replaceFirst(ch, target);
    }

    //SORU 5: Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.

    public static String harfAdetKere(String str,int adet){
        if(str==null) return null;
        String result="";
        for (int i = 0; i <str.length(); i++) {
            for (int j = 0; j <adet; j++) {
                result+=str.charAt(i);
            }
        }return result;
    }

    //SORU 6: Kullanıcıdan bir kelime ve bir karakter alın ve bu kelimenin istenen karakterin
    //        kaç adet olduğunu döndüren metodu yazınız. (büyük küçük harf göz ardı edilecek)

     public static int  karakterSay(String str,String karakter){
       int sayac=0;
         for (int i = 0; i<str.length(); i++) {
             if(str.substring(i,i+1).equalsIgnoreCase(karakter)){
                sayac++;
             }
         }return sayac;
     }
    //SORU 7: Kullanıcıdan bir kelime ve bir harf alın kelimenizin içinde bu harfin hepsi
    //         kaldırılmış şekilde string döndüren programı yazınız.

    public static String harfSil(String str,String harf) {
        if(str==null) return null;
        return str.replace(harf, "");
    }

    //SORU 8: Kullanıcıdan bir kelime alın ve kin kelimesi başından veya ilk karakterden sonra
    //        gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün;

    public static boolean ilkKelimeBul(String str,String target){
        if(target==null)return false;
        str=str.toLowerCase().trim();
        target=target.toLowerCase();
        return str.startsWith(target)||str.substring(1,target.length()+1).equals(target);
    }
    //SORU 9: Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa uzun kelimeyi ortada 30
    //        defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.

    public static String kisaKelimeBastaUzunKelimeOrtada(String str1, String str2, int ilk, int orta, int son) {
        String result = "";
        if (str1.length() > str2.length()) {
            for (int i = 0; i < ilk; i++) {
                result += str2;
            }
            for (int i = 0; i < orta; i++) {
                result += str1;
            }
            for (int i = 0; i < son; i++) {
                result += str2;
            }
        } else {
            for (int i = 0; i < ilk; i++) {
                result += str1;
            }
            for (int i = 0; i < orta; i++) {
                result += str2;
            }
            for (int i = 0; i < son; i++) {
                result += str1;
            }
        }
        return result;
    }
    //SORU 10: Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın. 5 karakterin
    //         altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.

    public static String istenenKarakterSayısınaTamamla(String str, int karaktersayisi) {
        if(str==null) return null;
        String result = str;
        if (str.length()<=karaktersayisi) {
            for (int i = str.length(); i < karaktersayisi; i++) {
                result += ".";
            }
            return result;
        }
        return str.substring(0, karaktersayisi);
    }
    //SORU 11: Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2 harfi sonunda yer alıyorsa true
    //         almıyorsa false yazdırın.

    public static boolean ilkSonKelimeKontrol(String str,int harfSayi){
        if (str == null || str.length()<harfSayi || harfSayi< 1) return false;
        return str.substring(0,harfSayi).equalsIgnoreCase(str.substring(str.length()-2));
    }

    //SORU 12: Kullanıcının konsoldan ad ve soyad bilgilerini konsoldan alın
    //         Ekrana "Soy isminiz ..(soyad).. dır." Yazan metodu yazınız

    public static String soyad(String str){
        if(str==null) return null;
        str=str.trim();
        return str.substring(str.lastIndexOf(" ")+1);
    }

    //SORU 13:Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden
    //        çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı

    public static String yinelenenKarakter(String str){
        if(str==null) return null;
        String result="";
        String ch;
        for (int i = 0; i <str.length() ; i++){
            ch=str.charAt(i)+"";
            if(!result.contains(ch)){
                result+=ch;
            }
        }return result;
    }

   //SORU 14: Kullanıcıdan bir kelime alan ve sonucunda yinelenen kelimeleri string
    //        olarak return eden metot yazınız.
    //" Java " output:a
    //  0123
    // " Javva " output:av
    //" Derslerime cok calisiyorum" output:erslimc

    public static String yinelenenKelimeleriBul(String str) {
        str = str.replace(" ", "");
        String result = "";

        for (; str.length() > 0; ) {
            if (str.indexOf(str.substring(0, 1)) != str.lastIndexOf(str.substring(0, 1)))
                result += str.substring(0, 1);
            str = str.replace(str.substring(0, 1),"");
        }
        return result;
    }

    // SORU 15: Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki ünlü ve ünsüz harfleri
    //          ayrı ayrı ekrana yazan programı yazınız.

    public static String unluUnsuzHarf(String str) {
        String unlu = "";//ankara
        String unsuz = "";
        String ch;
        for (; str.length() > 0; ) {
            if (str.substring(0,1).equals("a") || str.substring(0,1).equals("e") || str.substring(0,1).equals("ı") ||
                    str.substring(0,1).equals("i") || str.substring(0,1).equals("u") || str.substring(0,1).equals("ü")
                    || str.substring(0,1).equals("o") || str.substring(0,1).equals("ö")||str.substring(0,1).equals("A")
                    ||str.substring(0,1).equals("E") || str.substring(0,1).equals("I") ||
                    str.substring(0,1).equals("İ") || str.substring(0,1).equals("U") || str.substring(0,1).equals("Ü")
                    || str.substring(0,1).equals("O") || str.substring(0,1).equals("Ö")){
                unlu += str.substring(0,1);
                str=str.replace(str.substring(0,1),"");
            } else {
                unsuz += str.substring(0,1);
                str=str.replace(str.substring(0,1),"");
            }
        }
        return "ünlü harfler:" + unlu +"\nünsüz harfler:" + unsuz;
    }

    //SORU 16: Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin ilk 3
    //          harfini kelimeden keserek sonuna ekleyin.

    public static String ilkAdetHarfKesSonaEkle(String str, int karakterSayi) {
        if (str == null) return null;
        if (str.length() < karakterSayi)
            return "Girdiğiniz kelimenin uzunluğu en az girdiğiniz karakter sayısı kadar olmalıdır.";
        str = str.trim();
        return str.replace(str.substring(0, karakterSayi), "").concat(str.substring(0, karakterSayi));

    }

    //SORU 17: Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin son 3
    //         harfini kelimeden keserek kelimenin başına ekleyin.


    public static String sonAdetHarfKesBasaEkle(String str, int karakterSayi) {
        if (str == null) return null;
        if (str.length() < karakterSayi)
            return "Girdiğiniz kelimenin uzunluğu en az girdiğiniz karakter sayısı kadar olmalıdır.";
        str = str.trim();
        return str.substring(str.length() - karakterSayi).concat(str.replace(str.substring(str.length() - karakterSayi), ""));
    }

    //SORU 18. Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun. (Büyük
    //         küçük harf gözardı edilecek.) Hiçbir harf benzersiz değil ise benzersiz harf yoktur
    //         ikazı versin.
    public static String benzersizHarf(String str) {
        str = str.toLowerCase();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.substring(i, i + 1)) == str.lastIndexOf(str.substring(i, i + 1))) {
                result = str.substring(i, i + 1);
                break;
            }
            result = "Benzersiz harf yoktur";
        }
        return result;
    }

    //SORU 19:Kullanıcıdan iki kelime alın ve bu kelimeler aynı harflerden oluşuyorsa(her harf
    //        eşit sayıda içerecek,büyük küçük harf göz ardı edilecek) true oluşmuyorsa false
    //        yazdırın. (anagram kelime ise)

    public static boolean kelimelerAyniHarflerdenOlusuyorMu(String str1, String str2) {
        str1 = str1.toLowerCase();//ayşe
        str2 = str2.toLowerCase();//eşya
        if (str1.length()!=str2.length()) return false;
        for (int i = 0; i<str1.length(); i++) {
          if  (!str2.contains(str1.substring(i,i+1))){
             return false;
          }
          str2=str2.replaceFirst(str1.substring(i,i+1),"");
    } return true;
    }

    // int index = str2.indexOf(str1.charAt(i));
    // if (index == -1) return false;
    // str2 = str2.substring(0, index) + str2.substring(index + 1);

    //SORU 20:Kullanıcıdan bir kelime alın ve ardı ardına tekrar eden harfleri döndüren metodu
    //       yazın.

    public static String ardiArdinaTekrarEdenHarfler(String str) {
        String result = "";
        for (; str.length() > 0; ) {
            if (str.substring(0, 1).equals(str.substring(1, 2))) {
                result += str.substring(0, 1);
                str = str.replace(str.substring(0, 1), "");
            } else {
                str = str.replace(str.substring(0, 1), "");
            }
        }
        return result;
    }
    //NOT: soru 21 StringLab21 class ında

    //SORU 23: Kullanıcıdan bir kelime alın ve bu kelimenin tersten okunuşu kelime ile aynı ise
    //         true değil ise false döndüren metot yazınız.
    public static boolean palindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.substring(i, i + 1);
        }
        return reversed.equalsIgnoreCase(str);
    }
    //SORU 25:Kullanıcıdan bir input alın ve bu inputun içerisinde kaç adet sev bulunduğunu
    //        ekrana yazdırın.
    //Seni seviyorum

    public static int kacAdetkelime(String str, String target) {
        str = str.toLowerCase();
        target = target.toLowerCase();
        int sayac = 0;
        for (int i = 0; i<str.length(); i++) {
            if (str.contains(target)) {
                sayac++;
                str = str.replaceFirst(target, "");
            }
        }
        return sayac;
    }

    //SORU 26: Bursa ile Ankara kelimeli cümlenin içerisinde aynı sayıda dönüyorsa true farklı
    //         sayılarda dönüyorsa false yazdıran meto

    public static boolean ikiKelimeAyniSayida(String cumle, String target1, String target2) {
        int sayac1=0;
        int sayac2=0;
        cumle = cumle.toLowerCase();
        target1 = target1.toLowerCase();
        target2 = target2.toLowerCase();
        for (int i = 0; i < cumle.length(); i++) {
            if(cumle.contains(target1)){
                sayac1++;
                cumle=cumle.replaceFirst(target1, "");}
            if (cumle.contains(target2)){
                sayac2++;
                cumle=cumle.replaceFirst(target2, "");}
        }
           if(sayac1==sayac2) return true;
           else return false;}

        //SORU 27: Kullanıcıdan bir kelime alın ve sonu acak ile bitiyorsa true bitmiyorsa false
        //         döndüren metodu yazdırın

        public static boolean sonuBitiyorsa (String str, String target){
            str = str.toLowerCase();
            target = target.toLowerCase();
            return str.endsWith(target);
        }

    //SORU 28: Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki harf sayılarını başına
    //         yazarak ekrana döndürün.(büyük küçük harfler göz ardı edilecek)

    public static String kelimeIcindeHarfSayisi (String str){
        str = str.toLowerCase().replace(" ", "");
        String result = "";
        int count;
            for (int i = 0; i < str.length(); i++) {
                String ch = str.charAt(i) + "";
                count = str.length() - (str.replace(ch, "").length());
                if (!result.contains(ch)) {
                    result += count + ch;
                }
            }
            return result;
        }
    //SORU 29: Kullanıcıdan bir dize sözcük alın ve en çok harfi döndüren metodu yazınız.

    public static char enCokHarf(String str) {
         char enCokHarf = ' ';//Merhaba
         int harfSayi = 0;

         for (int i = 0; i < str.length(); i++) {
             char ch = str.charAt(i);
             int sayac = 0;
             for (int j = i; j < str.length(); j++) {
                 if (str.charAt(j) == ch) {
                     sayac++;
                 }
             }
             if (sayac > harfSayi)
                 harfSayi = sayac;
             enCokHarf = ch;
         }return enCokHarf;
     }


}



