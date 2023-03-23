package day11_ControlFlowStatements_IF;

public class C07_If_IfElse {
    public static void main(String[] args) {
     /*   // 2 adet int sayıyı karşılaştıralım
        //A büyüktür B den
        //B büyüktür A dan
        // A ve B eşittir

        int a=10;
        int b=20;
        if(a>b){
            System.out.println("A büyüktür B den");}
        else if(a==b){
            System.out.println("A ve B eşittir");
        }else{
            System.out.println("B büyüktür A dan");
        }

        System.out.println("A");
        if(true){
            System.out.println("B");
        }else if(false){
            System.out.println("C");
        }else if(false){
            System.out.println("D");
        }

int x= 5,y;
if (x==10){
    System.out.println(y=20);}
else{
    System.out.println(y=0);}

//Bir program yazın eğer x in değeri 10 ise y ye 20 atansın,.
        //x in değeri 20 ise y ye 30 atansın,
        //x in değeri 30 ise y ye 40 atansın,.
        // değil ise y ye 0 atansın

int x=10,y;
if (x==10){
    y=20;}
else if (x==20){
    y=30;}
else if(x==30){y=40;}

else{y=0;}
        System.out.println("y = " + y);*/


/*int a,b,c;
a=45;
b=90;
c=45;

boolean result=(a+b+c)==180&&(a==90||b==90||c==90);
if (result){
    System.out.println("Bu bir dik üçgendir.");
}
        int aysePara=3;
        if (aysePara<5){
            aysePara+=10;}

        System.out.println("aysePara = " + aysePara);


        int x=30;
        int y=20;
        if(x>y){
            System.out.println(x);}
        else if(x==y){
            System.out.println("sayılar eşittir büyük sayı yoktur");
        }else {
            System.out.println(y);
        }

        int a = 30;
        int b = 40;
        int c= 50;
        if ((a+b)>c){
         //   c=a-b;
         //   c=Math.abs((a-b));
          //    c= Math.max(a,b)-Math.min(a,b);
            if((a-b>=0)){
                c=a-b;
            }else{c=-(a-b);}
        }
        System.out.println(c);*/

        int x=60;
        int y=30;
        int z=90;
        if ((x+y+z)==180){
            if(x==90||y==90||z==90)
                System.out.println("Bu bir dik üçgendir");
            }else{
                System.out.println("Bu bir üçgen değildir");
            }



    }

}
