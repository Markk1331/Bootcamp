public class Reverse_Prefixofword {
  public static void main(String[] args) {
    String word = "abcdefd";
    char ch = 'z';
    String str = "";

    int position = word.indexOf(ch);
  

    char[] characters = word.toCharArray();
    for(int x=position; x>=0; x--){
      str += characters[x];
    }
    for(int y=position+1; y<characters.length; y++){
      str += characters[y];
    }
      
    System.out.println(str);

  }
}
