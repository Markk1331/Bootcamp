
public class Selection_Sorting {
  public static void main(String[] args){
    //[5,1,4,8,2]
    //step 1.1: [1, 5, 4, 8, 2] --> insert 1 to arr[0], 1 <5)
    //After round 1, [1. 5] is sorted
    //step 2.1: compare 4<5
    //step 2.2: compare 1<4 --> [1, 4, 5]
    //After round 2, [1, 4, 5] is sorted

    //step 3: compre  8>2
    //step 3.1 compare 5>2
    //step 3.2 compare 4>2
    //step 3.3 compare 2>1

    //step 3.4 sorted

    int[] nums = new int[] {5,1,4,8,2};
      
      for (int x =0; x< nums.length; x++){
        int min = x;
        for(int y = x+1; y<nums.length; y++){
          if(nums[min] > nums[y]){
            min = y;
             }

        }
        int temp = nums[x];
        nums[x] = nums[min];
        nums[min] = temp;


        }
            
          }
        }
    



  
  

