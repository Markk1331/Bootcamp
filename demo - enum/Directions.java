public enum Directions {
  //public class Directions extending to ENUM
  //enu is final class


  East('E',90),
  South('S',180),
  West('W',270),
  North('N',360);

private char direction; 
private int degree;

private Directions (){

}

private Directions(char direction, int degree){
  this.direction = direction;
  this.degree = degree;
}


public char getDirection(){
  return this.direction;
}

public int getDegree(){
  return this.degree;
}

public boolean isOpposite(Directions direction){
  return Math.abs(this.degree - direction.getDegree()) == 180;
}

public static void main(String[] args) {
  System.out.println(Directions.East.isOpposite(Directions.West));
}
}
