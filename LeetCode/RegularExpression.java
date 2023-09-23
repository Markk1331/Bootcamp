public class RegularExpression {
  public static void main(String[] args) {

  String s = "abc";
  String p = "ab****b";

  StringBuilder sb = new StringBuilder();

    
  for(int i=0; i<p.length();i++){
    
    if(p.charAt(i)=='*' && p.charAt(i-1)!='*' ){
      sb.append(p.charAt(i));


  }else if(p.charAt(i)!='*')
  sb.append(p.charAt(i));
  }


  System.out.println(sb.toString());
        //  boolean isMatch = s.matches(sb.toString());

        // if (isMatch) {
        //     System.out.println(true);
        // } else {
        //     System.out.println(false);
        // }
    

  }
}
