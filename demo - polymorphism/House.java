public class House extends Building {
  private double capacity;

  public double getCapacity(){
    return this.capacity;
  }

  public House(){

  }

  public House(double capacity){
    this.capacity = capacity;
  }

@Override
public void print(){
  System.out.println("I am a house");
}

//overloading
public void print(String s){
  System.out.println("overloading");
}

public void buildingPrint(){
  super.print();
}

}
