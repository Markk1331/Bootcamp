public class Circle {
  private double radius;
  private static final double pi=3.14159; //like static method
  private int id = 0; // called instance variable or attribute


  private static int counter; //calculate the number of circle being created
  //called static variable


public int getID(){
  return this.id;
}


  public Circle(){
    //AddCounter();
    this.id = AddCounter();
  }

  public static int AddCounter(){
    return counter++;
  }

  public double area(){
    return Math.pow(this.radius, 2) * pi;
  }

  public double circumference(){
    return radius * 2 * pi;
  }

  public void setRadius(double radius){
    this.radius = radius;
  }

  public static void main(String[] args) {
    Circle circle = new Circle();
    //Circle.radius = 2; // can only use in class main file
    circle.setRadius(2.3);
    circle.area();
    circle.circumference();
    Circle circle1 = new Circle();
    System.out.println("circle ID: " + circle.getID());
    System.out.println("circle1 ID: " + circle1.getID());
  }
}
