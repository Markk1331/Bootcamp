public class Puppy extends Dog {


  @Override
  public void up(){ //parent class is contracted to contract class

  }
  public static void main(String[] args) {
    Puppy puppy = new Puppy();
    puppy.up();
    System.out.println(puppy.getScore()); //score overriden
    puppy.jump();
    
  }
}
