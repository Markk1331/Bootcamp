import java.util.HashSet;
import java.util.Set;

public class isHappy {
  public static void main(String[] args) {

  int digits = 0;
  int tempt = 0;
  int n = 7;
  int i = 0;

  Set<Integer> checker = new HashSet<>();

  while(checker.add(n)){
    tempt = 0; //reset tempt to 0
    System.out.println(checker);
   while(n>0){
    digits = n %10;
    System.out.println("digits: " + digits);

    tempt += digits * digits; //square of the last digit
    System.out.println("tempt: " + tempt);
    n /= 10; //moving the index to the left by one digit
   }
   i++;
   System.out.println(i);
      if(tempt ==1)
        System.out.println(true);
      else
        n = tempt;
      
   

  }
  System.out.println(false);

  }
}
