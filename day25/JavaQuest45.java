/*
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
 * 
 * Note that after backspacing an empty text, the text will continue empty.
 */
public class JavaQuest45 {
  public static void main(String[] args) {
    System.out.println(backspaceCompare("ab#c", "ad#c"));
    System.out.println(backspaceCompare("ab##", "c#d#"));
    System.out.println(backspaceCompare("a#c", "b"));

    int diff = 3;
    int[] nums = new int[] {0,1,4,6,7,10};
    HashSet<Integer> counter = new HashSet<>();
    int count =0;
     //for(int i=0; i<nums.length; i++){
      for(int num: nums){
            if(counter.contains(num-diff ))
                count += 1;
            else
                counter.add(nums[i]);
        }
        return count;
  }

  // Approach 1
  public static boolean backspaceCompare(String s, String t) {
  }

}
