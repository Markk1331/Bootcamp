import java.util.Arrays;

public class Remove_element {

  public static void main(String[] args) {
  int[] nums = new int[] {3,2,2,3};
  int[] nums1 = new int [nums.length] ;
  int val = 3;
  int zero_counter =0;
  int total_counter =0;

  for(int x=0, y=0; x<nums.length; x++){
    if(nums[x] == val){
      continue;
    }
   nums1[y++] = nums[x];
  }
  for(int p : nums1){
    if(p==0){
      zero_counter +=1;
    }
 }
  int[]nums2 = new int [nums.length-zero_counter];
  for(int q = 0; q<nums2.length; q++){
    nums2[q] = nums1[q];
  }
  for(int t=0; t<nums2.length; t++){
    total_counter += t;
  }
  System.out.println(Arrays.toString(nums2));
  System.out.println(total_counter+1);


  }

}
