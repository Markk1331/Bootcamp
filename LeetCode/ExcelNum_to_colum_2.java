import java.util.Arrays;

public class ExcelNum_to_colum_2 {
  public static void main(String[] args) {
    
    StringBuilder sb = new StringBuilder();
    int s = 291235 ;


    
    while(s>0){
      int r = s%26;
      if(r==0){
        sb.append('Z');
        s = (s-26)/26;
      }else{
        sb.append((char) (r+64));
        s = (s-r)/26;
      }

    }
    //System.out.println(c);
    System.out.println(sb.reverse().toString());;
  }
}
