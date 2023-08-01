import java.util.Arrays;

public class Testing7 {
  public static void main(String[] args) {
    
    String s = "book";
    int half_length = s.length()/2;

    char[] a = s.substring(0,half_length).toCharArray();
    char[] b = s.substring(half_length,s.length()).toCharArray();

    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
  }
}
