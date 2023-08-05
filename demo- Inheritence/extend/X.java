package extend;
public class X extends Y{
  private String name;

  public String getName(){
    return this.name;
}

public X(){

}

public X(String name){
  super("John"); //assigning John as the inheritance name
  this.name = name;
}

public String getParentName(){
  return super.getName();
}

public static void main(String[] args) {
  X x = new X("Peter");
  System.out.println(x.getParentName());
  System.out.println(x.getName());

  Y y = new X();
  y.staticMethod();

  //hiding methods
  X.staticMethod();
  Y.staticMethod();
  System.out.println(y.getName());
}
}
