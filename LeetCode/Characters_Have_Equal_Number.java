import java.util.Arrays;

public class Characters_Have_Equal_Number {
  public static void main(String[] args) {
    
  
  String s = "aabacbz";
  int count = 0;

  int[] words = new int[26];
  int max =0;

  //int alphapet_index = s.charAt(i) - 'a' // alphphet location
  for(int i =0; i<s.length(); i++){
    words[s.charAt(i)-'a']++;
    System.out.println(Arrays.toString(words));
  }
  for(int i: words){
    max = Math.max(max, i);
    System.out.println(max);
  }

  for(int o=0; o<words.length; o++){
    if(words[o]!=0 && words[o]!= max){
      System.out.println(false);
    }
  // }
   
}
 System.out.println(true);
}
}