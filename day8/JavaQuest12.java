import java.util.Arrays;

/**
 * Case 1: [2,7,11,15] Target: 9 Ans: [0, 1] or [1, 0]
 * 
 * Case 2: [3,2,4] Target: 6 Ans: [1, 2] or [2, 1]
 *
 * Case 3: [3, 3] Target: 7 Ans: [-1, -1]
 */
public class JavaQuest12 {
  // Given an array of integers nums and an integer target, return the index of
  // the two numbers such that they add up to target.

  // You may assume that each input would have exactly one solution OR no
  // solution, and you may not use the same element twice.

  // If no solution, return [-1, -1]

  // You can return the answer in any order.

  // Do not change anything in main method


  // Code a method here to return an array of two numbers that sum up to the
  // target
    public static int[] twoSum (int[] numerator, int denumerator){

      int[] nulls = new int[] {-1,-1};
      
      int sum = denumerator;
      for(int x=0; x<numerator.length;x++){
              for(int y=x+1; y<(numerator.length); y++){
                  if(numerator[x]+numerator[y] == sum){
                    return new int[]{x,y};
          }
          }
     
    }
    return nulls; 
  }
    public static void main(String[] args) {
     int[] answers = twoSum(new int[] { 2, 11, 15, 7}, 9); // {2, 7, 11, 15} is the dataset, 9 is the target to sum
    int[] answers2 = twoSum(new int[] { 3, 2, 4 }, 6); // {3, 2, 4} is the dataset, 6 is the target to sum
    int[] answers3 = twoSum(new int[] { 3, 3 }, 7); // {3, 3} is the dataset, 7 is the target to sum

    //System.out.println(twoSum(new int[] {2, 7, 11, 15}, 6));

    System.out.println(Arrays.toString(answers));
    System.out.println(Arrays.toString(answers2));
    System.out.println(Arrays.toString(answers3));
  }
}
