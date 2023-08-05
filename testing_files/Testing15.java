import java.util.Arrays;

public class Testing15 {
 public static void main(String[] args) {
  int[] ranks = new int[] {1,2,3,4,5};
  int[] cards = new int[13];
  int count = 0;
  for (int i = 0; i < ranks.length; i++) {
    if (++cards[ranks[i] - 1] >= 2){
     count += 1;
    }
    System.out.println(count);
    System.out.println(Arrays.toString(cards));
  }
 } 
 }
