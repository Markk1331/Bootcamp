/*

Question : Given an integer number n, 
return the difference between the product of its digits and the sum of its digits.
 
Constraints :
1 <= n <= 10^5

Example :

Input: n = 4568
Output: 937
Explanation: 
Product of digits = 4 * 5 * 6 * 8 = 960 
Sum of digits = 4 + 5 + 6 + 8 = 23
Result = 960 - 23 = 937
*/

public class JavaQuest22 {
  public static void main(String[] args) {
    System.out.println(findDifferent(1)); // output : 0
    System.out.println(findDifferent(100000));// output : -1
    System.out.println(findDifferent(234)); // output : 15
    System.out.println(findDifferent(4568));// output : 937
    System.out.println(findDifferent(9999));// output : 6525
   System.out.println(findDifferent(11111));// output : -4


//     int product = 1;
//     int sum = 0;
//     char [] numbers = new char[]{9,9,9,9,9};
//     for(char c: numbers){
//       product *= Integer.valueOf(c);
//       sum += Integer.valueOf(c);
//       System.out.println(Integer.valueOf(c));
//     }
// System.out.println(sum);
// System.out.println(product-sum);

  }

  public static int findDifferent(int n) {
    int product = 1;
    int sum = 0;
    String s = Integer.toString(n);
    char[] numbers = s.toCharArray();
    for(int i=0; i<numbers.length; i++){
      int digit = Integer.valueOf(numbers[i]) - '0'; //char value to int default changes to ASCII code
      //therefore, must - '0'
      product *= digit;
      sum += digit;
    }
    int total = product - sum;
    return total;
  }
}