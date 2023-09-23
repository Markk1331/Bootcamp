import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestinationCity {
  public static void main(String[] args) {
    List<List<String>> paths = new ArrayList<>();
    List<String> path1 = new ArrayList<>();
    path1.add("London");
    path1.add("New York");
    List<String> path2 = new ArrayList<>();
    path2.add("New York");
    path2.add("Lima");
    List<String> path3 = new ArrayList<>();
    path3.add("Lima");
    path3.add("Sao Paulo");
    paths.add(path1);
    paths.add(path2);
    paths.add(path3);
    
    HashMap<String,Integer> route = new HashMap<>();

    for(List<String> path: paths){
      route.put(path.get(0),1);
    }

    for(List<String> path: paths){
      //System.out.println(path);
      if(!route.containsKey(path.get(1)))
        System.out.println(path.get(1));
       //break;
    }
    System.out.println("");
  }
}
