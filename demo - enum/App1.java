public class App1 {


    public static void main(String[] args) {
          //enum
    //finite number of member

      System.out.println(Directions.East.name());
      System.out.println(Directions.East.name());
  
      Directions east = Directions.East;
  
      System.out.println((east == Directions.North));
      // ==, != are checking object reference
  
      //values() --> loop
      for(Directions element: Directions.values()){
        System.out.println(element.name());
      }
  
      System.out.println(Directions.South.ordinal());
    
        System.out.println(east.getDegree());
        System.out.println(east.getDirection());
  }
}
