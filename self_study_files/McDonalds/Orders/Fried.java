package McDonalds.Orders;

import java.util.ArrayList;
import java.util.List;

public class Fried extends MenuItem{
  private String size;

  public Fried(String name, double price, String size) {
      super(name, price);
      this.size = size;
  }

  // getters and setters for private variables
  public String getSize() {
      return this.size;
  }
  public void setSize(String size) {
      this.size = size;
  }

  public List<Fried> getFried(){
    List<Fried> fried = new ArrayList<>();
    
    fried.add(new Fried("French fries", 3.20, "set price"));
    fried.add(new Fried("Shake-Shake fries", 3.50, "Set upgrade"));
    fried.add(new Fried("Mcnugget (5pics)", 3.2, "set price"));
    fried.add(new Fried("Mcnugget(10pics)", 3.8, "set price"));
    fried.add(new Fried("Apple pie", 2.88, "set price"));
    fried.add(new Fried("McWings (4pics)", 3.8, "set price"));

    return fried;
  }

  @Override
  public void prepare(){
    System.out.println("The fried food" + getName() +" is being prepared set in the oil.");
  }

  public static void main(String[] args) {
    // Fried fries = new Fried("French fries", 3.20, "set price");
    // Fried fries2 = new Fried("Shake-Shake fries", 3.50, "Set upgrade");
    // Fried nugget = new Fried("Mcnugget (5pics)", 3.2, "set price");
    // Fried nugget1 = new Fried("Mcnugget(10pics)", 3.8, "set price");
    // Fried nugget2 = new Fried("Apple pie", 2.88, "set price");
    // Fried McWings = new Fried("McWings (4pics)", 3.8, "set price");
  }
}

