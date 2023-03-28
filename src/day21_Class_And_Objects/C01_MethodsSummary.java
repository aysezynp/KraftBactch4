package day21_Class_And_Objects;

public class C01_MethodsSummary {
    public static void main(String[] args) {
        int x=seven();
        System.out.println("x = " + x);
        System.out.println(seven7());
        System.out.println("max(5,6) = " + max(5, 6));
    }

    public static int seven(){
        return 7;
    }

    public static int seven7(){
        int i=0;
        while(true){
        i++;
        if(i==5){
            continue;
        }else if(i==7){
            return i;
        }
            System.out.print(i);}

        }
public static int max(int x,int y){
        if (x>y){
            return x;

        }else{
            return y;
        }

        }


}


