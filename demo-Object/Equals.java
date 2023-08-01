import shapes.Circle10;
import shapes.Shape;

public class Equals {
  public static void main(String[] args) {
    String str1 = "abc";
    String str2 = "abc";

    Object obj = new String("ABC");
    Shape shape = new Circle10(5.0d);
    System.out.println(obj instanceof String); //true

    obj = Long.valueOf(10); 
    System.out.println(obj instanceof String); //false
    System.out.println(obj instanceof Long); //true

    Integer int1 = Integer.valueOf(100);
    System.out.println(int1 instanceof Number); //true
    Double d1 = Double.valueOf(100);
    System.out.println(d1 instanceof Number); //true


    Shape shape5 = new Circle10(5.d);

    Circle10 c = (Circle10) shape;
    c.print();
    System.out.println();


    //WRapper class for comparison
    Integer j1 = 128;
    Integer j2 = 128;
    System.out.println(j1.equals(j2));

    Boolean bool1 = false;
    Boolean bool2 = false;
    System.out.println(bool1.equals(bool2));
  }
}
