import java.util.Arrays;

public class Testing4 {
  public static void main(String[] args) {
    String s = "abcdefg";
    String target = "cdefgab";

    String str = "";
    char tempt = 'a';
      char[] characters = s.toCharArray();
      

      for(int y=characters.length-1; y>=0; y--){
          tempt = characters[characters.length-1];
        for(int x = characters.length -1; x>=1; x--){
            characters[x] = characters[x-1];
        }
          characters[0] = tempt;
          for(char c:characters){
          str += c;
          }
          //System.out.println(Arrays.toString(characters));
          System.out.println(str);
          if(target.equals(str)){
            //System.out.println(true);
            break;
          }
          str = " ";
          
    }
    //System.out.println(false);
  }
  }

