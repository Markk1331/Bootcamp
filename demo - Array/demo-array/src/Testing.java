import java.util.Arrays;

public class Testing {

public static void main(String[] args) {

int[] numerator = new int[] { 3,2,6,3};
int sum = 9;
 for(int x=0; x<numerator.length;x++){
        for(int y=1; y<numerator.length-x-1; y++){
            if(sum == numerator[x]+numerator[y]){
              System.out.println(Arrays.toString(new int[]{x,y}));
          } else{
            System.out.println("false");
          }

        }
           
            //System.out.println(numerator[y]);
            
      }

      
}
}
    