import java.util.Arrays;

public class bubble_sort2 {

  public static void main(String[] args){
    int[] nums = new int[] {21,8,9,2,1,-5,13,20};

    int Length = nums.length;
    for(int x=0; x<Length;x++){
      for(int y=1; y<Length-x;y++){
        if(nums[y-1]>nums[y]){
          int temp = nums[y];
          nums[y] = nums[y-1];
          nums[y-1] = temp;

        }
      }
    }

    System.out.println(Arrays.toString(nums));
  }

}
