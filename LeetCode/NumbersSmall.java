import java.util.Arrays;

public class NumbersSmall {
  public static void main(String[] args) {
    int [] nums = new int[]{8,1,2,2,3};

    int[] newnums = new int[nums.length];
    int k =0;
    int count = 0;
    for(int i=0; i<nums.length; i++){
        while(k<nums.length){
        if(nums[i]>nums[k])
            count++;
        k++;
        }
        k= 0;
        newnums[i] = count;
        count = 0;
    } 
    System.out.println(Arrays.toString(newnums)); 
}
}
