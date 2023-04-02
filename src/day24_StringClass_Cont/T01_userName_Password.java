package day24_StringClass_Cont;

import java.util.Scanner;

public class T01_userName_Password {

    /*Kullanıcıdan userName ve password isteyen bir method yazın.
      Method aşağıdaki şartları kontrol etsin.
      Password ve username alanı boş olamaz.
      Password alanı boş olamaz
      Password 8 karakterden az olamaz.
      Username 3 karakterden az olamaz.*/
    public static void main(String[] args) {
        userNamePassword();
    }
    public static void userNamePassword(){
        boolean flag=true;
        while(flag){
            Scanner scan=new Scanner(System.in);
            System.out.print("Lütfen bir kullanıcı adı giriniz: ");
            String kullaniciAdi=scan.nextLine();
            System.out.print("Lütfen bir şifre giriniz: ");
            String sifre=scan.nextLine();
        if(kullaniciAdi.isEmpty()||sifre.isEmpty()){
            System.out.println("Lütfen kullanıcı adı ve şifre girdiğinizden emin olunuz");
            continue;
        }else if(sifre.length()<8){
             System.out.println("Şifre 8 karakterden az olamaz,lütfen tekrar giriniz");
             continue;
        }else if(kullaniciAdi.length()<3){
            System.out.println("Kullanıcı adı 3 karakterden az olamaz,lütfen tekrar giriniz");
            continue;
        }else{
            System.out.println("Kullanıcı adı ve şifreniz doğru bir şekilde oluşturulmuştur");
            break;
        }

                 }
        }




        }









