/**
 * 
 * When target = 'c', the expected output:
 * We found 3 character c in the String.
 * 
 * When target = 'z', the expected output:
 * Not Found.
 */
// Count the target of character in a String.
public class JavaQuest5 {
  public static void main(String[] args) {
    String str = "Welcome to the coding bootcamp."; // You should not change this line
    char target = 'z'; // Update this target to test the logic
    boolean found = false;
    int count = 0;

    for(int i =0; i<str.length(); i++){
      if (str.charAt(i) == target){
        found = true;
        count +=1;
      }
    }
    if(found==true && count>0){
      System.out.println("We found 3 character c in the String.");
    }else{
      System.out.println("Not Found.");
    }
    
    // Use a loop to count the target of character in a String.
    // code here

    // if found, print "We found 3 character c in the String."
    // if not found, print "Not Found."
    // code here
    
  }
}
