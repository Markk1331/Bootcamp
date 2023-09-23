import java.util.Stack;

public class Stackdemo {
  public static void main(String[] args) {
    //first in last out

    Stack<String> stack = new Stack<>();
    stack.push("abc");
    stack.push("def");
    System.out.println(stack.pop()); //def
    stack.push("def");
    stack.push("xyz");
    while(!stack.isEmpty()){
      System.out.println(stack.pop()); // xyz,def,abc
    }

      stack.add("fgi");
      stack.add("ijk");
  }
}
