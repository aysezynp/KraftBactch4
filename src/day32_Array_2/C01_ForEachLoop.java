package day32_Array_2;

public class C01_ForEachLoop {
    public static void main(String[] args) {

       // String []arr={"Harun","Mehmet","celal","emine"};
        String [] arr=new String[4];
        arr[0]="Harun";
        arr[1]="Mehmet";
        arr[2]="celal";
        arr[3]="emine";
        System.out.println("arr[3] = " + arr[3]);

        for(String str:arr){
            System.out.println(str);
        }
        System.out.println("...................................");

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);






        }
    }



}
