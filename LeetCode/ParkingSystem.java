public class ParkingSystem {
  private int big;
  private int medium;
  private int small;

  public ParkingSystem(int big, int medium, int small) {
      this.big = big;
      this.small = small;
      this.medium = medium;
  }
  
  public boolean addCar(int carType) {
    if(carType == 1 && this.big>0){
      this.big --;
      return true;
    }

    else if(carType == 2 && this.medium>0){
      this.medium --;
      return true;
    }

     else if(carType == 3 && this.small>0){
      this.small --;
      return true;
    }
      
      return false;
  }

  public static void main(String[] args) {
    ParkingSystem parkingSystem = new ParkingSystem(1, 1, 4);
    System.out.println(parkingSystem.addCar(3));
    System.out.println(parkingSystem.addCar(1));
    System.out.println(parkingSystem.addCar(1));
    System.out.println(parkingSystem.addCar(2));
  }

}
