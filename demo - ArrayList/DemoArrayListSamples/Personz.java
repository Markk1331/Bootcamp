package DemoArrayListSamples;
public class Personz  implements Player{
 
  Pocket[] pockets;



  public int totalScore(){
    return this.getLeftPocket().totalScore() +
    this.getRightPocket().totalScore();
  }
  

  public Personz(){
    pockets = new Pocket[] {new Pocket(), new Pocket()};
  }


  public Pocket getLeftPocket(){
    return this.pockets[0];
  }

  public Pocket getRightPocket(){
    return this.pockets[1];
  }


  

  public static void main(String[] args) {
    Personz person = new Personz();
    person.getLeftPocket();
    Player.fillThePocket(person.getLeftPocket());
    Player.fillThePocket(person.getRightPocket());
    
    System.out.println(person.getRightPocket().getSize());
    System.out.println(person.getLeftPocket().getSize());

    System.out.println("person's total score: "+ person.totalScore());
     System.out.println(person.getRightPocket().toString());
    System.out.println(person.getLeftPocket().toString());



    Personz person1 = new Personz();
    // System.out.println(person1.getRightPocket().getSize());
    // System.out.println(person1.getLeftPocket().getSize());
  }



}
