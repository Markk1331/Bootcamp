public class ProductSequence {
  public static void main(String[] args){

    //first way
    int list = 0;
    int count = 0;
    for(int i =0; i<100; i++){
      list = i*(i+1);
      count += 1;
      System.out.println(list);
      if(count>=20){
        break;
      }
    }
   
  //second way
int counted = 20;
for(int i=0; i<counted; i++){
  int a = i;
  int b = i+1;
  int c = a * b;

  System.out.println(c);
  
}





  }

  //0,1,2,3,4,5.....
  //print: 0,(1*2)2,(2*3)6,(3*4)12,20
  //print the first 20 numbers
}
