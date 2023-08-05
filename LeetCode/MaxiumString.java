public class MaxiumString {

  public static void main(String[] args) {
    int max = 0;
      String[] sentences = new String [] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
  for(String s: sentences){
    max = Math.max(max, s.split(" ").length);
    System.out.println(s);
      
  }
  System.out.println(max);
  }

}
