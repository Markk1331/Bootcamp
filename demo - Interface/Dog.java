public class Dog extends Gamez implements Move{


  //int score = 0;
  String name;

  @Override
  public void up(){
    this.score += 2;
    System.out.println("going up");
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

}
