/*
 * 
 * Question : You are given an integer array nums. 
 * The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
*/

import java.util.Arrays;

public class JavaQuest26 {
  public static void main(String[] args) {
    System.out.println(sum(new int[] { 1, 2, 3, 2 })); // 4
    System.out.println(sum(new int[] { 1, 1, 1, 1, 1 }));// 0
    System.out.println(sum(new int[] { 1, 2, 3, 4, 5, 6 }));// 21
    System.out.println(sum(new int[] { 1 }));// 1
  }

  public static int sum(int[] nums) {
    int sum =0;
    int[]stats = new int[10];
    int[]numbs = new int[10];
    int p = 0;
    for(int i=0; i<nums.length;i++){
      stats[nums[i]] ++;
    }
    for(int k =0; k<stats.length; k++){
      numbs[k] = stats[k] * p;
      p++;
    }
    for(int j=0; j<stats.length;j++){
      if(stats[j] == 1){
        sum += numbs[j];
      }
    }
      System.out.println(Arrays.toString(stats));
    return sum;
  }

}
