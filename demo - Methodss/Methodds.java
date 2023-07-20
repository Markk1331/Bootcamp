public class Methodds {
  public static void print() {
    System.out.println("Hello in print() method.");
  }

  public static int sums(int x, int y){ // left int = return type
      int c = x + y;
      return c;
  }

  public static int subtr(int p, int o){
    return p - o;
  }

  public static void method2(String str){

    if(str==null || "".equals(str)){ //if string is empty or null
      return;
    }

      System.out.println("string=" + str);
  }
  
  public static double pi(){
    return 3.14159;
  }





  public static void main(String[] args){
    String str = "hello";
    str = str + "World";

  //Approach 1 conventional
  System.out.println("hihihi");

  //Approach 2 user define function
    print();


    //Approach 1 convention
    int x = 10;
    int y =10;
    int z= x + y;

    //Approach 2 user define function
    int b = sums(5,5);
    System.out.println(b);

    int a = subtr(10,-5);


    double circleArea = 5 * 5 * pi();
    System.out.println("circleArea ="+ circleArea);

    method2("");



  }
}
