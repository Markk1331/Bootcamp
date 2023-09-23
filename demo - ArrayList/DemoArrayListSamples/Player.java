package DemoArrayListSamples;
public interface Player  {
  
  int totalScore();


  public static void fillThePocket(Pocket pocket){
    // if(pocket.isPocketFull())
    //   pocket.removeFirstBall();
    while(!pocket.isPocketFull()){
      pocket.add(Bal.random());

    }
  }
}
