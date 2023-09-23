import java.util.Arrays;

public class WellSpacedString {
  public static void main(String[] args) {
    String s = "abaccb";
    int[] distance = new int []{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
  
    int[] arr1 = new int[26];
    Arrays.fill(arr1,-1);
    int[] arr2 = new int[26];
    Arrays.fill(arr2,-1);

    for(int i =0; i<s.length();i++){ //arr1: (0,1,3,-1,-1...) arr2: (2,5,4,-1-1-1)
      if(arr1[s.charAt(i)-'a']!=-1){  //collection 1 for the first occurence index
        arr2[s.charAt(i)-'a'] = i; // collection 2 for the second occurence index
        
     } else {
        arr1[s.charAt(i) - 'a']=i;
     }

     //++collection[p];
    }
    System.out.println("arr1 " + Arrays.toString(arr1));
        System.out.println("arr2 " + Arrays.toString( arr2));
    for(int j=0; j<26;j++){
      if(arr1[j]!=-1 && arr1[j]-arr2[j]-1!=distance[j])  // -1 is for getting the number of index standing in between
        System.out.println(false);
        return;
  }
    // System.out.println(Arrays.toString(collection));
    System.out.println(true);
  }
}
