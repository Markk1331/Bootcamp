public class Student extends Adult{

  //must implement abstract method

  public Student(){
    super();
  }

  public void sleep(){
    System.out.println("I am student, sleeping");
  }

  public void read(){
    System.out.println("I am a student, reading");
  } 


  public static void main(String[] args) {
    Student student = new Student();
    student.sleep();
    student.read();
    student.run();
    student.eat();
    student.getAge();
    System.out.println();
  }

 
}
