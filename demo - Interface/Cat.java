public class Cat extends Gamez implements Move {
  String name;
  //private int score;



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





}
