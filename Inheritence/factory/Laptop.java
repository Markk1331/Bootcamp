package factory;

public class Laptop extends Machine {  //laptop is subclass (child) --of machine (parent)
  Keyboard keyboard;
  Monitor monitor;  
  private int volume;
  //inherit Machine method (start(), stop())
  //inherit Machine attributes (double weight)
 
  public Laptop(){
    //impliciting call Machine(){}
  }

  public Laptop(double weight, Keyboard keyboard, Monitor monitor){
    super(weight); // new Machine (5)
    //super(weight ); = this.setWeight(weight); + super();
    //this.setWeight(weight);
    this.keyboard = keyboard;
    this.monitor = monitor;
    //implicitly inherit superclass empty constructor
    //even if parent class empty construct isn't declared
  }

  public Laptop(Keyboard keyboard,Monitor monitor){

    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  public Laptop(String buttonType, int noOfbutton, double length, double width){
    this.keyboard = new Keyboard(buttonType, noOfbutton);
    this.monitor = new Monitor(length, width);
  }

  public Keyboard getKeyboard(){
    return this.keyboard;
  }

  public void mute(){
    this.volume = 0;
  }

  @Override
  public void start(){
    System.out.println("Laptop starts...");
  }

  @Override
  public void stop(){
    System.out.println("Laptop stop.....");
  }



public static void main(String[] args) {
  Laptop laptop = new Laptop("abc", 100, 50, 15);
  laptop.setWeight(5.30d);
  laptop.getWeight();


  laptop.start();
  laptop.stop();
  System.out.println(laptop.getWeight());


  Machine machine = new Machine();
  machine.setWeight(4.3d);
  System.out.println(machine.getWeight());
  machine.start();
  machine.stop();

   Keyboard keyboard123 = new Keyboard("123", 5);
  Monitor monitor1234 = new Monitor(5, 3);

  Laptop laptop10 = new Laptop(keyboard123, monitor1234);
  laptop10.getKeyboard().getbutton();


  Laptop laptop2 = new Laptop();
  laptop2.setWeight(10.0d);

  Laptop laptop3 = new Laptop();
  Machine.staticMethod("abc", "def"); //use class to call static method

  //not recommended to use object calling static method
  laptop3.staticMethod("abc","def");


}
}