package McDonalds.Orders;

import java.util.ArrayList;
import java.util.List;

public class Drinks extends MenuItem {

  private String size;

public Drinks(String name, double price, String size){
  super(name,price);
  this.size = size;
}

public String getSize() {
  return this.size;
}
public void setSize(String size) {
    this.size = size;
}

public static List<Drinks> getDrinks(){
List<Drinks> drinks = new ArrayList<>();
drinks.add(new Drinks("Cola", 1.50,"set price"));
drinks.add(new Drinks("Cola", 2, "single price"));
drinks.add(new Drinks("7-up", 1.45, "set price"));
drinks.add(new Drinks("Fanda", 1.48, "set price"));
drinks.add(new Drinks("Chocolcate smoothie", 3.99, "set upgrade"));
drinks.add(new Drinks("Vanila smoothie",3.99, "set upgrade"));

return drinks;
}

@Override
public void prepare(){
  System.out.println(getName()+ " is being poured out from the machine.");
}
public static void main(String[] args) {

}

}
