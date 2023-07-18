
public class Loops {
  public static void main(String[] args){
    //for loop

    //for(int i=0; i<4 ; ++i){
      //System.out.println("Hello");
    

    int ssum = 0;
    for(int i=10; i>0 ; i = i -2){
      ssum = i+1;
      //System.out.println(ssum);

    }

    int max = 10;
    int total = 0;
    for(int i=0;i<10;++i){
      total +=1;
    }

    //System.out.println(total);

    int sum = 0;
    int sum_without_five = 0;

    for(int i =0; i<10; i++){
      if(i%2!=0){
        sum += i;
      }
      if(i%2==1 && i!=5){
        sum_without_five +=i;
      }
    }
    System.out.println("sum =" + sum);
    System.out.println("sum without 5 =" + sum_without_five);
    

    for (int i =0; i<5; i++){
      System.out.println("hello");
      if (i>2){
        break;
      }
    }

    //continue

    for(int i=0; i<6; ++i){
      System.out.println("Hello");
      if(i>3){
        continue;

      }
    }
    System.out.println("Bye");
    // i = 0, hello, bye
    // i = 1, hello, bye
    // i = 2, hello, bye
    // i = 3, hello, bye
    // i = 4, hello
    // i = 5, hello
    // i = 6, exit


    for(int i=0; i<4; ++i){
      for (int j=0;j<3; ++j){
        System.out.println("Hello");
      }
    }
    //i=0: j=0, j=1, j=2,


    //* 
    
    //*
    //**
    //***
    //****
    //*****
    
/* 
   for (int i=0; i<=4; i++){
      for(int j=1; j< 5-i; j++)
        System.out.print("*");
      System.out.println("*");

   }
   */
/* 
   for (int i=0; i<=4; i++){

      for(int j=1; j<1+i; j++) 
        System.out.print("*");
//run this loop first

      System.out.println("*");
//then run this as second loop
   }  
   //i=0: no j loop
   //i=1: print 1j 
   //i=2: print 2j
   //i=3: print 3j
   //i=4: print 4j

*/
/* 
   for(int i=0; i<=2;i++){
    System.out.println("*");
    for(int j=3; j>1; j--){
      System.out.println("*");

   }
*/
/* 
System.out.println("*");
System.out.println("**");
System.out.println("***");
System.out.println("****");
System.out.println("*****");
*/

/* 
String b = "";

//for(int p=0; p<4;p++){
  for(int v=0; v<=4;v++){
    if(v==0){
      b = " ";
    }else if(v==1){
      b ="*";
    }else if(v==2){
      b="**";
    }else if(v==3){
      b="***";
    }else if(v==4){
      b="****";
    }
    System.out.println("*" + b);
    
*/
/* 
    for(int q = 0; q<=4; q++){
      System.out.println("*");
      if(q==4){
        break;
      }else{
      for(int p = 0; p<=q; p++){
         System.out.print("*");
      }
      }
    }
    */
    //q=0 print 1q : no p
    //q=1 print 1q : print 1p
    //q=2 print 1q : print 2p
    //q=3 print 1q : print 3p
   //q=4  print 1q : print 4p
   /* 
    for(int a=1;a<5; a++){
      System.out.println("1");
      for(int b=0;b<a; b++){
        System.out.print("2");
      }
    }
    System.out.print("2");
*/

    //a=0 print 1a : no b
    //a=1 print 1a : print 1b
    //a=2 print 1a : print 2b
    //a=3 print 1a : print 3b
    //a=4 print 1a : print 4b
    //a=5 print exit: print 5b

    String str = "";
    for(int i=0; i<5; i++){
      
      str += "*";
      System.out.println(str);
    }
    /* 

    //str = "";
    for (int i=0; i<5; i++){
      str ="";
      for(int j=0; j<i+1; j++){
        str +="*";
      }
      System.out.println(str);
    }

*/

    for(int x=0; x<5; x++){
      
      for(int u=0; u<=x-1; u++){
        System.out.print("*");
      }
    System.out.println("*");
      

    }









    }
  }

