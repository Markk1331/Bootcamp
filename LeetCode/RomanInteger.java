import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class RomanInteger {
  public static void main(String[] args) {
    String s = "III";
    int result = 0;
    int currentValue = 0;
    int previousValue = 0;

       HashMap<Character,Integer> roman = new HashMap<>();
        
          roman.put('I', 1);
          roman.put('V', 5);
          roman.put('X', 10);
          roman.put('L', 50);
          roman.put('C', 100);
          roman.put('D', 500);
          roman.put('M', 1000);
        

        for(int i=s.length()-1; i>=0; i--){
          currentValue = roman.get(s.charAt(i));
            if (currentValue >= previousValue)
              result += currentValue;
            else
              result -= currentValue;
         
            previousValue = currentValue;
        }

       
        System.out.println(result);
    }
}
 