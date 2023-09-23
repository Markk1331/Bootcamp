package DemoArrayListSamples;
import java.util.Objects;
import java.util.Random;

public class Bal {
  int id;
  Colorz color;
  private static int idCounter =0;

  public Bal(Colorz color){
    this.id = ++idCounter;
    this.color = color;
  }

  public static Bal random(){
    int random = new Random().nextInt(3);
    Colorz color = Colorz.getColor(random);
    return new Bal(color);
  }

  public int getScore(){
    return this.color.getScore();
  }

  public int getId(){
    return this.id;
  }

  @Override
  public boolean equals(Object o){
    if(this ==o)
      return true;
    if(!(o instanceof Bal))
      return false;
    Bal ball = (Bal) o;
    return this.id == ball.id 
    && this.color == ball.color;
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.id, this.color);
  }

  @Override
  public String toString(){
    return "[" + "id=" + this.id +
    "color=" + this.color.name() +"]";
  }


}