package factory;


public class Keyboard {
  String buttonType;
  int noOfbutton;

  public Keyboard(String buttonType, int noOfbutton){
    this.buttonType = buttonType;
    this.noOfbutton = noOfbutton;
  }

  public String getbutton(){
    return this.buttonType;
  }

 public int noOfbutton(){
    return this.noOfbutton;
  }

}
