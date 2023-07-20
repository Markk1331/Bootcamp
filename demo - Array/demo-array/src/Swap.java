public class Swap {
  public static void main(String[] args){
    int[] arr = new int[] {100, -400 ,3, 99};
    //create a new array ?
    //append the number? 
    //remove the numbers out of the exisiting arr?
    int value = 0;

    value = arr[0];
    arr[0] = arr[3];
    arr[3] = value;

    int temp = arr[0];
    arr[0] = arr[arr.length-1];
    arr[arr.length -1] = temp;



    for(int i=0; i<arr.length; i++){
      System.out.println(arr[i]);
    }


  }
}
