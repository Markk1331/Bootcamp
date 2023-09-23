public class BottleExchange {
  public static void main(String[] args) {
    int numBottles = 15;
    int numExchange = 4;
    int count = numBottles;
    int temp = 0;

      while(numBottles >= numExchange){
        System.out.println("count" + count);
        temp = numBottles % numExchange;
        numBottles = numBottles - temp;
        count += numBottles  / numExchange;
        numBottles = (numBottles/numExchange) + temp;
          
      }
      System.out.println(count); 
  

  }
}
