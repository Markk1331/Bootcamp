import java.util.Scanner;

public class DoWhileLoop {
  public static void main (String[] args){

    //Do-While Method
    int count = 0;
    do{
      System.out.println("Hello, count=" + count);
      count++;
    } while (count<3);


//if input is even --> continue;
///if output is odd --> exit
    int input =0;
    do{
      Scanner scanner = new Scanner(System.in);
      input = scanner.nextInt();
     
      System.out.println(input);
    }while (input%2==0);

     if(input%2 ==1){
       System.out.println(input);
      }

  }
}
