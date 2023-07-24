import java.util.Arrays;

public class insertion_method_2 {
  public static void main(String[] args){

  int[] numbers = new int[] {10,4,3,9,0,1,7};

  for(int x=1; x<numbers.length; x++){
    int j = x-1;
    int key = numbers[x];  
    //First, put the index1st number to the key box
    //Afte the loop, set new key (if swap is made). If no swap is made(x increments) -- next value -- is set for the comparsion.

    while(j>-1 && numbers[j]>key){   //j>-1 means if there are values on the left side side in the comparsion
      numbers[j+1] = numbers[j]; 
      //move [j+1] (bigger value) to the right, since preceeding number is bigger. This is running temp-swap principle.       

      j--; //continuous checking to the left values(if any); if preceeding {array value} is bigger than key
       //if key is smaller, the "tempt-swap-place" takes place continusonsly to the left if preceeding bigger values are bigger.
      
    }                    
    numbers[j+1] = key; //shift bigger number to the gap (which is taken to the key box). This is running temp-swap principle.

  }
  System.out.println(Arrays.toString(numbers));
}
}
