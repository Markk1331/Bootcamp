import java.util.Arrays;

public class Smalles_Palidrome {
  public static void main(String[] args) {
    String s = "abcd";
    //afcfa
    char[] characters = s.toCharArray();

    int length = s.length();
    String reverse = "";
      for ( int i = length - 1; i >= 0; i-- ){ 
         reverse += s.charAt(i);  
      }
    if (s.equals(reverse)){
      System.out.println(s);
      }else{
        int x =0;
        //for(int x=0; x<characters.length; x++){
          for(int y=characters.length-1; y>=0; y-- ){
            if(characters[x]<(characters[y]))
            characters[y] = characters[x];
            else{
            characters[x] = characters[y];
            }
            x++;
          }
        //}
      }
      String str = "";
      System.out.println(Arrays.toString(characters));
      for(char c: characters){
        str += c;
      }
      System.out.println(str);
  }
}
