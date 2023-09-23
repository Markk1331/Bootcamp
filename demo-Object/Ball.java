public class Ball {
  String color;
  public Ball(String string){
    this.color = string;
  }

// @Override
// public int hashCode(){
// return Object.hash(this.color);
// }


  @Override
  public boolean equals(Object o){
    //if address same, values inside the object must be same
    if(this ==o)
      return true;

    if(!(o instanceof Ball))
      return false;
    
      Ball ball = (Ball) o;
    return ball.color.equals(this.color);
  }

  @Override
  public String toString(){
    return "[color=" + this.color + "]";
  }


  public static void main(String[] args) {
    Ball b1 = new Ball("Blue");
    Ball b2 = new Ball("Blue");
    System.out.println(b1==b2); //true
    

  }
}
