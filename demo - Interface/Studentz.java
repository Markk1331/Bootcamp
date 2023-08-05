public class Studentz extends Person implements Runnable, Swimmable,Move{ //class is signature

  private String name;
  int score = 0;


@Override
public void breath(){
}

@Override
  public void run(){
    System.out.println("Student is running");
  }
@Override
  public void swim(){
    System.out.println("Student is swimmable");
  }

@Override
  public void up(){
    System.out.println("going up");
    this.score +=1;
  }

@Override
  public void down(){
    System.out.println("going down");
  }

@Override
  public void left(){
    System.out.println("going left");
  }

@Override
  public void right(){
    System.out.println("going right");
  }


  public static void main(String[] args) {

    Studentz studentz = new Studentz();
    studentz.run();
    studentz.left();
    //System.out.println(studentz.right().speed);
    System.out.println(Move.speed);


    Move move = new Studentz();
    move.up();
    //move.run();

    Swimmable swimmable = new Studentz();
    swimmable.swin();

    Person person = new Student();
    person.breath();
    person.getAge();

      Move dog = new Dog();
      dog.up();
      dog.down();
      dog.left();
      dog.right();

  }
}
