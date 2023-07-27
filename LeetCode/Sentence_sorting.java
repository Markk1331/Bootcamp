import java.util.Arrays;

public class Sentence_sorting {

  public static void main(String[] args) {
    String s = "is2 sentence4 This1 a3";
    String comb_str = "";
    String[] words = s.split(" ");
    String[] new_combo = new String [words.length]; 

    for(int p=0; p<words.length; p++){
      int lastCharValue = words[p].charAt(words[p].length() - 1) - '0';  //integer.valueOf  && -'0'
      //System.out.println("word: " + words[p] + ", lastCharValue: " + lastCharValue);
        new_combo[lastCharValue-1] = words[p];
    }
    for (String c: new_combo){
      comb_str += c.substring(0,c.length()-1) + " ";
    }
    //System.out.println(Arrays.toString(new_combo));
    System.out.println(comb_str);
  }
}
    //System.out.println(comb_str);
    //System.out.println(Arrays.toString(words));
      
  

