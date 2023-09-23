import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {
  public static void main(String[] args) {
    Integer[] integers = new Integer[] {1,2,3,4};
    integers = new Integer[] {1,4};

    ArrayList<Integer> numbers;
    numbers = new ArrayList<>();
     numbers.add(1); //add elements into arraylist
     numbers.add(2);
     numbers.add(3);
     numbers.add(null);

     //Array List --> Array
     Integer[] arr2 = new Integer[numbers.size()];
     //Define output array type for toArray() perform conversion
     arr2 = numbers.toArray(arr2);
     System.out.println(Arrays.toString(arr2)); //[1,3,2,4]

     //ArrayList<int> // cannot support primitive 


     //accessing elemetns in ArrayList
     for(int i =0; i<numbers.size();i++){
      System.out.println(numbers.get(i));
     }

     //change element
     numbers.set(1,100);
     int original = numbers.set(1,200); //unbox

     numbers.clear(); // remove all elements

     ArrayList numbers3 = new ArrayList<>();
     numbers3.add(1000);
     numbers3.add(2000);
     numbers3.addAll(numbers); //add all elemenets to another
     System.out.println(numbers3.size());


     numbers3.remove(1); //remove an idex and its values
     numbers3.removeAll(numbers);

     System.out.println(numbers.contains(100));



     ArrayList<String> strs = new ArrayList<>();
     strs.add("abc");
     strs.add("ABC");
     strs.add("1234");
     strs.add("12345");
     strs.add("1234ABC");
     System.out.println(strs.subList(1,2));

     strs.remove("1234");
     strs.remove(1);

     Iterator<String> iterator = strs.iterator();  //another way of looping an array list
     while(iterator.hasNext()){
      System.out.println(iterator.next());
     }
     
     Object[] objects = strs.toArray();
     for (Object o: objects){
      if(o instanceof String){
        String str = (String) o;
        System.out.println(str);
      }
     }


      //Array --> ArrayList

      String[] Strings = new String[] {"Hello", "world"};

      List<String> s2 = new ArrayList<>();
      
      List<String> StringList = Arrays.asList(Strings); //read only
      List<String> stringList2 = new ArrayList<>(Arrays.asList(Strings)); //read-and-write
      stringList2.add("ijk");
    }
}
