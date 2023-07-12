import javax.swing.plaf.TreeUI;

public class LogicalOperators {
  public static void main(String[] args){
    

    boolean isExpensive = true;
    boolean isWorthToBuy = false;


    boolean result = isExpensive && isWorthToBuy; //&& = and
    //System.out.println(result); //show false
    boolean result1 = isExpensive || isWorthToBuy; // || = or
    //System.out.println(result1); // show true


    int a = 5;
    int b = 10;
    int c = 15;

    boolean result2 = a <3 && b > 12; //false
    boolean result3 = c<0 || a > 4 && b < 40; //true
    boolean result4 = a > 20 || b < 0 || a+b > 10; //true

    // >=,<=,==,!=


    boolean result5 = a ==b; //false
    boolean result6 = a<= b; //true
    boolean result7 = c>= b; //true
    boolean result8 = a!=b; //true
    boolean result9 = !(c<b); //false
    boolean result10 = !(c<a) && b!=10; //false

    int i = 27;
    int result11 = i++ + 1;
    //System.out.println(result11); //28
    //System.out.println(i); //28
    int ii = 28;
    int result12 = ii++;
    //System.out.println(result12);
    //System.out.println(ii);

    int x = 5;
    int y = 10;
    int z = x += 3 * y; //z=35

    int result13 = (x++ +2)* x++;
    System.out.println(result13);
    System.out.println(x);






  }
}