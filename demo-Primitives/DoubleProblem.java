import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleProblem {
  public static void main(String[] args) {
    double result = 0.1d + 0.2d; //0.3000000000004


    BigDecimal b = new BigDecimal(5); // both types are the same
    BigDecimal b2 = BigDecimal.valueOf(4); //both types are the same


    BigDecimal b3 = b.multiply(b);
    BigDecimal b4 = b.add(b);
    BigDecimal b5 = b.subtract(b);
    BigDecimal b6 = b.divide(b);


    System.out.println("result" + result);
    System.out.println("b =" + b);
    System.out.println("b2 =" + b2);
    System.out.println("b3 =" + b3);
    System.out.println(b.add(new BigDecimal(7))); //have to translate int to big decimal


    System.out.println(b.compareTo(b2)); //b>b2, so 5-4= -1
    System.out.println(b2.compareTo(b)); //b2<b, so 4-5 = -1


    BigDecimal b3 = BigDecimal.valueOf(3.456);
    b3.setScale(2, RoundingMode.UP);
    b3.setScale(2, RoundingMode.DOWN);

    System.out.println(b.equals(b2));


  }
}
