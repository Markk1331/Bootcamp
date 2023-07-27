public class String3 {
  public static void main(String[] args) {

    //inmutability
    String str = "abc";
    String str2 = "abc";
    String str3 = "abcd";
    System.out.println(str.equals(str2)); //true "abc" is same as "abc"
    System.out.println(str==str2); //true, pointing to the same address
    System.out.println(str == str3); //false, address not the same


    Integer a = 10;
    a = a +20; // the second a is the copy of first a.  First a != second a

    
  }
}
