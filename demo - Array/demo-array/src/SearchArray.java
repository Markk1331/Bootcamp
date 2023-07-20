import java.util.Arrays;

public class SearchArray {
  public static void main(String[] args){
    
    char target ='m';

    char[] chars = new char[] {'5','w','m','m','p','a'};

    for(int x=0; x<chars.length; x++){

      if(chars[x]==target){
        System.out.println(x);
      }
    }



//toCharArray()

    String str3 = "I am a boy";
    char[] chars1 =  str3.toCharArray();
    System.out.println(Arrays.toString(chars1));
    //Arrays.toString() = for loop short form

    //toCharArray() = very userful operation to change from string to array

    int[] arr11 = new int[] {100,5,20,-5,201};

    //find max value in arr1
    int max = arr11[0];
    for(int x=0; x< arr11.length;x++){
      if(arr11[x] > max){
        arr11[x] = max;
      }
  }
   System.out.println(max);

  int min = arr11[0];
  for(int x=0; x<arr11.length;x++){
    if(arr11[x]<min){
      min = arr11[x];
    }
  }
  System.out.println(min);
}
}