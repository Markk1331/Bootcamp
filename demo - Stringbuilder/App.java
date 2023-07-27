import java.util.Arrays;

public class App {
  public static void main(String[] args) {
    //Stringbuilder
    StringBuilder strb = new StringBuilder("hello");
    strb.append(" world");
    System.out.println(strb.toString());
    strb.append(1.3f); //return StringBuilder
    System.out.println(strb.toString());


    System.out.println(strb.append(true).append(4000L).length());

      String str = "  h  e llo";
      String[] strs = str.trim().replace('h', 'e').split(" ");
      System.out.println(Arrays.toString(strs));
      System.out.println();
    
      StringBuilder strb1 = new StringBuilder("start");
      System.out.println(strb1.append('a').toString().charAt(3));


      //insert
      String s2 = "Hello";
      StringBuilder strb2 = new StringBuilder("hello");
      strb2.insert(3,' ');
      System.out.println(strb2);


      System.out.println(strb2.deleteCharAt(3).toString());



      strb2.setCharAt(4, '3'); //set character at index
  }
}
