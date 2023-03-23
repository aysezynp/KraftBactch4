package day12_SwitchCase;

import java.util.Scanner;

public class T05_MotelSorusu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen motelimizi tanımak için bir kat numarası girin(1-2 ve 3. katlar): ");
        int kat = scan.nextInt();
        scan.nextLine();
        switch (kat) {
            case 1:
                System.out.println("1.katta bulunan odalarımız: \nResepsiyon\nGüvenlik\nOda hizmetleri\nLütfen hakkında bilgi almak istediğiniz oda adını giriniz:");
                String odaAdi1 = scan.nextLine();
                switch (odaAdi1) {
                    case "Resepsiyon":
                        System.out.println("Tüm işlemleriniz için bekleriz.");
                        break;
                    case "Güvenlik":
                        System.out.println("Profesyonel bir hizmettir");
                        break;
                    case "Oda hizmetleri":
                        System.out.println("Temizlik ve taşıma hizmetleri için 101 dahili hattan ulaşabilirsiniz.");
                        break;
                    default:
                        System.out.println("1.katta bu isimde bir oda bulunmamaktadır.");
                }
                break;
            case 2:
                System.out.println("2.katta bulunan odalarımız:\nYemekhane\nDinlenme salonu\nRoom 1\nRoom 2\nLütfen hakkında bilgi almak istediğiniz oda adını giriniz:");
                String odaAdi2 = scan.nextLine();

                switch (odaAdi2) {
                    case "Yemekhane":
                        System.out.println("Kahvaltı 08-11\nÖğle yemeği 12-15\nAkşam yemeği 18-21");
                        break;
                    case "Dinlenme salonu":
                        System.out.println("24 saat çay servisi ile hizmetinizdeyiz");
                        break;
                    case "Room 1":
                        System.out.println("Ekonomik oda");
                        break;
                    case "Room 2":
                        System.out.println("Ekonomik oda");
                        break;
                    default:
                        System.out.println("2.katta bu isimde bir oda bulunmamaktadır.");
                }
                break;

            case 3:
                System.out.println("3.katta bulunan odalarımız:\n Room 3\nRoom 4\nRoom 5\nRoom 6\nLütfen hakkında bilgi almak istediğiniz oda adını giriniz:");
                String odaAdi3 = scan.nextLine();

                switch (odaAdi3) {
                    case "Room 3":
                        System.out.println("Standart oda");
                        break;
                    case "Room 4":
                        System.out.println("Standart oda");
                        break;
                    case "Room 5":
                        System.out.println("Özel oda");
                        break;
                    case "Room 6":
                        System.out.println("Özel oda");
                        break;
                    default:
                        System.out.println("3.katta bu isimde bir oda bulunmamaktadır.");
                }

        break;
        default:
            System.out.println("hatalı kat girişi");
    }
}
}