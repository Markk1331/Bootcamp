import java.util.Arrays;

public class Array{
  public static void main(String[] args){
    int num0 = 7;
    int num1 = 8;
    int num2 = -5;

//Approach 1    
  //create empty array
    int[] arr = new int[3]; // [3] is the length of the array
    //with index 0,1,2

    arr[0] = num0;
    arr[1] = num1;
    arr[2] = num2;

    char[] arr1 = new char[2];
    arr1[0] = 0;
    arr1[1] = 2;

    long[] arr2 = new long[5];
    arr2[0] = 5;
    arr2[4] = 3;


    for(int i =0; i<arr.length; i++){
      System.out.println("arr["+i+"]=" + arr[i]);
    }
    //arr.length = length of the declared array
    for(int o = arr.length -1; o>=0; o--){
      System.out.println("Reverse order: arr["+o+"]=" + arr[o]);
    }

        //boolean

    boolean[] arr6 = new boolean[2];
    arr6[1] = true;
    for(int k=0; k<arr6.length; k++){
      System.out.println("arr6["+k+"]="+arr6[k]);
    } 

    
//Approach2, create array

    int[] arr5 = new int[] {5,9,12};

    for(int j= 0; j<arr5.length;j++){
      System.out.println("arr5["+j+"]="+arr5[j]);
    }
    arr5[0] = -5;
    int index = 0;
    System.out.println(arr5[index]);



    //string

    String[] strs = new String[] {"Hello","I","Love","Programming"};
    strs[1] = "You";
    for (int k=0; k<strs.length; k++){
      System.out.println("strs["+k+"]="+strs[k]);
    } 

    String[] strs1 = new String[4];
    strs1[0] = "number1";
    strs1[1] = "number2";
    strs1[2] = "number3";

    System.out.println(Arrays.toString(strs1));

    byte[] bytes = new byte[5];
    bytes[3] = -4;
    System.out.println(Arrays.toString(bytes));

    //int[] numers = new int[]
    








  }
}