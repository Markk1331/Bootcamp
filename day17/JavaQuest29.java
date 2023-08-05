/*Question : Given an integer n,
 add a dollar sign ("$") and a comma (",") as the thousands separator and return it in string format. */
/*Constraints:

0 <= n <= 231 - 1 */
public class JavaQuest29 {
  public static void main(String[] args) {
    System.out.println(separator(85));// $85
    System.out.println(separator(0));// $0
    System.out.println(separator(1000));// $1,000
    System.out.println(separator(123987405));// $123,987,405

  }

  public static String separator(int n) {
    StringBuilder sb1 = new StringBuilder();
    int k =0;
    char[] characters = String.valueOf(n).toCharArray();
    for(int i=characters.length-1; i>=0;i--){
      sb1.append(characters[i]);
      k++;
      if(k>2){
        sb1.append(",");
        k =0;
      }
    }
      sb1.append("$").reverse();

      return  sb1.toString();
  }

}
