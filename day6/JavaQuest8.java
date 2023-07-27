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
    int[] nums5 = new int[] {0, 0,0,-240,0,0,0}; //Louise's question.
    // Your program should be able to handle all the above test case.

    //second max to arr[1], max to arr[0].

    int secondMax = nums5[0];
    int max = nums5[1];
    int count = 0;

    //find largest
    for(int x=0; x<nums5.length;x++){
      if(nums5[x]>max){
      max = nums5[x];
        }
      }
    //find second largest
     for(int x=0; x<nums5.length;x++){
             if(nums5[x] < max && nums5[x] > secondMax){
                secondMax = nums5[x];
             }
            }
    //condition for repeating largest
    for(int x=0; x<nums5.length;x++){
        if (nums5[x] == max){
          count += 1;
        }
      }
    if(count>=2){
      secondMax = max;
    }
    if (count ==1 && secondMax == max){
      secondMax = nums5[nums5.length-1];
        for(int x=0; x<nums5.length;x++){
          if(nums5[x] < max && nums5[x] > secondMax){
            secondMax = nums5[x];
              }
            }
    }
    System.out.println("count is "+ count);
    System.out.println("The second max is " + secondMax);
    System.out.println("The max is " + max);

  }
}