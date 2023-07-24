import java.util.Arrays;

public class Split_method2 {
  public static void main(String[] args){
        //using substring()
    //substring.()

    String s2 = "I am MarK. Hello Everybody.";

    int spaceCount = 0;
    for(int i =0; i<s2.length(); i++){
      if(s2.charAt(i) == ' '){
        spaceCount ++;
      }
    }
    int startIdx =0;
    int idx = 0;
    String[] result = new String[spaceCount + 1];
    for(int i=0; i<s2.length();i++){
      if(s2.charAt(i)==' '){
        result[idx] = s2.substring(startIdx, i);
        idx++;
        startIdx = i + 1;
      }else if(i == s2.length() -1){
        result[idx] = s2.substring(startIdx, s2.length());
      }

    }
    System.out.println(Arrays.toString(result));
  }
}
