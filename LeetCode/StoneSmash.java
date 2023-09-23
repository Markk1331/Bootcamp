import java.util.Arrays;

public class StoneSmash {
  public static void main(String[] args) {
    int[] stones = new int[] {1,3};
    Arrays.sort(stones);
    int max = 0;

    while(stones[stones.length-2] >0){
       max = stones[stones.length-1] - stones[stones.length-2];
       stones[stones.length-2] = 0;
       stones[stones.length-1] = max;
       
       Arrays.sort(stones);
      // System.out.println(Arrays.toString(stones));
    }
    System.out.println(stones[stones.length-1]);
  }
}
