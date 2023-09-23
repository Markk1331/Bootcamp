package DemoHashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapdemo {
  public static void main(String[] args) {
    
  
  HashMap<String, String> map = new HashMap<>();
  //<string, string> --> <key, value>
  map.put("abc", "hello world"); //entry
  map.put("bcd", "I am Developer"); //entry
  System.out.println(map.size());

  //Map.entry --> Key+ value

  map.put("abc", "hello world");  //Override the entry with key 
  System.out.println(map.get("abc"));
  System.out.println(map.size());

  System.out.println(map.isEmpty());
  System.out.println(map.toString());
  System.out.println(map.remove("abc")); //hello world
  System.out.println(map.remove("bcd", "i am a developer"));


  if(!map.containsKey("abc"))
    return;


    for(Map.Entry<String, String> entry: map.entrySet()){
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }
      //loop keys
    for(String key: map.keySet()){
      System.out.println(key);
    }
    //loop values
    for(String value : map.values()){
      System.out.println(value);
    }
  }
}
