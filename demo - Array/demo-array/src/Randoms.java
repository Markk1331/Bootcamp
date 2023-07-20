import java.util.Random;

public class Randoms {
  
  public static void main (String[] args){
    int num = new Random().nextInt(1,4); //0,1,2
    //nextInt(3) + 1  <---- //1,2,3
    System.out.println(num);

    System.out.println(randomAbcde());
  }

  public static char randomAbcde(){
  
    //A,B,C,D,E
    char[] chars = new char[] {'A','B','C','D','E'};

    //can put function inside array[index]
    return chars[new Random().nextInt(5)];
    //return (char) (new Random().nextInt(5)+65;)
  }
}


