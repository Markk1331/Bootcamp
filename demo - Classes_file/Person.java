
public class Person { //file name

  int age;
  char gender; //like column header


//setter
  public void setAge(int age){
    this.age = age;
  }

  public void setGender(char gender){
    this.gender=gender;
  }

//getter
  public int getAge(){
    return this.age;
  }

  public char setGender(){
    return this.gender;
  }


  // Difference between static method and class method
// static = global , cannot input ("this."parameter)
// non-static = inclusive, can choose to input ("this." parameter)

    public static boolean isMale(char gender){   //static
    if(gender == 'F'){
      return false;
    }
    return true;
  }

  public boolean isMale(){   //only avaiable for the object //non-static
    if (this.gender == 'F'){
      return false;
    }
    return true;
  }

  public static void main(String[] args) {
    String s = "ABC";
    Person p = new Person(); // produce emty person object
    Person p2 = new Person();  
    // p and p2 are address

    p.setAge(13);

    //static vs non-static
    isMale('F'); //static (also known as global method)

    p.setGender('M'); //non static (pre-step)
    p.isMale(); //non static (also known as object exclusive method)

    //empty constructor class
    Computer computer = new Computer();
    computer.setColor("Red");
    computer.setWeight(5.0f);
    computer.setRam(5);

    //constructor class 
    Computer computer2 = new Computer("Yellow");
    computer2.getColor(); //yellow
    computer2.setColor("Black");
    computer2.getColor(); //black

    //constructor class#2
    Computer computer3 = new Computer(50, 20, "Grey");


  }
}
