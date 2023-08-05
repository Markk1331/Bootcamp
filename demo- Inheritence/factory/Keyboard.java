package factory;

import java.util.Objects;

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

  @Override
  public boolean equals(Object o){
    if(this ==o)
    return true;
    if(!(o instanceof Keyboard))
    return false;

    Keyboard keyboard = (Keyboard) o;
    return Objects.equals(keyboard.buttonType, this.buttonType) &&
    Objects.equals(keyboard.noOfbutton, this.noOfbutton);
  }

}
