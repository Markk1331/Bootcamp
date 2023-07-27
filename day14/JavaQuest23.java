/*
 * Question : given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
 * 
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
 * 
 * Return true if a and b are alike. Otherwise, return false.
 */

// hints : substring() , toCharArray() ?

import java.util.Arrays;

public class JavaQuest23 {
  public static void main(String[] args) {
    System.out.println(sameNumberOfVowels("book")); // true
    System.out.println(sameNumberOfVowels("textbook")); // false
  }

  public static boolean sameNumberOfVowels(String s) {
    // code here
    int half_length = s.length()/2;
    char[] a = s.substring(0,half_length).toCharArray();
    char[] b = s.substring(half_length,s.length()).toCharArray();
    //char [] vowels = new char[] {'a','e','i','o','u'};

    // StringBuilder sb1 = new StringBuilder();
    // StringBuilder sb2 = new StringBuilder();
    
    // String ab = sb1.append(Arrays.toString(a)).toString();
    // String ab1 =sb2.append(Arrays.toString(b)).toString();

    int count = 0;
    int counts = 0;
    for (char c : a) {
      switch (c) {
          case 'a':
          case 'e':
          case 'i':
          case 'o':
          case 'u':
          case 'A':
          case 'E':
          case 'I':
          case 'O':
          case 'U':
          count += 1;
          break;
      }
    }

    for (char bb : b) {
      switch (bb) {
          case 'a':
          case 'e':
          case 'i':
          case 'o':
          case 'u':
          case 'A':
          case 'E':
          case 'I':
          case 'O':
          case 'U':
          counts += 1;
          break;
      }
    }
     
    if(counts == count){
      return true;
    }

    return false ;
  }
}
