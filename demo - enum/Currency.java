public enum Currency {
  USD(1,"US Dollar"),
  HKD(2,"Hong Kong Dollar"),
  CNY(3,"Chines ReminBi"),
  GBP(4,"British Pound Sterling")
  ;

  private String description;
  private int id;

  private Currency(int id, String description){
    this.description = description;
    this.id = id;
  }


  public String getDesc(){
    return this.description;
  }

   public int getid(){
    return this.id;
  }
  public static Currency getCurrency(int id){
    //values()
    for (Currency currency: Currency.values()){
      if(currency.id == id)
        return currency;
    }
    return null;
  }


  public static void main(String[] args) {
    System.out.println(Currency.valueOf("HKD").getDesc());
  }
}
