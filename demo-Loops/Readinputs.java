import java.util.Scanner;

public class Readinputs{
  public static void main(String[] args){
    
    String str = "Hello";
    str.charAt(0);
    System.out.println("Please input counts");
    Scanner s = new Scanner(System.in); //input function

    int input = s.nextInt(); //code to read user integer input
    System.out.println("user's input is:" + input);

    for(int i=0; i<input; ++i){
      System.out.println("Hello");
    }


  }
}