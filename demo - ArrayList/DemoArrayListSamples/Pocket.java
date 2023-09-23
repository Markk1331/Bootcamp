package DemoArrayListSamples;
import java.util.ArrayList;

public class Pocket {
  ArrayList<Bal> balls = new ArrayList<>();

 

  public void add(Bal ball){
    if(this.balls.size()>5)
      this.balls.remove(0);

    this.balls.add(ball);
    return;
  }

  public void remove(Bal ball){
    this.balls.remove(ball);
  }

  public void remove(int ballId){
    for(Bal b: this.balls){
      if(b.getId()== ballId)
        this.balls.remove(b);
        return;
    }
  }
  public boolean isPocketFull(){
    return this.balls.size() ==5;
  }

  public void removeFirstBall(){
    this.balls.remove(0);
  }

  public int getSize(){
    return this.balls.size();
  }

  @Override
  public String toString(){
    StringBuilder sb = new StringBuilder();
    for(Bal b: this.balls){
      sb.append(b.toString());
    }
    return sb.toString();
  }

    public int totalScore(){
    int sum = 0;
    for(Bal b: this.balls){
      sum += b.getScore();
    }
    return sum;
  }
}
