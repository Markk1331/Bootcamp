public class ExcelNum_to_column {
  public static void main(String[] args) {
    int columnNumber = 676;

    int n = 0;
    int divide_times = columnNumber;
    int second_num = columnNumber;

    if(columnNumber<=26){
       int first_i = columnNumber + 65;
    }else{


    while(divide_times > 26){
    divide_times -=  26;
    n++;
    }

 
    columnNumber = (columnNumber/26);
  
}
   int first_i = columnNumber + 65-1 ;
   int second_i = second_num -26*n + 65-1;
    
   // int test = 24 + 65;
    char c1 =  (char)first_i;
    char c2 = (char) second_i;
   //char c2 = (char) index_

    System.out.println(c1);
    System.out.println(c2);





  }
}
