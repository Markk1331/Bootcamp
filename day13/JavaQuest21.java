/*

Question : Given an integer n, return true if n has exactly three positive divisors. 
Otherwise, return false.

An integer m is a divisor of n if there exists an integer k such that n = k * m.

*/
public class JavaQuest21 {
  public static void main(String[] args) {
    System.out.println(isThreeDivisors(1)); // false
    System.out.println(isThreeDivisors(3)); // false
    System.out.println(isThreeDivisors(4)); // true, 4/1, 4/2, 4/4
    System.out.println(isThreeDivisors(12));// false
    System.out.println(isThreeDivisors(9999));// false
   
    // int counts = 0;
    // for(int x =1; x<=4; x++){
    // if(4%x==0){
    //    counts +=1;
    // }
    
  // }

  // System.out.println(counts);
}

  public static boolean isThreeDivisors(int n){
    int count = 0;
    for(int x =1; x<=n; x++){
    if(n%x==0){
      count +=1;
    }
  }
    if(count == 3){
      return true;
    }
    return false;
  }
}
