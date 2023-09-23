public class RecursionDemo {
  public static void main(String[] args) {
    System.out.println(sum2(11));
    print(10000);
  }

  public static int sum(int k){
    //question 1:
    //k+ (k-1) + (k-2) + .... + 0
    if(k<1)
      return k;
    return k + sum(k-1);

  }
//1,1,2,3,5,8
  public static int sum2(int k){
    if(k<=1)
      return k;
    return sum(k-2) + sum(k-1);
  }

  //Question 3

  //3 2 1 1 2 3, k =3
  public static void print (int k){
    if(k<1)
      return;
    System.out.print(k +" ");
    print(k - 1);
    System.out.print(k+ " ");
  }
}

