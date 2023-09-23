public class Balll {
 Colors color;

 public Balll(int i, Colorr blue){
  this. color = i;
 }

 public Colors getColar(){
  return this.color;
 }

 @Override
 public boolean equals(Object o){
  if (this ==o){
    return true;
  }
  if(!(o instanceof Balll))
    return false;

  Balll ball = (Balll) o;
  return this.color == ball.color;
 }

  public static void main(String[] args) {
    Balll ball = new Balll(Colors.RED);
    System.out.println(ball.getColar().name());
    System.out.println(ball.getColar().name() + ": " + ball.getColar().getHexCode());



    //object is topmost parent
    Object object = new Balll(Colors.RED);
//compile-time class "Object" type check

if(Colors.BLUE instanceof Colors){
  System.out.println("istance");
}

if(Colors.BLUE.getClass() == Colors.class){
  System.out.println("instance of color");
}

//System.out.println(((Balll) object).getColar());

Colors color = ((Balll) object).getColar();

//Color extends Enum.class, extends Object
Class<?> clas = color.getClass();


System.out.println(clas.getName());

Object o = 1- 'a';
System.out.println(o.getClass().getName()); //integer

Object o2 = 'b';
System.out.println(o2.getClass().getName()); //character
Object o3 = new Balll(Colors.GREEN);
System.out.println(o3.getClass().isEnum());
System.out.println(clas.isEnum());
  }
}
