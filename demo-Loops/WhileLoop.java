public class WhileLoop {
  public static void main(String[] args){
    //while
    int count = 0;
    while(count < 5) {  // continue condition: true or false
      count ++;
      //count = 5
    }
     System.out.println(count);

    //using boolean and if
     boolean isHoliday = false;
     int counter = 0;
     while(!isHoliday){
      counter ++;
      System.out.println(counter);
      if (counter >= 6){
        isHoliday = true;
      }
     }

     //while in operator
        int c =0;
        while (c>=0 && c <5){
        c++;
        System.out.println("value of C " + c);
        
      }

      //while in operator
      int a =0;
      int b = 10;
      while (a <5 || b>0){
        System.out.println("hello");
        a++;
        b--;
      }

      //break, continue
      int k = 0;
      while (k<6){
        System.out.println("Break:Hello");
        k++;
        if (k>3) {  //same as if(++k>3){ }
          break;
        }
      }

      //break, continue    
      int j = 0;
      while (j<6){
        j++;
        if (j>3){
          continue;
        }
        System.out.println("Continue: hello");

        //j = 0 --> j++ ---> j = 1 ---> print
        //j = 1 --> j++ ---> j = 2 ----> print
        //j = 2 --> j++ ---> j = 3 ----> print
        //j = 3 --> j++ ---> j = 4 ----> exit
        // so print 3 times


      } 
      


  }
}
