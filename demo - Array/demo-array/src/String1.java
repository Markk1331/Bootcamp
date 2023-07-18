public class String1 {
  public static void main(String[] args){

    String str = "hello";
    System.out.println(str.isEmpty()); //false

    //"" is called empty string
    String str1 = ""; //true 
      System.out.println(str1.isEmpty()); //true
      System.out.println(str1.isBlank()); //true

    String str2 = " "; //false
      System.out.println(str2.isEmpty()); //false
      System.out.println(str2.isBlank()); //true



    // toLowerCase(), toUpperCase() methods
      System.out.println(str.toUpperCase()); //upper case
      String str5 = str.toLowerCase();

    //substring() method
    System.out.println(str.substring(0, 3)); //print the first digit "h"
    System.out.println(str.substring(1)); //print from the labelled parameter to the end index of the string

    if(str.substring(0,3).equals("hel")){
      //condition to check
    }


    //contains() method
    String s = "lo";
    System.out.println(str.contains(s)); //true






      



  }
}
