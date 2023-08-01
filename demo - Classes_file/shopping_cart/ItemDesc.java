package shopping_cart;
import java.util.Arrays;

public class ItemDesc {
  private String header;
  private String body;

  public ItemDesc(String header, String body) { // method for creating new class
    this.header = header;
    this.body = body;
  }

  public String getItemDesc() {
    return this.header + " " + this.body;
  }

  @Override
  public String toString() {
    return this.header + this.body;
  }

  public static void main(String[] args) {
    ItemDesc itemdesc = new ItemDesc("Apple", "Apple for discount: Buy 3 get 1 free.");
    ItemDesc itemdesc1 = new ItemDesc("Banana", "Banana 10% off");
    ItemDesc itemdesc2 = new ItemDesc("Orange", "Buy two oranges, get one apple 30% off");

    Transaction t = new Transaction(1, itemdesc, 3, 10.50);
    Transaction t2 = new Transaction(1, itemdesc, 4, 20.50);
    Transaction t3 = new Transaction(2, itemdesc1, 2, 30.20);
    Transaction t4 = new Transaction(3, itemdesc2, 3, 12.80);

    Order order = new Order(new Transaction[] { t, t2 });
    Order order1 = new Order(new Transaction[] { t3, t4 });

    System.out.println(order.getTotal());
    System.out.println(t2.getSubtotal());
    System.out.println(t3.getItmnDesc());

    System.out.println(order1.Order_details());
    System.out.println(order.getOrder_description()[0].getItmnDesc());
    System.out.println(order.getOrder_description()[1].getItmnDesc());
  }

}
