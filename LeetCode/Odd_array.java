public class Odd_array {
  public static void main(String[] args) {
    int[] arr = new int[] {1,4,2,5,3,9,15};
    int arrL = arr.length;
    int oddL = 1;
    int sum = 0;

    while(oddL<=arrL){
      sum += oddLenSubArr(oddL,arr);
      oddL += 2;
      System.out.println(sum);
    }
    System.out.println("totoal sum: " + sum);
  }

  public static int oddLenSubArr(int lengths, int[] arr){
    int j =0;
    int total = 0;
    for(int i=0; i+lengths<=arr.length;i++){
      j=i;
      while(j<lengths+i){
        total += arr[j];
        j++;
      }
    }

    return total;

  }
}
