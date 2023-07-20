public class Swap2_1 {
  public static double average(int[] arr){
    //calculate the average of numbers in arr
    double sum = 0d;
    for(int x=0; x<arr.length;x++){
    sum += arr[x];
    }
    //return (double) sum / arr.length;
    double average = sum /arr.length;
    return average;
  }

  public static void main(String[] args){
    int[] arr = new int[]{1,2,3,4,5,6};

    System.out.println(average(arr));
  }
}
