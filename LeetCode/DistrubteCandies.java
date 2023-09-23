import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DistrubteCandies {
  public static void main(String[] args) {
   
  int candies = 7;
  int num_people = 4;
  int[] nums = new int[num_people];
  int giveCandies = 0; //total
  int candy = 1;  //give out accumulatively
  int i = 0;
  
  while(true){


      if(giveCandies + candy <= candies){
        nums[i] += candy;
        giveCandies += candy ;
        candy++;

      }else{
        nums[i] += candies - giveCandies;
        break;
      }

      i++;
      if(i >= num_people)
          i =0;

      


  }
  System.out.println(Arrays.toString(nums));
}
}

