public class IntegerToRoman {
  public static void main(String[] args) {
    int num = 85;
    int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    StringBuilder sb = new StringBuilder();
    int index =0;

            while(num>0){

                if(num >= values[index]){
                    num -= values[index];
                    sb.append(strs[index]);

                }else{
              index++;
            }
          }




       System.out.println(sb.toString());
}
}

