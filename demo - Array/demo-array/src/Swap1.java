import java.util.Arrays;

public class Swap1 {

  
  public static void main(String[] args){
    int[] numbers = new int[] {5,-3,23,71,8,0,-5,-3,1000,30};
    int temp1 = 0;
    int temp0 = numbers[0];
    int last = numbers[numbers.length-1];
    for(int x=0; x<numbers.length-1;x++){

        temp1 = numbers[x+1];
        numbers[x+1] = numbers[x];
        numbers[x] = temp1;
      //numbers[x] = numbers[x+1];
      }
    // System.out.println(numbers);
      numbers[numbers.length-1] = temp0;
    System.out.println(Arrays.toString(numbers));
  }
}
