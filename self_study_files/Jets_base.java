import java.util.ArrayList;

public class Jets_base {
  String location;

public void equip_more_weapons(Jets F35, int lb){
  F35.setBombCapacity(lb);
}

public static void main(String[] args) {
  //Array List methods 
  ArrayList<Jets> general_stat = new ArrayList<>();
  general_stat.add(new Jets("F35", "USA", "180M", 2.3, "Highly Advanced"));
  general_stat.add(new Jets("J-14","China", "59M", 1.6, "Advanced"));
  general_stat.add(new Jets("Typh", "EU", "135M", 1.5, "Advanced"));


  System.out.println("Model\tCountry\tCost\tEnemy-take-down-rato\tCombatability");
  for(Jets jet:general_stat){
     System.out.printf("%s\t%s\t%s\t\t%.2f\t\t%s%n", jet.getModel(),jet.getCountry(),jet.getCost(),
      jet.getEnemy_takedown_quant(), jet.getCombatability());
  }


 
}
}

