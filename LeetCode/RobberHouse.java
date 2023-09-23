import java.util.Arrays;

public class RobberHouse {
  public static void main(String[] args) {
    
    
      //   int[] nums1 = new int[nums.length/2+1];
      //   int[] nums2 = new int[nums.length/2+1];
      //   int[] diff = new int[nums.length];
      //   int k=0;
      //   int maxnum = 0;
      //   int count1=0;
      //   int count2 =0;

      //   for(int i=0; i<nums.length; i+=2){
      //     if(i<nums.length){
      //       nums1[k] = nums[i];
      //     }
      //     if(i+1<nums.length){
      //       nums2[k] = nums[i+1];
      //     }
            
      //       k++;
      //   }
      //   System.out.println(Arrays.toString(nums1));
      //   System.out.println(Arrays.toString(nums2));
      //   for (int num : nums1) {
      //     count1 += num;
      // }
      // for (int num : nums2) {
      //     count2 += num;
      // }
      // System.out.println((count1 > count2) ? count1 : 
      // ((count2 >= count1) ? count2:0));
int[] nums = new int[]{2,1,1,2};
  

      int prevIncluded = 0;
      int prevExcluded = 0;
  
      for (int i = 0; i < nums.length; i++) {
          int currIncluded = nums[i] + prevExcluded;
          int maxSum = Math.max(currIncluded, prevIncluded);
  
          prevExcluded = prevIncluded;
          prevIncluded = maxSum;
      }
  
      System.out.println( Math.max(prevIncluded, prevExcluded));
  


    }

}
