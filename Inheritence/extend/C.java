package extend;
public class C extends B {


  public void print(int[] arr){
    System.out.println(arr);
  }
  public static void main(String[] args) {
    C c = new C();
    c.num = 10;
    c.str = "hello";
    c.setNum(100);
    c.setStr("aaaaa");


    c.print(5);
    c.print("def");
    c.print(new int[] {-1,0,2});
  }
}
