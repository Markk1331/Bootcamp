public interface Move {

static final int speed = 10;


  void left();
  void right();
  void up();
  void down();


  default void print(){
    System.out.println("default method");
  }

  static String concat(String a, String b){
    return a+b;
  }
}
