import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UAM {
  public static void main(String[] args) {
      int[][] logs = new int[][] {{0,5},{1,2},{0,2},{0,5},{1,3},{3,2},{7,9}};
      int k = 5;

       int[] arr1 = new int[k];
        int n = logs.length;
       // Set<Integer> UAM = new HashSet<>();
        Map<Integer,HashSet<Integer>> map1= new HashMap<>();
        for(int i=0; i<n;i++){
            int id = logs[i][0]; // the first digits (ID) of every log.
            if(!(map1.containsKey(id))){
              HashSet<Integer> UAM = new HashSet<>(); //new a hashset to store the value
              UAM.add(logs[i][1]);
              map1.put(id,UAM); //inset set inside the map
            }else{
                map1.get(id).add(logs[i][1]); //--> adding the value to the new hashset by map id
                System.out.println(map1);

                
            }

            }
          for(Map.Entry<Integer,HashSet<Integer>> hashmap1 : map1.entrySet()){
                arr1[hashmap1.getValue().size()-1]++;
            }
          
        System.out.println(Arrays.toString(arr1));
    }
}

