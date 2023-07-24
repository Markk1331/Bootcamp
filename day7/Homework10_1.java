import java.util.Arrays;

public class Homework10_1 {

  //This push everything to the right 
  public static void main(String[] args){

    int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};



    int[] new_array = new int[my_array.length+1];
     new_array[new_array.length-1] = 0;
    for(int i=0; i<my_array.length; i++){
      new_array[i] = my_array[i];
    }
    
  
    for(int y=new_array.length-1; y>=1; y--){
      new_array[y] = new_array[y-1];
    }
    new_array[1] = 101;
    
    System.out.println("Orignal Array:" + Arrays.toString( my_array));
    System.out.println("New Array:" + Arrays.toString( new_array));
  }
  
}
