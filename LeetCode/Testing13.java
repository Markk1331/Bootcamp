import java.util.Arrays;

public class Testing13 {
    public static void main(String[] args) {
        
    //print out the second first that gets the duplicate
  String s  = "abbccdds";
        int[] chs = new int[26]; 
        StringBuilder sb = new StringBuilder();

        char ch = ' '; // '\u0000'
        for (int i = 0; i < s.length(); i++) {
            //chs[i]=s.charAt(i)-'a';
               ch = s.charAt(i);
               if(chs[ch-'a']++==2){
                System.out.println(ch);
               }
            }
        

        
         System.out.println(Arrays.toString(chs));
        // System.out.println(sb.toString());
        // System.out.println(sb.charAt(1));
  }
}
