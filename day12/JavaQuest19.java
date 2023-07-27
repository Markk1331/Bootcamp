/**
 * Expected Output:
 * Car Year=2020, Car Model=ModelY
 */
public class JavaQuest19 {
  // Declare instance variables carYear and carModel
  int carYear;
  String carModel;
  // Constructor with variables carYear and carModel
  public JavaQuest19(){

  }

  public JavaQuest19(int year, String model){
    this.carModel = model;
    this.carYear = year;
  }

  public void setcarYear(int year){
    this.carYear = carYear;
  }
  public void setcarModel(String model){
    this.carModel = carModel;
  }
  public String getcarModel(){
    return this.carModel ;
  }
  public int getcarYear(){
  return this.carYear ;
}

  // methods


  public static void main(String[] args) {
    JavaQuest19 myCar = new JavaQuest19(2020, "ModelY");
    System.out.println(myCar.getcarModel()+","+myCar.getcarYear());
  }
}