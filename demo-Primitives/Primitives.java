public class Primitives {

    public static void main(String[] args){

      //Upcasting (implicit conversion or explicit conversion )
      //byte ->short->int->long->float->double
      //char->int

      //Upcasting
      byte b =2;   //upcasting --> implicit conversion (= automatic conversion)
      short s =b; //byte ->short, upcasting (promotion)
      int i = s;
      long p = i;  
      float q = p;
      double d = q;

      char c ='a';
      int j =c;

      // System.out.println(j);



      //Downcasting
      double d2 =10.3d;
      //float f2 = d2; //error due to precision loss during downcast conversion
      float b2 = (float) d2;

      short s2 = 128;
      byte a2 = (byte) s2;
      System.out.println(a2);
      //overflow -> start from negative -128

      char c2 = 'B';
      char c3 = 67; //= 'C'

      //System.out.println(c3);

      //ASCII (int) to char
      int g ='a';
      int g2 = 10;
        //2 different paths for char conversion
      char k = (char) g2; //forced conversion #1
      char k2 = 66; // ASCII exchange #2

      int h = (int) 100L; //downcasting, Explicit conversion

      
      int z = (int)1.0f; //explicit conversion

      char character = 'a' + 1;

      if (character =='b'){
        System.out.println(character);
      }
      if(character == 98){
        System.out.println(character);

      if(character > 'a'){
        System.out.println("character > a");
      }
      }



    }
}
