package factory;

public class Machine {
  private double weight;

  public Machine(){

  }

  public Machine (double weight){
    this. weight = weight;
  }

  public void start(){
    System.out.println("Machine Start....");

  }

  public void stop(){
    System.out.println("Machine ends");
  }

  public double getWeight(){
    return this.weight;
  }

    public void setWeight(double weight){
     this.weight = weight;
  }


  public static final String staticMethod(String x, String y){
    return x+y;
  }

  public static void stop(int code){
    Machine machine = Machine.produce(code);
    machine.stop();
  }


  public static Machine produce(int code){
  switch(code){
    case 1:
    return new Machine();
    case 2:
    return new Laptop();
  }
  return new Machine();
  }
  public static void main(String[] args) {

    int pockeyMoney = 100;
    boolean stopConditio = pockeyMoney < 0;
    if(stopConditio){
      Machine.stop(1);
    }

    Machine.produce(1);//machine
    Machine.produce(2);//laptop

    Machine machine1 = Machine.produce(1);
    machine1.stop(); //machine stops
    Machine machine2 = Machine.produce(2);
    machine2.stop(); //laptop stops
  }
}
