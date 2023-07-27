import java.util.Arrays;

public class Search_position {

  public static void main(String[] args) {
    int[] numbers = new int[]{1,3,5,6};
    int target = 0;
    int count = 0;
    int [] tempt = new int[numbers.length+1];
    for(int c=0; c<numbers.length;c++){
      tempt[c] = numbers[c];
    }
    for(int x=0; x<numbers.length;x++){
      if(numbers[x]==target){
        count = x;
        break;
      }
      else if(numbers[x]!= target){
        tempt[tempt.length-1] = target;
        }
        
    }
    Arrays.sort(tempt);
    for(int b=0; b<tempt.length;b++){
      if(tempt[b]==target){
        count = b;
      }
    }
    System.out.println(count);
   
  }
  
}
