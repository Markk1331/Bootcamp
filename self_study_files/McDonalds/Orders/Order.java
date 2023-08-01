package McDonalds.Orders;

import java.util.List;

public class Order {
  private Customer customer;
  private List <MenuItem> items;
  private double totalCost;

  public Order(){
  }

  public Order(Customer customer){
  }

  public void addItem(MenuItem item){
    items.add(item);
  }

  public List <MenuItem> getItems(){
    return items;
  }

  public void setItem(List<MenuItem> items){
    this.items = items;
  }


  public Customer getCustomer(){
    return customer; //when to return customer
  }

  public void setCustomer(Customer customer){
    this.customer = customer;
  }

  public double getTotalCost(){
    return totalCost;
  }
  
  public void setTotalCost(double totalCost){
    this.totalCost = totalCost;
  }

}
