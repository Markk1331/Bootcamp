/*
 * Question : Given a string s, return the number of segments in the string.

A segment is defined to be a contiguous sequence of non-space characters.

 * 
*/

import java.util.Arrays;

public class JavaQuest25 {
  public static void main(String[] args) {
    System.out.println(countWords("       ")); // 0
    System.out.println(countWords("")); // 0
    System.out.println(countWords("Hello")); // 1
    System.out.println(countWords("Hello, my name is John."));// 5
    System.out.println(countWords(" . "));// 1
  }

  public static int countWords(String s) {
    int count = 0;
    s = s.trim();
    String[] characters = s.split(" ");
    for(String c: characters){
      if(!c.isBlank()){
        count += 1;
      }
    }
    System.out.println(Arrays.toString(characters));
    return count;
  }
}
