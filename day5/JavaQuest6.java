/**
 * Expected output:
 * 1 1 2 3 5 8 13 21 34 ...
 * 
 */
// Count the target of character in a String.
public class JavaQuest6 {
  public static void main(String[] args) {
    int first_value = 1;
    int second_value = 1;
    int third_value = 0;
    int count = 13;
    System.out.println(first_value);
    System.out.println(second_value);

    // for loop to print first 15 numbers in Fibonacci Sequence
    for(int i=0; i<count; i++){
      //third_value = initial + initial;
      //forth_value = third_value + second_value
      third_value = second_value + first_value;

      System.out.println(third_value);

      first_value = second_value;
      second_value = third_value;
      
    }
  


  
  }
}
