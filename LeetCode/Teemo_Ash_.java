import java.util.Arrays;

public class Teemo_Ash_ {


  public static void main(String[] args) {
    
    int[] timeSeries = new int[]{1,4,6,9};
    int duration = 3;
    int[]counter = new int[(timeSeries[timeSeries.length-1])+duration+1];
    int k = 0;
    int poison = 0;
    int poison_tic = 1;

      if(duration < 1){
      System.out.println("no poison");
    } else{

    while(k<counter.length){
    for(int i=0; i<timeSeries.length; i++){
        if(k==timeSeries[i]){
          counter[k] = timeSeries[i]; 
        }
      }
      k++;
      }

    for(int j=0;j<counter.length;j++){
      if(counter[j] > 0){
        poison ++;
      
      while(poison_tic < duration &&  counter[j + poison_tic] == 0){
        poison ++;
         poison_tic ++;
         
      }
    
  }
      poison_tic = 1;
    }
  }
    System.out.println(Arrays.toString(counter));
    System.out.println("actual poison duration: " + poison);
    System.out.println("total poison duration: " + (poison * duration + Math.min(poison_tic, duration))); // added for debugging
}
}

