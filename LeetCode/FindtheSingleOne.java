import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindtheSingleOne {
  public static void main(String[] args) {
    int[] nums = new int[] {1,2,1,3,1,1,3};
    int incremenet = 0;

    HashMap<Integer,Integer> result = new HashMap<>();

    for(int i =0; i<nums.length;i++){
      if(!result.containsKey(nums[i])){
        result.put(nums[i], 0);
      }else{
        result.put(nums[i], incremenet++);
      }
    }


    for(Map.Entry<Integer,Integer> entry: result.entrySet()){
      if(entry.getValue()!=0)
        continue;
      int Key = entry.getKey();
      System.out.println(Key);

    }
  }
}
