public abstract class Person {
  //abstract cannot be "New"
  //final cannot be "extended"
 private int age;
 private double height;

  public Person(){

  }

  public int getAge(){
    return this.age;
  }
  public double getHeight(){
    return this.height;
  }
  
  //May contain instance method with implmentation
 

  public abstract void sleep();

  public void eat() {
    System.out.println("I am eating");
}

  //May contain abstract method (with implementation

}
