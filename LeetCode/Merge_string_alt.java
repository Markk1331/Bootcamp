import java.util.Arrays;

public class Merge_string_alt {
  public static void main(String[] args) {
    String str1 = "ab";
    String str2 = "qrst";
    String result = "";

    char[] Str1 = str1.toCharArray();
    char[] Str2 = str2.toCharArray();

    int q =0; //determine length
    if(Str1.length > Str2.length){
      q = str1.length();
    }else{
      q = str2.length();
    }

        for (int i = 0; i < q; i++) {
            if (i < Str1.length) {
                result += Str1[i];
            }
            if (i < Str2.length) {
                result += Str2[i];
            }
  }
  
System.out.println(result);
  }

}