package DemoHashSet;

import java.util.HashSet;

public class DemoHashSet {

  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();  //hashset is good at handling duplicates
    strings.add("abc");
    strings.add("def");
    System.out.println(strings.size());
    boolean result = strings.add("abc");
    System.out.println(result);

    if(strings.add("def")){
      System.out.println("added");
    }else{
      System.out.println("not added");
    }




    HashSet<Coordinates> coordinatess = new HashSet<>();
    Coordinates c1 = new Coordinates(1,1);
    Coordinates c2 = new Coordinates(1,1);

    coordinatess.add(c1);
    coordinatess.add(c2);
    System.out.println(coordinatess.size()); //this example explains why it is 1 or 2,
    // because override hashset / toString default both c1 and c2 are the same object
    //Else, they are not equal, they will not be the same, thus, counting as 2 size().
    
  }


  
}
