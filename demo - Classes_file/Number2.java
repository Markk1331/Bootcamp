
public class Number2 {
  int number1;
  int number2;
  

public void setNumber1(int number1){
  this.number1 = number1;
}

public void setNumber2(int number2){
  this.number2 = number2;
}
public static int add(int n1, int n2){
  return n1 + n2;
}

public void print(){
  System.out.println(this.number1 + this.number2);
}

public int divide(){
  this.print();
  System.out.println(Number2.add(this.number1, this.number2));
  return this.number2 / this.number1;
}




public static void main(String[] args) {
  
  Number2 num = new Number2();

  num.setNumber1(13);
  num.setNumber2(26);

  Number2 num2 = new Number2();
  num2.setNumber1(10);
  num2.setNumber2(100);


System.out.println(num.divide());


}
}
