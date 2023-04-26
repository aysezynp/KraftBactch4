package day37_WrapperAndArrayList;


import java.util.ArrayList;

public class C05_day37slayt_Prac2 {
    public static void main(String[] args) {
        //5,10,15,15,20,25,25,100,100,500 rakamlarını listOfNums isili
        //bir ArrayListe atın ve
        //printListNumbers(listOfNums); methodu ile yazdıralım
        ArrayList<Integer> listOfNums=new ArrayList<>();
        listOfNums.add(5);
        listOfNums.add(10);
        listOfNums.add(15);
        listOfNums.add(15);
        listOfNums.add(20);
        listOfNums.add(25);
        listOfNums.add(25);
        listOfNums.add(100);
        listOfNums.add(100);
        listOfNums.add(500);
        System.out.println("listOfNums = " + listOfNums);
        //  System.out.println();
       // System.out.println(sum(listOfNums));
       // System.out.println(dublicate(listOfNums));
        System.out.println("squared(listOfNums) = " + squared(listOfNums));


    }

    public static void printListNumbers(ArrayList<Integer>arrlist){
        for (int i  = 0; i<arrlist.size() ; ++i) {
            System.out.print(arrlist.get(i)+" ");
        }
    }
 //sum(listOfNums); methodu ile de toplam değeri döndürelim
    public static int sum(ArrayList<Integer>arrlist){
        int sum=0;
        for (int i = 0; i < arrlist.size(); i++) {
            sum+=arrlist.get(i);

        }
        return sum;
    }
//duplicate(listOfNums); methodu ile de değerleri dublicate
//edip list i döndürelim

    public static ArrayList<Integer> dublicate (ArrayList<Integer>arrlist){
        ArrayList<Integer> arrayListNew=new ArrayList<>();
        for (int i = 0; i <arrlist.size() ; i++) {
              arrayListNew.add(arrlist.get(i));
              arrayListNew.add(arrlist.get(i));

        }
        return arrayListNew;
    }

//squared(listOfNums); methodu ile de değerleri kendi ile
//çarpıp list i döndürün.k

    public static ArrayList<Integer> squared (ArrayList<Integer>arrlist) {
        ArrayList<Integer> arrayListNew = new ArrayList<>();
        for (int i = 0; i < arrlist.size(); i++) {
            arrayListNew.add(arrlist.get(i) * arrlist.get(i));
        }
        return arrayListNew;
    }






    }
