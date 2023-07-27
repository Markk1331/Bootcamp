public class Transaction {
  
  private int itmNo;
  private ItemDesc itmDesc;
  private int quantity;
  private double unitPrice;
  

public Transaction(int itmNo, ItemDesc Itemdesc, int quantity, double unitPrice){
  this.itmNo = itmNo;
  this.itmDesc = Itemdesc;
  this.quantity = quantity;
  this.unitPrice = unitPrice;
}


public double getSubtotal(){
  return this.quantity * this.unitPrice;
}
// getSubtotal(), no new attribute

public int getItmNo(){
  return this.itmNo;
}
public ItemDesc getItmnDesc(){
  return this.itmDesc;
}
public int getquantity(){
  return this.quantity;
}
public double getunitPrice(){
  return this.unitPrice;
}
public void setitmNo(int item){
  this.itmNo = item;
}
public void setitmDesc(ItemDesc itemDesc){
  this.itmDesc = itemDesc;
}
public void setquantity(int quantity){
  this.quantity = quantity;
}
public void setitmNo(double price){
  this.unitPrice = price;
}

}
