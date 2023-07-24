import java.util.Arrays;

public class Maxium69 {
    public static void main(String[] args) {
      int num = 6969;

        char [] numbers = String.valueOf(num).toCharArray();
        for(int i=0; i<numbers.length; i++){
          if(numbers[i]=='6'){
            numbers[i]='9';
            break;
          }
        }
          System.out.println(Integer.valueOf(String.valueOf(numbers)));



          
        
        
    }
}