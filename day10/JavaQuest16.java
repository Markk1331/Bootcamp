/*
 * Sum up to Zero
 */

// Input: n = 5
// Output: [-7,-1,1,3,4]
// Explanation: These arrays are also accepted [-5,-1,1,2,3], [-3,-1,2,-2,4].

// Input: n = 3
// Output: [-1, 1, 0] or [-3, 1, 2] or ...

// Input: n = 2
// Output: [-2, 2] or [-1, 1] or ...

// Input: n = 1
// Output: [0]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class JavaQuest16 {

  // Given an integer n (n > 0), Find n unique Integers Sum up to Zero

//   public static int flip_a_coin() {
//     int flip_coin = new Random().nextInt(2);
//     int head = new Random().nextInt(9) + 1; // positive random
//     int tail = new Random().nextInt(9) - 10; // negative random
//     int outcome;
//     if (flip_coin == 0) {
//         outcome = head;
//     } else {
//         outcome = tail;
//     }
//     return outcome;
// }

  public static int[] sumToZero(int x){
    int total;
    int count;
    int[] arr = new int[x];

    do{
      total = 0;
      List<Integer> list = new ArrayList<>();
      for(int i=0; i<x; i++ ){
        int value;

      do{
        value = new Random().nextInt(18) - 9;
      }while(list.contains(value));

      list.add(value);
      arr[i] = value; //-9 to 9
      total += arr[i];
      }
    }while(total != 0);
  //if(total==sum){
  return arr;
  }


  // Do not change anything in main method
  public static void main(String[] args) {
    int[] nums = sumToZero(5); // n = 5
    int[] nums1 = sumToZero(3); // n = 3
    int[] nums2 = sumToZero(2); // n = 2
    int[] nums3 = sumToZero(1); // n = 1

    System.out.println(Arrays.toString(sumToZero(5)));
    System.out.println(Arrays.toString(nums));

  // Code a method to return int[].
  // 1. All values in this array sum up to Zero.
  // 2. The length of array = n
  // 3. The values in the array has to be unique
  }
}
