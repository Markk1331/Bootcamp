package McDonalds.Orders;

import java.util.ArrayList;
import java.util.List;

public class DailyBusiness {

 private double totalRevenue;
 private List<Order> orders;

 public DailyBusiness(){
  orders = new ArrayList<>();
 }

 public List<Order> getOrder(){
  return orders;
 }

  public void addOrder(Order order){
    orders.add(order);
    totalRevenue += order.getTotalCost();
  }

  public double getTotalCost(){
    return totalRevenue;
  }

  public void setTotalCost(double totalRevenue){
    this.totalRevenue = totalRevenue;
  }
}
