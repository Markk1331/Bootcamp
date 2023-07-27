public class Merge_string2 {
  public static void main(String[] args) {
    String word1 = "abc";
    String word2 = "def";
    int n = word1.length() > word2.length() ? word1.length() : word2.length();

    StringBuilder s = new StringBuilder();
    for(int i=0; i<n; i++){
      if(i< word1.length()){
        s.append(word1.charAt(i));
      if(i<word2.length()){
        s.append(word2.charAt(i));
      }
      }
 
    }
    System.out.println(s.toString());
  }
}
