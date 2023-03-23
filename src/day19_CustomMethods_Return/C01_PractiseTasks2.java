package day19_CustomMethods_Return;

public class C01_PractiseTasks2 {
    public static void main(String[] args) {
        tlToDollar(25000);
        System.out.println("---------------------------------");
        double myBagWeight=kgToLb(23);
        System.out.println("myBagWeight = " + myBagWeight);
        System.out.println("---------------------------------");
        signOfNumber(-6);
        System.out.println("---------------------------------");
        eachInString("murat");
        System.out.println("---------------------------------");
        calculator(10,2,'+');
        calculator(10,2,'-');
        calculator(10,2,'*');
        calculator(10,2,'/');
        calculator(10,2,'?');
    }
    /**
     * a method that can convert lira to dollar
     * @param tl
     */
  public static void tlToDollar (int tl) {
      System.out.println(tl + " Tl makes " + Math.round((tl / 19.04) * 100) / 100.0 + " USD");

  }


    /**
     * a method that can convert kg to lb
     * @param kg
     * @return
     */
    public static double kgToLb(double kg){
      double result=0;
      result=Math.round((kg*2.20462262)*100)/100.0;
      return result;
    }

    /**
     * a method that can determine if the given integer is positive, negative or zero
     * @param number
     */
     public static void signOfNumber (int number){
        if(number<0) System.out.println(number+" is a negative number");
        else if (number>0) System.out.println(number+ "is a pozitive number");
        else System.out.println(number+" is zero");

}

    /**
     * a method named print EachChar that can print each characters of a string
     * @param str
     */
      public static void eachInString(String str){
         for(int i=0;i<str.length();i++) {
             System.out.println(str.charAt(i));

         }}

      public static void calculator(double num1,double num2,char mathOperator){
      boolean valid=mathOperator=='+'||mathOperator=='-'||mathOperator=='*'||mathOperator=='/';
      if(valid){
          switch(mathOperator) {
              case '+':
                  System.out.println(num1+num2);
                  break;
              case '-':
                  System.out.println(num1-num2);
                  break;
              case '*':
                  System.out.println(num1*num2);
                  break;
              case '/':
                  System.out.println(num1/num2);

          }
          }else{

          System.err.println("Invalid math Operator"+ mathOperator);
      }
            }

















      }




































