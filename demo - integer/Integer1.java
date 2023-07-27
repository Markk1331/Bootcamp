public class Integer1 {
  public static void main(String[] args) {
    Integer i1 = 100;
    Integer i2= 100;
    System.out.println(i1==i2); //true

    Integer i3=128;
    Integer i4=128;
    System.out.println(i3==i4); //false --> because cache can only store from -128 to 127

   // Byte b1 = new Byte(127); //destroy Internal cache, cancelled constructor

   Float f1 = 1.3f;
   Float f2 = 1.3f;
   System.out.println(f1==f2); //false, different address
   Double d1 = 1.3d;
   Double d2 = 1.3d;
   System.out.println(d1==d2); //false, different address

   //Boolean bool 1 , bool2 are true, are point at the same address
   Boolean bool1 = false;
   Boolean bool2 = false;

   Character c1 ='a';
   Character c2 = 'a';
   System.out.println(c1 == c2); //ASCII values, same address



   Integer i9 = Integer.valueOf(128);
   Integer i10= 128;
   System.out.println(i9==i10); //false, because value is not the same as address. Internal cache


   //try out new integer
  }
}
