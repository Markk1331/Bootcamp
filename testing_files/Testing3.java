public class Testing3 {
  public static void main(String[] args) {

    int x = 11;
    String original = String.valueOf(x);

    int length = original.length();
    String reverse = "";
      for ( int i = length - 1; i >= 0; i-- ){ 
         reverse = reverse + original.charAt(i);  
      }
      if (original.equals(reverse)){
         System.out.println("Entered string/number is a palindrome.");  
      }else {
         System.out.println("Entered string/number isn't a palindrome.");   

      }
    
    System.out.println(original);
   }  

}

