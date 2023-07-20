public class String2 {

  public static void main(String[] args){
    String str = "hello   ";
    String str2 ="    hel    lo    ";

    //trim (spaces)
    System.out.println("str.trim()=" + str2.trim());


    //startsWith(), check if string starts with the selected
    if (str.startsWith("hel")){
      System.out.println("character starts with hel");
    }

    //endsWith(), check if string ends with the selected
    boolean endswith = str.endsWith(" ");
    if(endswith){
      System.out.println("there is a space.");
    }

    //indexOf --> starting index of "indicated " <--- very useful
    System.out.println(str.indexOf('o')); //4
    System.out.println(str.indexOf("ll")); //2
    System.out.println("lll"); //-1  <--- cannot find
    System.out.println(str.indexOf('o', 5)); //-1 cannot find 'o' starting at index 5
    System.out.println(str.indexOf("ll", 2));
    //charAt and indexOf are a pair !!!!!!!!!!
    //indexOf --> find index, which character is known
    //charAt --> find character, which index position is unknown

  
    //lastIndexOf
    System.out.println(str.lastIndexOf('l')); // last index of string = 3
    System.out.println(str.lastIndexOf("ll")); // 2
    System.out.println(str.lastIndexOf('l',100)); //3
    System.out.println(str.lastIndexOf('l', 0)); //-1


    //replace
    String S = "Java is a programming language";
    S = S.replace("Java", "Python"); //replaced 1st parameter to 2nd parameter 


    //equals(), equalsIgnoreCase()
    String str5 = "Hello";
    if("hello".equals(str5)){
      System.out.println("yes");
    }else{
      System.out.println("no");
    }
    System.out.println(str5.equalsIgnoreCase("hello"));
    if("HELLO".equals(str5.toUpperCase())){ 
      System.out.println("It is equal to the uppcase case");
    }


    //concat(String), append something
    String newString = str5.concat(" Mui Mui");
    System.out.println("new one= "+ newString);


    //compareTo
    String apple = "apple";
    String facebook = "facebook";
    System.out.println(apple.compareTo(facebook)); //-5  <--- based on ASCII order 97 to 102, so 97 - 102 = -5







  }
}
