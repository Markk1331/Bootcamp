import java.util.Arrays;

public class SubtractProductSum {
  public static void main(String[] args) {
    int n = 234;
    int subtotal = 1;
    int subtotal2 = 0;
    char[] nums = String.valueOf(n).toCharArray();
    for(int i=0;i<nums.length;i++){
      subtotal *= nums[i]-'0';
      subtotal2 += nums[i]-'0';
    }
      int total = subtotal - subtotal2;
    //System.out.println(Arrays.toString(nums));
    System.out.println(total);
  }
  
}
