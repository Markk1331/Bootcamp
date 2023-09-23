public class JumpGame {
  public static void main(String[] args) { //greedy algorithm
    int[] nums = new int[] {2,3,1,1,4};
    int step =1;
    for(int i=0; i<nums.length-2;i++){
      if(step>nums[i])
        step++;
      else
        step=1;
    }
    System.out.println(step==1);
}
}
  
