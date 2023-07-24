import java.util.Arrays;

public class Plus_one {
  public static void main(String[] args) {


    int[] digits = new int[] {9,9}; //have to lower than than 100
    int[] new_nums = new int[digits.length+1];
    int[] answer = new int [digits.length];

    for (int i = digits.length - 1; i >= 0; i--) {
      if(digits[i] <9){
        digits[i]++;
        System.out.println(Arrays.toString(digits));
        break;
      }

        digits[i] =0;
      //System.out.println(Arrays.toString(digits));
    }
    if (digits[0] == 0) {
      digits = new int[digits.length + 1];
      digits[0] = 1;
      System.out.println(Arrays.toString(digits));
  }
  
      }
    
    }
  
