

public class Computer {
  
  private int ram;
  private float weight;
  private String color;


  //constructor mode
  public Computer(){

    //Constructor method
    //empty constructor
  }

  public Computer(String color){
    this.color = color;
    //Constructor mode
    //must be NO RETURN
    //Constructor's name must be the same name as the file 
  }

  public Computer(int ram, int weight, String color){
    this.ram = ram;
    this.weight = weight;
    this.color = color;
  }

  public String getColor(){
    return this.color;
  }

  public void setRam(int ram){
    this.ram = ram;
  }

  public void setWeight(float weight){
    this.weight = weight;
  }

  public void setColor(String color){
    this.color = color;

}
}