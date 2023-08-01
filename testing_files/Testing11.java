import java.util.Arrays;

public class Testing11 {

  public static void main(String[] args) {
    
    int[] timeSeries = new int[]{1,3,5,7,9,11,13,15};
    int duration = 3;
    int[]counter = new int[(timeSeries[timeSeries.length-1])+duration+1];
    int k = 0;
    int poison = 0;
    int poison_tic = duration;

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
              
                if(counter[j+poison_tic] == 0){
                    while (poison_tic < duration ) {
                        poison_tic++;
                        poison++;
                    }
                    
                    poison_tic = duration; // reset poison_tic for the new poison attack
                }
            }
            
            if (poison_tic < duration) {
                poison++;
            }
        }
    }

    System.out.println(Arrays.toString(counter));
    System.out.println(poison);
    System.out.println("poison_tic " +poison_tic);
    System.out.println("total poison duration: " + (poison * duration + Math.min(poison_tic, duration))); // added for debugging
}
  
}
