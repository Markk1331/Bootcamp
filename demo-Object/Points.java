import java.util.Objects;

public class Points {
  private int x;
  private int y;

  public Points(int x, int y){
    this.x = x;
    this.y = y;
  }

// @Override
// public int HashCode(){
//   return Objects.hash(this.x, this.y);
// }

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

    Long l = 1L;
    int i = 1;
    // unbox Long, and upcast int
    System.out.println(l == i); // true, finally long vs long
    // Big bug here
    System.out.println(Objects.equals(l, i)); // false
    
    


    
    Points.print(10);
//decleared long function and autodowncast to print int

    if(Long.valueOf(100) < 101){

    }
    if(Boolean.valueOf(false)== false){
      //right: false -> boolean
      //left: boolean false -> boolean false 
     // Boolean vs boolean
    }

    if(Boolean.valueOf(false).equals(false)){
      //trust .equals method
    }

  }

  private static void print(long l) {
    System.out.println("i" + l);
  }
}
