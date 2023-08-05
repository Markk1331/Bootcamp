package factory;


public class Monitor {
  private double size;
  private double length;
  private double width;


  public Monitor(double length, double width){
    this.length = length;
    this.width = width;
  }

  public void setSize(double size){
    this.size = size;
  }
  public double getSize(){
    return this.size;
  }

 public void setLength(double length){
    this.length = length;
  }
  public double getLength(){
    return this.length;
  }

   public void setWidth(double width){
    this.width = width;
  }
  public double getWidth(){
    return this.width;
  }



}
