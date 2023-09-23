import java.util.Arrays;

public class LeftRightDiff {
  public static void main(String[] args) {
    int[] nums = new int[]{10,4,8,3};

    int [] lsum = new int[nums.length];
    int[] rsum = new int[nums.length];
    int sum = 0;

    for(int i=0; i<nums.length;i++){
      lsum[i] = sum;
      sum += nums[i];
    }
    sum = 0;

    for(int i=nums.length-1; i>=0;i--){
      rsum[i] = sum;
      sum += nums[i];
    }

    for(int i=nums.length-1; i>=0;i--){
      nums[i] = Math.abs(lsum[i]-rsum[i]);
    }


    System.out.println(Arrays.toString(lsum));
    System.out.println(Arrays.toString(rsum));
    System.out.println(Arrays.toString(nums));

  }
}
