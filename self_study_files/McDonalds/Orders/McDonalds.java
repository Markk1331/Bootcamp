package McDonalds.Orders;

public class McDonalds {
  private Burger[] burgers;
  private Fried []fried;
  private Drinks [] drinks;
  private DailyBusiness dailyBusiness;

McDonalds(){
}

McDonalds(Burger[] burgers, Fried[] fried, Drinks[] drinks, DailyBusiness dailyBusiness){
  this.burgers = burgers;
  this.fried = fried;
  this.drinks = drinks;
  this.dailyBusiness = dailyBusiness;
}

McDonalds(String location, double size ){
}

public void placeOrder(Customer customer){
  // Order order1 = new Order(customer);
  // dailyBusiness.addOrder(order1);
}

// McodnaldsList1.add(Burger.get(1))
// McodnaldsList1.add(Fried.get(1))
// McodnaldsList1.add(Drink.get(1))

}
