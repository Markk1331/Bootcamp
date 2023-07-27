/*
 * Question : Given two strings s and goal, 
 * return true if and only if s can become goal after N shifts on s.

Definition of a shift:
Moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.

Assume the input need to be lowercase English letters.
*/

import java.util.Arrays;

public class JavaQuest20 {

  public static void main(String[] args) {
    System.out.println(rotateString("abcde", "cdeab"));// true
    System.out.println(rotateString("abcde", "abced"));// false
    System.out.println(rotateString("abcde", "eabcd"));// true
    System.out.println(rotateString("abcde", "abcde"));// true
  }

  public static boolean rotateString(String s, String goal) {

      String str = "";
      char tempt = 'a';
      char[] characters = s.toCharArray();

      for(int y=characters.length-1; y>=0; y--){
        tempt = characters[0];

        for(int x = 0; x<characters.length-1; x++){
            characters[x] = characters[x+1];
            }

        characters[characters.length-1] = tempt;
          for(char c:characters){
            str += c;
            }

          if(goal.equals(str)){
          return true;
           }
           //System.out.println(Arrays.toString(characters));
          //System.out.println(str);
          str = "";
        }
        
  return false;
}
      
  }
