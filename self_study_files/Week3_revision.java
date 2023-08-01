public class Week3_revision {
  public static void main(String[] args) {
    String s1 = "abc";
    String s2 = "abc";
    //s1 == s2  // true, Literal Pool


    String s3 = new String("abc");
    //s1 == s3 / false


    Integer i1 =127;
    Integer i2 = 127;
    //i1 == i2 // true, because of cache, that is up to 127

    Integer i3 = 128;
    Integer i4 = 128;
    //i3 == i4 // false


    String temp = "123";
    temp += "d";
    temp == temp //false



    ABC r1 = new ABC();
    r1.name = "John";
    ABC r2 = new ABC();
    r2.name = "John";
    //r1 == r2 // false, different address
    r1.name == r2.name // true, same literal pool




  }
}
