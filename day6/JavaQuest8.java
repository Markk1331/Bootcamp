/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax = nums4[0];
    int max = nums4[1];
    int count = 0;

    //find largest
    for(int x=0; x<nums4.length;x++){
      if(nums4[x]>max){
      max = nums4[x];
        }
      }

    //find second largest
     for(int x=0; x<nums4.length;x++){
             if(nums4[x] < max && nums4[x] > secondMax){
                secondMax = nums4[x];
             }
            }

    //condition for repeating largest
    for(int x=0; x<nums4.length;x++){
        if (nums4[x] == max){
          count += 1;
        }
      }
    if(count>=2){
      secondMax = max;
    }
    System.out.println("The second max is " + secondMax);
    System.out.println("The max is " + max);

  }
}