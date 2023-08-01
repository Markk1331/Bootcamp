//package McDonalds.Orders;

import java.util.ArrayList;
import java.util.List;

public class Burger extends MenuItem{

private String description;


public Burger(String name, double price, String description){
  super(name, price);
  this.description = description;
}

public String getDescription() {
  return description;
}
public void setDescription(String description) {
    this.description = description;
}

public static List<Burger> getBurger(){
  List<Burger> burger = new ArrayList<>();
  burger.add(new Burger("BigMac", 5.49, "Set price"));
  burger.add(new Burger("BigMac", 5.79, "Single price"));
  burger.add(new Burger("Sauage Egg Muffin", 5.3, "Set price"));
  burger.add(new Burger("Double Cheeseburger", 5.20, "Set price"));
  burger.add(new Burger("Whooper", 5.85, "Set price"));
  burger.add(new Burger("Fillet-O Fish", 4.99, "Set price"));
  burger.add(new Burger("Quarter Pounder", 5.89, "Set price"));
  burger.add(new Burger("Mc Griddle", 5.49, "Set price"));
  return burger;
}



@Override
public void prepare(){
  System.out.println("combinging" +getName() + "the with the buns, and taking out pattie from the pan.");
}

public static void main(String[] args) {

}
}
  

