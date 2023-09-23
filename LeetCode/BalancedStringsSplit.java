public class BalancedStringsSplit {
  public static void main(String[] args) {
    String s = "RLRRRLLRLL";
    int r =0;
    int l =0;
    int sum = 0;

    for(int i =0; i<s.length();i++){
      if(s.charAt(i)=='R')
        r++;
      else if (s.charAt(i)=='L')
        l++;
      
      System.out.println("l " +l);
      System.out.println("r " +r);
      if(l==r)
        sum++;

      
    }
    // System.out.println(l);
    // System.out.println(r);
    System.out.println(sum);
    
  }
}
