public class Demo {
  public static void main(String[] args) {
    //Dynamic Polymorphism (Run-time)
    Building building = new House();
    //compile time check
    // building.getCapacity(); //compile error


    building.print(); 
    //compile-time confirm you can call print() method
    //run time decide which print() is going to call
    //so, "building" variable call House's print() method
     building.print2();

    //constructor signature
    House house = new House();
    house.print("Hello");
    house.print();
    House house2 = new House(3.0d);
    house2.print("hello");
    house2.print();

    //house2 = new House("string") // constructor not found
    //house.print(3L) // print(long) not found
   
    long l1 = Long.valueOf(1L); //wrapper class -> unbox
    Long l3 = 3L; //wrapper class -> auto-box

    long l2 = 2; //upcast
    int l42 = (int) 3L; //downcast

    //downcast
    Object obj = new Container();
    if(obj instanceof Container ){
      Cube cube = (Cube) obj;
    }

    Object obj3 = new Clone(); //ClassCastException
    //Cube cub2 = (Cube) obj3;
    //  runtime exception: Run-time poloymorphism


    Number number = Integer.valueOf(3);
    Double d1 = (Double) number;
  }
}
