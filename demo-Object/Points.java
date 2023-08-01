import java.util.Objects;

public class Points {
  private int x;
  private int y;

  public Points(int x, int y){
    this.x = x;
    this.y = y;
  }

@Override
public int HashCode(){
  return Objects.hash(this.x, this.y);
}

  @Override
  public boolean equals(Object o){
    if(this == o)
      return true;
    if(!(o instanceof Points ))
      return false;
      Points point = (Points) o;
      //return point.x == this.x && point.y == this.y;
  //another way to write
      return Objects.equals(point.x, this.x) && Objects.equals(point.y, this.y);

  }

  public static void main(String[] args) {
    Points p1 = new Points(1,1);
    Points p2 = new Points(1,1);
    Points p3 = new Points(1,2);

   System.out.println(p1 == p2); 
   System.out.println(p1.equals(p2));
    System.out.println(p1.equals(p3));
    System.out.println(p1.equals(p2));
   
  }
}
