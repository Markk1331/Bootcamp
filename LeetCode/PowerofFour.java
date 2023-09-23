public class PowerofFour {
  public static void main(String[] args) {
    int n = 10;

    while(n%4==0){
      n /= 4;
    }
    if(n==1){
      System.out.println("yes");
    }else{
      System.out.println("no");
    }
  }
}
