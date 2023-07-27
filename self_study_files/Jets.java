public class Jets {
  private int bombCapacity;
  private double speed;
  private String country;
  private char power_index;
  private String combatability;
  private int quantity;
  private String cost;
  private double enemy_takedown_quant;
  private String model;

  //default empty constructor
  public Jets(){
  }

  //creating all arguement jets object reference for array list
  public Jets(String model, String country, String cost, double enemy_takedown_quant, String combatability){
    this.model = model;
    this.cost = cost;
    this.enemy_takedown_quant = enemy_takedown_quant;
    this.combatability = combatability;
    this.country = country;
  }

  //Fighter jets quantity and cost
  //For using in Array List
  public String getModel(){
    return this.model;
  }
  public int getQuantity(){
    return this.quantity;
  }
  public String getCost(){
    return this.cost;
  }
  public double getEnemy_takedown_quant(){
    return this.enemy_takedown_quant;
  }
  public String getCombatability(){
    return this.combatability;
  }

  //list of general get-set methods
public void setBombCapacity(int bombs){
  this.bombCapacity = bombs;
}
public void setSpeed(double Speed){
  this.speed = Speed;
}
public void setCountry(String Country){
  this.country= Country;
}
public void setPower_Index(char power_Index){
  this.power_index = power_Index;
}
public int getBombCapacity(){
  return this.bombCapacity;
}
public double getSpeed(){
  return this.speed;
}
public char getPowerIndex(){
  return this.power_index;
}
public String getCountry(){
  return this.country;
}



}
