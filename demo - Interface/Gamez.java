public abstract class Gamez {

  int score;

  public abstract void up();
  

  public abstract void down();
    

  public abstract void left ();
    
  
    public abstract void right();
    
  
  public int getScore(){
    return this.score;
  }

  public void addScore(int score){
    this. score += score;
  }
  public static void countups(Move[] moves){ //multiple args
    for(Move move: moves){
      move.up();
    }
  }

  public static void main(String[] args) {


    Dog dog = new Dog();
    Cat cat = new Cat();
    Gamez.countups(new Move[] {dog,dog,cat});
    System.out.println(dog.getScore());
    System.out.println(cat.getScore());

    Move[] moves = new Move[] {dog,cat};
    Gamez.countups(moves);
    System.out.println(dog.getScore());
    System.out.println(cat.getScore());

    //interface Move default instance method
    dog.print();
    cat.print();

    //interface can store static method
    Move.concat("abc","def");

    Cow cow = new Cow();
    cow.print();

  }





}
