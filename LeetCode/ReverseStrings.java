public class ReverseStrings {
  public static void main(String[] args) {
    String str = "Let's take LeetCode contest";
    StringBuilder result = new StringBuilder();

    for(String s:str.split(" ")){
      
      StringBuilder tempt = new StringBuilder(s);
     System.out.println(tempt.toString());
      result.append(tempt.reverse()).append(" ");
  }
  System.out.println(result.toString().trim());
}
}