import java.util.Arrays;
import java.util.HashSet;

public class testing16 {
  public static void main(String[] args) {

int[] nums = new int[] {1,4,6,7,10};
 int diff = 3;
HashSet<Integer> counter = new HashSet<>();
int count =0;
for(int i=0; i<nums.length; i++){
  // int num1 = nums[i] - diff;
  // int num2 = nums[i] - diff * 2;
  if (counter.contains(nums[i] - diff) && counter.contains(nums[i] - diff * 2)) {
    count += 1;
  //System.out.println(nums[i]);
  }
  counter.add(nums[i]);
  
  }
System.out.println(count); 
}

}
