public class PermutationSemiOrder {
  public static void main(String[] args) {
    int []nums = new int[] {1,4,2,3};
    int start = 0;
    int end = 0;
    int count =0;
    
    for(int i=0; i<nums.length;i++){
      if(nums[i] ==1)
        start = i;
      if(nums[i] ==nums.length)
        end = i;
    }
    if(start>end)
      count += start + (nums.length-2 - end);
  else
    count += start + (nums.length-1-end);
  
    System.out.println(count);

  }
}
