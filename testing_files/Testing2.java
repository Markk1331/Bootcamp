import java.util.Random;

public class Testing2 {
  // Given an integer n (n > 0), Find n unique Integers Sum up to Zero

  public static int flip_a_coin(){

    int flip_coin = new Random().nextInt(2);
    int head = new Random().nextInt(9)+1; //positive random
    int tail= new Random().nextInt(5); //negative random
    int outcome;
    if(flip_coin==0){
      outcome = head;
    }else{
      outcome = tail;
    }
    return outcome;
  }

  public static int[] sumToZero(int x){
    int[] arr = new int[x];
    int total = 0;
    do {
      for(int i=0; i<x; i++ ){
        arr[i] = flip_a_coin();
        total += arr[i];
      }
    } while(total != 0);

    return arr;
  }

  public static void main(String[] args) {
    int[] arr = sumToZero(5);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}