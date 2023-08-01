import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public abstract class MenuItem {
  private String name;
  private double price;
  private List<McDonalds> meal;


  public MenuItem(String name, double price){
    this.name = name;
    this.price = price;
  }


  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name = name;
  }

  public double getPrice(){
    return this.price;
  }
  public void setPrice(double price){
    this.price = price;
  }

  public abstract void prepare();

public static void main(String[] args) {

}
}