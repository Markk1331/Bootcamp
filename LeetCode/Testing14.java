import java.util.Arrays;
import java.util.LinkedList;

public class Testing14 {
  public static void main(String[] args) {

  int [][] people = new int [][] {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
	Arrays.sort(people, (arr1,arr2)->{
		int cmp=arr2[0]-arr1[0];
		if(cmp==0) 
      return arr1[1]-arr2[1];
		return cmp;
	});

	LinkedList<int[]> list=new LinkedList<>();
	for(int[] arr:people){
		list.add(arr[1], arr);
    System.out.println(list);
	}
	//System.out.println(list.toArray(new int[people.length][]));
}

  
}
