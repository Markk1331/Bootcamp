public class Jets_stats {

  public static void main(String[] args) {
    
    Jets F35 = new Jets();
    Jets F22 = new Jets();
    Jets Su_35 = new Jets();
    Jets Typhoon = new Jets();
    Jets Mig35 = new Jets();

    F35.setBombCapacity(1800);
    F35.setCountry("USA");
    F35.setPower_Index('A');
    System.out.println("F35 comes from " + F35.getCountry());

    Typhoon.setSpeed(480.0);
    System.out.println("The speed of the Eurofighter is "+Typhoon.getSpeed() );
    Su_35.setPower_Index('B');

    Jets_base NATO = new Jets_base();
    NATO.equip_more_weapons(Su_35, 2000);
    System.out.println("After loading up more bombs, there are " + Su_35.getBombCapacity() 
    + " lbs of bombs in SU_35");


   



  }
}
