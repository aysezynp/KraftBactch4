package day16_BranchingStatements;

import java.util.Scanner;

public class T01_BankaSorusu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        //banka menüsü oluşturun 1 para ekle 2 hesabımı gör 3 para çek 4 çıkış (money=2000;)
        //while işleme devam etmek için 1 e basın bir üst menü için 2 ye basın kart iade için 3

        int hesaptakiPara=2000;

        outerloop: while (true){
            System.out.print("Para ekle (1); Hesabımı gör (2); Para çek (3); Çıkış (4):" );
            int tercih_1=scan.nextInt();
            if (tercih_1==1){
                while(true){
                    System.out.print("lütfen eklemek istediğiniz tutarı giriniz: ");
                    int eklenenTutar=scan.nextInt();
                    hesaptakiPara+=eklenenTutar;
                    System.out.println("Toplam paranız: " +hesaptakiPara);

                    System.out.println("İşleme devam etmek için (1), bir üst menü için (2), kart iade için (3) basınız: ");
                    int tercih_2= scan.nextInt();
                    if(tercih_2==1){
                       continue;
                    }else if(tercih_2==2){
                       break;
                    }else if (tercih_2==3){
                        System.out.println("Lütfen kartınızı alınız");
                    break outerloop;
                    }else{
                        System.out.println("Hatalı giriş yaptınız");
                        break outerloop;
                    }
                }
            }else if(tercih_1==2){
                while(true){
                    System.out.println("Hesabınızdaki para miktarı: "+hesaptakiPara);
                    System.out.println("İşleme devam etmek için (1), bir üst menü için (2), kart iade için (3) basınız: ");
                    int tercih_2= scan.nextInt();
                    if(tercih_2==1){
                        continue;
                    }else if(tercih_2==2){
                        break;
                    }else if (tercih_2==3){
                        System.out.println("Lütfen kartınızı alınız");
                        break outerloop;
                    }else{
                        System.out.println("Hatalı giriş yaptınız");
                        break outerloop;}
                }
            }else if (tercih_1==3){
                while(true){
                    System.out.print("lütfen çekmek istediğiniz tutarı giriniz: ");
                    int çekilenTutar=scan.nextInt();
                    hesaptakiPara-=çekilenTutar;
                    System.out.println("Toplam paranız: " +hesaptakiPara);
                    System.out.println("İşleme devam etmek için (1), bir üst menü için (2), kart iade için (3) basınız: ");
                    int tercih_2= scan.nextInt();
                    if(tercih_2==1){
                        continue;
                    }else if(tercih_2==2){
                        break;
                    }else if (tercih_2==3){
                        System.out.println("Lütfen kartınızı alınız");
                        break outerloop;
                    }else{
                        System.out.println("Hatalı giriş yaptınız");
                        break outerloop;}
                }
            }else if(tercih_1==4){
                System.out.println("Lütfen kartınızı alınız");
                break;
            }else{
                System.out.println("Hatalı giriş, lütfen tekrar deneyiniz...");
            }

        }




















    }
}
