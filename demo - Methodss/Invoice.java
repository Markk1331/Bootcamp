public class Invoice {

  public static double item_price(int item, double price){
    if(item<0 || price <0){
      return 0;
    }
    return item * price;

  }
  //a method to calculate item total prices respectively e.g a*1

  public static double total(double quantityPrice){
    double sum = 0;
    sum = quantityPrice;
    return sum;
  }

  //method to calculate total amount invodie 




  public static void main(String[] args){
    int[] quantity = new int[] {5,10,4,7,20};
    double[] unitPrice = new double[]{10.23, 7.99, 4.50, 5, 2.50};
    //instructor's way
    double[] quantity_price = new double[] {unitPrice.length};
    double grand_total = 0d;

    
    for(int x=0; x<quantity.length; x++){
      double itemtotalPrice =  item_price(quantity[x], unitPrice[x]);
      //quantity_price[x] = item_price(quantity[x], unitPrice[x]);
      System.out.println(itemtotalPrice);

    }
    //whole invoice amount
    for(int y=0; y<quantity.length; y++){
       grand_total += total(item_price(quantity[y], unitPrice[y]));
    }
    System.out.println(grand_total);
    
    

  }
}
