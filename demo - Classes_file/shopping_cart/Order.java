package shopping_cart;
public class Order {


  private Transaction[] transactions;



  public Order(Transaction[] transactions){
    //pass by reference
    this.transactions = transactions;

  }

  public Transaction[] getOrder_description(){
    return this.transactions;
  }

  public ItemDesc Order_details(){
  return this.transactions[0].getItmnDesc();
  }

// getTotal() --> sum up subtotal
public double getTotal(){
  double total =0;

  for(int i=0; i< this.transactions.length; i++){
    total += this.transactions[i].getSubtotal(); //transaction
  }
  return total; 
}
}
