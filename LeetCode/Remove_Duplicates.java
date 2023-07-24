import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Duplicates{
  public static void main(String[] args) {
    int[] nums = new int[] {1,2,3,4,1,2,5,6,7}; // default testing answer 
    int sum =0;
    
    int[] PrimitiveArr = new int[nums.length];
    ArrayList<Integer> Numbers = new ArrayList<Integer>();
    for(int i =0; i<nums.length-1; i++){
      while(!Numbers.contains(nums[i])){
       Numbers.add(nums[i]);
      }
    
  }
  System.out.println(Numbers);
  int n = Numbers.size();

  for(int i=0; i< n; i++) {
    PrimitiveArr[i] = Numbers.get(i);
}
  for(int y =0; y<PrimitiveArr.length; y++){
    sum += PrimitiveArr[y];
  }
System.out.println(sum);





    }
  }
  

