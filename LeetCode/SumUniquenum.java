import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumUniquenum {
  public static void main(String[] args) {
    int sum =0;
    HashMap<Integer,Integer> counter = new HashMap<>();
    int[] nums = new int[] {1,2,3,4,5};

    for(int i =0; i<nums.length; i++){
      if(counter.containsKey(nums[i]))
        counter.put(nums[i], counter.get(nums[i])+1);
      else
        counter.put(nums[i], 1);
      
    }
    for(Map.Entry<Integer,Integer> entry : counter.entrySet()){
      if(entry.getValue()==1)
        sum+=entry.getKey();
      

        

    }
    System.out.println(sum);
  }
}
