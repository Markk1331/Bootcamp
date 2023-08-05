public class Testing12 {
  public static void main(String[] args) {
    int[] arr = new int[] {1,1,1,1,1};
    int n = arr.length;
    int result = 0;

    for(int i=0;i<n;i++){
      for(int k =i; k<n; k++){
        if((k-i+1) %2 ==0){
          continue;
        }
        for(int j=i; j<=k;j++ ){
          result += arr[j];
        }
      } 
    }
    System.out.println(result);
  }
}
// 1+1+2+2+1
// 4
// 5
// 5
