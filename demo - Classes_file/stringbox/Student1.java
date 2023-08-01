package stringbox;
public class Student1 {
  String firstName;
  String LastName;
  int age;



public int getterAge(){
  return this.age;
}

public void setterAge(int age){
this. age = age;
}

public boolean isAdult(){
  return this.age >= 18; // larger or equal to 18 or less than 18 for True-or-False
}

}