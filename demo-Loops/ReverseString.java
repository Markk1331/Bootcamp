public class ReverseString {
  public static void main(String[] args){
    String str = "hello";
    //output: olleh
    String reverse = "";

    for(int i=str.length()-1; i>=0; i--){
      //for(int k=0; k)
      reverse += str.charAt(i);
    }
      System.out.println(reverse);

    System.out.println(str.length());
    
  }
}
