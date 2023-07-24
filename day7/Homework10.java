import java.util.Arrays;
import java.util.Scanner;

public class Homework10 {
  public static void main(String[] args) {

    int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

    Scanner input = new Scanner(System.in);
    System.out.print("Input an index for inserting the value: ");
    int indexPosition = input.nextInt();
    System.out.print("Input the value: ");
    int newValue = input.nextInt();
    System.out.println("Original Array : " + Arrays.toString(my_array));

    if(indexPosition<10){

      for(int y=my_array.length-1; y>=indexPosition; y--){
        my_array[y] = my_array[y-1];
      }
      my_array[indexPosition] = newValue;
      System.out.println("New Array: " + Arrays.toString(my_array));
    }else{
      System.out.println("New Array : " + Arrays.toString(my_array));
    }
  }
}
