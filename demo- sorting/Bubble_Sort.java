import java.util.Arrays;

public class Bubble_Sort {
  public static void main(String[] args){
    //[5,1,4,2,8]
    //step1.1: [1,5,4,2,8]
    //step1.2: [1,4,5,8,2]
    //step1.3: [1,4,5,8,2] //no change due to 5<8
    //step1.4: [1,4,5,2,8]

    //step2.1: [1,4,5,2,8] //no change due to 1<4
    //step2.2: [1,4,5,2,8] //no change due to 4 < 5
    //step2.3: [1,2,4,5,8] 

    //target: [1,2,4,5,8]
    int[] arr = new int[] {5,1,4,2,8};
    int n = arr.length;  
    int temp = 0;  
     for(int i=0; i < n; i++){  
             for(int j=1; j < (n-i); j++){  
                      if(arr[j-1] > arr[j]){  
                             //swap elements  
                             temp = arr[j-1];  
                             arr[j-1] = arr[j];  
                             arr[j] = temp;  
                     }  
                      
             }  
     }  

     System.out.println(Arrays.toString(arr));

}  
}
