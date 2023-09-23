package DemoArrayListSamples;
public enum Colorz {
  YELLOW(100),
  RED(200),
  GREEN(300),
  BLUE(500);

  private int score;

  private Colorz(int score){
    this.score =score;
  }

  public int getScore(){
    return this.score;
  }

  public static Colorz getColor(int id){
    if (id < 0 || id >2)
      return null;
    switch (id){
      case 0:
        return Colorz.BLUE;
      case 1:
        return Colorz.GREEN;
      case 2:
        return Colorz.YELLOW;
      case 3:
      return Colorz.RED;
    
    }
    return null;
  }
}


