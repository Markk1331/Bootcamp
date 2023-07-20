import java.util.Arrays;

public class Swap2 {


  public static void main(String[] args){
    int[] nums = new int[] {3,8,10,30,100,-19};
    //Move the max number to the tail
    int max = 0;
    for(int x=0; x<nums.length;x++){
      if(nums[x] > max){
        max = nums[x];
      }
    
    }
    nums[nums.length-2] = nums[nums.length-1];
    nums[nums.length-1] = max;
    System.out.println(Arrays.toString(nums));





  }
  
}
