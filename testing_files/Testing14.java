import java.util.Arrays;

public class Testing14 {
  public static void main(String[] args) {
    String s = "adcefbdafe";
    
    
    int[] characters = new int[26];
    for(int i=0; i<s.length();i++){

      int p = s.charAt(i)-'a';
      char c = (char) (p+97);
      //System.out.println(p);
        if(++characters[p]==2){
          System.out.println(c);
          
        }
        
    }
    System.out.println(Arrays.toString(characters));
  }
}
