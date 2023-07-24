import java.util.Random;
import java.util.Scanner;

public class Game1 {
 public static void main(String[] args){

  int min =1;
  int max = 100;
  int bomb = new Random().nextInt(100)+1; //1-100

  int input = 0;
  do{
  Scanner scanner = new Scanner(System.in);
  System.out.println("Please insert from"+ min + "to" + max);

  input = scanner.nextInt();

  if(input < bomb){
    min = input + 1;

  }else if(input > bomb){
    max = input -1;
  }


  }while(input != bomb);

  System.out.println("You got the bomb");
 }
}
