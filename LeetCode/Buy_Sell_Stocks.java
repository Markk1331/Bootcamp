public class Buy_Sell_Stocks {
  public static void main(String[] args) {
    int[] prices = new int[] {7,1,5,3,6,4};

    int min = Integer. MAX_VALUE;
    int sell = 0;
    int execution = 0;

    for(int i =0;i<prices.length;i++){

      if(prices[i]<min ){
        min = prices[i];
      }
      // if(prices[i]>max ){
      //   max = prices[i];
      // }
      sell = prices[i] - min;
      System.out.println("min" + min);
      System.out.println("i" + prices[i]);
      if(execution < sell){
        execution = sell;
      }
    }

    System.out.println(execution);
  }
}
