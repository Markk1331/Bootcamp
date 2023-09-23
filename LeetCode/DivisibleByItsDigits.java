public class DivisibleByItsDigits {
public static void main(String[] args) {
  System.out.println(countDigits(1248));
  //System.out.println(1248%5);

}
     public static int countDigits(int num) {
        String n = String.valueOf(num);
        int count = 0;

        for(int i =0; i<n.length(); i++){
           
            if(num % (n.charAt(i)-'0')==0)
                count ++;
        }
        return count;
    }
}
