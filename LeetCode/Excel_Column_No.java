public class Excel_Column_No {
  public static void main(String[] args) {
    String columnTitle = ",.";

    int n = columnTitle.length();
    int sum = 0;
    
    for(int i=0; i<n; i++){
      if(columnTitle.charAt(i) < 65 || columnTitle.charAt(i) > 90  ){
        System.out.println("wrong");
       }
      sum = sum*26+columnTitle.charAt(i) - 'A' +1;
      

    }
    System.out.println(sum);



    //"A" = 1
    //"Z" = 26
    //"AB" = 28
    //"ZY" = ZY
  }
}
