import java.math.BigDecimal;

public class Testing9 {
  private String abc;



  public Testing9(String abc){
  }

public static void main(String[] args) {
  Testing9 a = new Testing9("ABC");
  Testing9 b = new Testing9 ("ABC");

  System.out.println(a.equals(b));
}

}
  

