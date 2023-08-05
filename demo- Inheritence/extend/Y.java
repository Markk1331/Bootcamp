package extend;
public class Y {
  private String name;

  public Y(){

  }

  public Y(String name){
    this.name = name;
  }
  
  public String getName(){
      return this.name;
  }

  public static String staticMethod(){
    return "I am";
  }
}
