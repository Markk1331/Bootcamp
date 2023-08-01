import java.util.Arrays;

public class First_letter_twice {
    public static void main(String[] args) {
        
    //print out the second first that gets the duplicate
  String s  = "abbccdds";
        int[] chs = new int[26]; 
        StringBuilder sb = new StringBuilder();

        char ch = ' '; // '\u0000'
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            //System.out.println(ch);
            if (++chs[ch - 'a'] == 2){   //++chs[ch - 'a'] ---> add the variable first then assign
            //chs[ch - 'a']++ ----> only add the variable 
                System.out.println(ch);; // break method
                sb.append(ch);
               
            }
        

        }
         System.out.println(Arrays.toString(chs));
        // System.out.println(sb.toString());
        // System.out.println(sb.charAt(1));
    }
}