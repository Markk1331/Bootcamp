public class Conditional {
  public static void main(String[] args){
    //if, else if, else
    int i = 10;


    if (i > 9){
      System.out.println(i);
    } else{
      System.out.println("woohoo");
    }

    if(i <0){
      System.out.println("woohoo");
    }else if(i>0){
      System.out.println("greater than 0");
    }else{
      System.out.println("i am 0");
    }

    int a = 5;
    int b = 10;
    int c = 0;

    if(a>b){
      c = -1;
    }else if (a<b){
      c = 1;
    }else{
      c = 0;
    }
    System.out.println(c);

    int x=1;

    if (x %2 ==1){
      //it is odd
    }else if (x%2==0){
      // it is even
    }


    String str1 = "Monday";

    if(str1.equals("Mondayy")){
      System.out.println("Inccorrect");
    }else{
      System.out.println("correct");
    }

    String str2 ="Tuesday";

    if(str2.charAt(0)== 'u'){
      System.out.println("correct");
    }else{
      System.out.println("Incorrect");
    }

    String str3 ="Wednesday";
    if(str3.length()>5){
      System.out.println("correct");
    }else{
      System.out.println("incorrect");
    }

    int score = 80;
    char grade = ' ';
    if(score>90){
      grade = 'A';
    } else if(score>80){
      grade ='B';
    }else if(score>70){
      grade ='C';
    }else if(score>60){
      grade ='D';
    }else{
      grade ='F';
    }

    int age = 65;
    boolean isElderly = age >= 65;
    //boolean isElderly = true;

    if(isElderly){
      System.out.println("Elderly I am.");
    }else{
      System.out.println("A young guy");
    }

    //switch
    int dayOfWeek = 3;
    String dayName = " ";
    switch(dayOfWeek){
      case 1:
        dayName = "Monday";
        break;
      case 2:
        dayName = "Tue";
        break;
      case 3:
        dayName = "Wed";
        break;
      case 4:
        dayName = "Thu";
        break;
      case 5:
        dayName = "Fri";
        break;
      case 6:
        dayName = "Sat";
        break;
      case 7:
        dayName = "Sun";
        break;       
    }

      System.out.println(dayName);


      int card_num = 14;
      String card_name = " ";

      switch(card_num){
        case 1:
          card_name = "Ace";
          break;
        case 2:
          card_name = "Two";
          break;
        case 3:
          card_name = "Three";
          break;
        case 4:
          card_name = "Four";
          break;
        case 5:
          card_name = "Five";
          break;
        case 6:
          card_name = "Six";
          break;
        case 7:
          card_name = "Seven";
          break;
        case 8:
          card_name = "Eight";
          break;
        case 9:
          card_name = "Nine";
          break;
        case 10:
          card_name = "Ten";
          break;
        case 11:
          card_name = "Jack";
          break;
        case 12:
          card_name = "Queen";
          break;
        case 13:
          card_name = "King";
          break;
        default:
          card_name = "no card";
      }
        System.out.println(card_name);
      




      



  }
  
}
