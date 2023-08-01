

public class Objectdemo {
  //Rule 1; All class extends Object implicitly
  String name = "Hello";

    //  @Override
    // public String toString(){
    //   return this.name;
    // }
      
  public static void main(String[] args) {
    //Example1; objectdemo extends object
    Objectdemo objectDemo = new Objectdemo();
    //hash code -->  int
    objectDemo.hashCode();//another presentation of object reference
    //because hash code has a short range of value storae
    //so, it cannot store all memory addres (object reference)

    String str = "abc";
    System.out.println(str); //default print toString

    System.out.println(objectDemo); //Objectdemo@1dbd16a6
    System.out.println(objectDemo.toString()); //Objectdemo@1dbd16a6

    System.out.println(str.hashCode()); //96354
    
  }
}
