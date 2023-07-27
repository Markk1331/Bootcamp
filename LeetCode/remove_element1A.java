public class remove_element1A {
  class Solution {
    public int removeElement(int[] nums, int val) {
        // nums = {1,3,3,1,3,3}
        int c = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[c] = nums[i];
                c++;
                
            }
            
        }
        
        return c;
    }
    

}
}
