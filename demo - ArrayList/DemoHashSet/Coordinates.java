package DemoHashSet;

import java.util.Objects;

public class Coordinates {
  int x;
  int y;

  public Coordinates(int x, int y){
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object o){
    if (this ==o)
      return true;
    if(!(o instanceof Coordinates))
      return false;
      Coordinates coordinate = (Coordinates) o;
      return this.x == coordinate.x &&
       this.y == coordinate.y;
    }

    @Override
    public int hashCode(){
      return Objects.hash(this.x, this.y);
    }
}
