package day27_StringLab2;



public class StringLab_8_13HocaCozum {
        public static void main(String[] args) {
            System.out.println("ilkKelimeKontrol(\"Kinlenmek\",\"kin\") = " + ilkKelimeKontrol("Kinlenmek", "kin"));
            System.out.println("ilkKelimeKontrol(\"ekin ektim\",\"kin\") = " + ilkKelimeKontrol("ekin ektim", "kin"));
            System.out.println("ilkKelimeKontrol2(\"ekin ektim\",\"kin\") = " + ilkKelimeKontrol2("ekin ektim", "kin"));
            System.out.println("istenenKarakterSayisinaTamamla(\"ali\",5,'.') = " + istenenKarakterSayisinaTamamla("ali", 5, '.'));
            System.out.println("ilkSonEKelimeKontrol(\"salsa\") = " + ilkSonEKelimeKontrol("salsa"));
            System.out.println("ilkSonEKelimeKontrol(\"kafka\") = " + ilkSonEKelimeKontrol("kafka"));
            System.out.println("soyAd(\" AYşe Zeynep ARSLAN      \") =" + soyAd(" AYşe Zeynep ARSLAN      "));
            System.out.println("yinelenenKarakter(\"ankara\") = " + yinelenenKarakter("ankara"));
            System.out.println("yinelenenKarakter2(\"ankara\") = " + yinelenenKarakter2("ankara"));
        }
        //SORU 8: Kullanıcıdan bir kelime alın ve kin kelimesi başından veya ilk karakterden sonra
        //        gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün.

        public static boolean ilkKelimeKontrol(String str,String target){
            if(target==null)return false;
            str=str.toLowerCase();
            target=target.toLowerCase();
            return str.startsWith(target)||str.substring(1).startsWith(target);}

        public static boolean ilkKelimeKontrol2(String str,String target){
            return str.substring (0,target.length()+1).contains(target);
            }


        //SORU 9: Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa uzun kelimeyi ortada 30
        //        defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.

            public static String kisaKelimeBastaUzunKelimeOrtada(String str1, String str2, int ilkDongu, int ortaDongu, int sonDongu) {
                String result = "";
                if (str1.length() < str2.length()) {
                    for (int i = 0; i < ilkDongu; i++) {
                        result += str1;
                    }
                    for (int i = 0; i < ortaDongu; i++) {
                        result += str2;
                    }
                    for (int i = 0; i < sonDongu; i++) {
                        result += str1;
                    }
                } else {
                    for (int i = 0; i < ilkDongu; i++) {
                        result += str2;
                    }
                    for (int i = 0; i < ortaDongu; i++) {
                        result += str1;
                    }
                    for (int i = 0; i < sonDongu; i++) {
                        result += str2;
                    }
                }
                return result;

            }

        //SORU 10:Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın. 5 karakterin
        //        altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.

        public static String istenenKarakterSayisinaTamamla(String str,int karakterSayısı){
            String result=str;
            if(str.length()>=karakterSayısı) return str.substring(0,karakterSayısı);
            for (int i = str.length(); i <karakterSayısı ; i++) {
                result+=".";

            }return result;
        }
        public static String istenenKarakterSayisinaTamamla(String str,int karakterSayısı,char karakter){
        String result=str;
        if(str.length()>=karakterSayısı) return str.substring(0,karakterSayısı);
        // int count=karakterSayısı-str.length();
        //     for (int i = 0; i <count ; i++) {
        //        str+=karakter; }
        for (int i = str.length(); i <karakterSayısı ; i++) {
            str+=karakter;

            }return str;

       }


      //SORU 11: Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2 harfi sonunda yer alıyorsa true
      //         almıyorsa false yazdırın.

       public static boolean ilkSonEKelimeKontrol(String str){
            if (str==null||str.length()<2)return false;
            return str.substring(0,2).equalsIgnoreCase(str.substring(str.length()-2));

       }
       public static boolean ilkSonEKelimeKontrol(String str, int karakterSayisi) {
           if (str == null || str.length() < karakterSayisi || karakterSayisi < 1) return false;
           return str.substring(0, karakterSayisi).equalsIgnoreCase(str.substring(str.length() - 2));}

       //SORU 12:  Kullanıcının konsoldan ad ve soyad bilgilerini konsoldan alın
       //          Ekrana "Soy isminiz ..(soyad)" Yazan metodu yazınız.

       public static String soyAd (String str){
            if(str==null) return null;
               str = str.trim();
               return str.substring(str.lastIndexOf(" ")+1);

           }
       //SORU 13: Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden
       //         çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı)

       public static String yinelenenKarakter(String str) {
           String result = "";
           for (;  str.length()>0;) {
               result += str.substring(0,1);
               str = str.replace(str.substring(0,1), "");

           }
           return result;
       }
       public static String yinelenenKarakter2(String str) {
        String result = ""; //ankara
         for (int i = 0; i < str.length(); i++) {
           if(!result.contains(str.substring(i,i+1))){
           result+=str.substring(i,i+1);}

       }return result;
        }


}