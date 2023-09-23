import java.util.Arrays;

public class AddBinary {
  public static void main(String[] args) {
    String a = "1010000010010011011110101010101010111111110100000001000000000";
    String b = "1101010011011110011";
    long i = Long.parseLong(a, 2);
    long j = Long.parseLong(b, 2);

    if(i==0 &&j ==0){
      System.err.println("its 0");
    }


    long temp = 0;
    long binary1 = i;
    long binary2 = j;
    long decimal1 = 0;
    long decimal2 = 0;
    long n = 0;
    
//change binary to decimal
while(binary1 != 0){
  temp = binary1 %10;
  decimal1 += temp*Math.pow(2,n);
  binary1 /= 10;
  n++;
}

n = 0;
temp = 0;

while(binary2 != 0){
  temp = binary2 %10;
  decimal2 += temp*Math.pow(2,n);
  binary2 /= 10;
  n++;
}

  //decmial addition
long decimal_temp = decimal1 + decimal2;
//System.out.prlongln(decimal_temp);

//change decimal to binary

StringBuilder sb = new StringBuilder();


while(decimal_temp >0){
  sb.insert(0, decimal_temp%2);
  decimal_temp /= 2;

}



//System.out.prlongln(Arrays.toString(binarys));
System.out.println(sb.toString());
  }
}
