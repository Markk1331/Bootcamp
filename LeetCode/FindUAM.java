import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindUAM {
  public static void main(String[] args) {
        int[][] logs = new int[][] {{0,5},{1,2},{0,2},{0,5},{1,3}};
        int k = 5;
        int[] arr1 = new int[k];
        int n = logs.length;
       // Set<Integer> UAM = new HashSet<>();
        Map<Integer,HashSet<Integer>> map1= new HashMap<>();
        for(int i=0; i<n;i++){
            int id = logs[i][0]; // the first digits (ID) of every log.
            if(!(map1.containsKey(id))){
              HashSet<Integer> UAM = new HashSet<>();
              UAM.add(logs[i][1]);
              map1.put(id,UAM);
            }else{
                map1.get(id).add(logs[i][1]);
            }
          
            //arr1[map1.size()-1]++;
            for(Map.Entry<Integer,HashSet<Integer>> hashmap1 : map1.entrySet()){
                arr1[hashmap1.getValue().size()-1]++;
            }

            // for(Map.Entry<Integer,HashSet<Integer>> mp : map1.entrySet()) {
            //     arr1[mp.getValue().size()-1]++;
            }
        
          
        System.out.println(arr1);
    }
  }

