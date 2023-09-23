import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidswithGreatestCandies {
  public static void main(String[] args) {
    System.out.println(kidsWithCandies(new int[]{2,3,5,1,3},3));
  }
  
  public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     List<Boolean> abc = new ArrayList<Boolean>();
     int count = 0;
     int k = 0;
   
    for(int i =0; i<candies.length; i++ ){

      while(k<candies.length){
        if((candies[i] + extraCandies) >= candies[k])
            count ++;
          k++;
      }
        k =0;
      
System.out.println(count);
      if(count >= candies.length)
        abc.add(true);
      else
        abc.add(false);

      count = 0;
      // candies[i] = candies[i] + extraCandies;
      
  }
  
  
  return abc;
}

}