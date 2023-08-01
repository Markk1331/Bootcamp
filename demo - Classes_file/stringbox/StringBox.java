package stringbox;
import java.util.Arrays;

public class StringBox {

private String string;



  public StringBox(){
    if(string == null){
       this.string = string;
    }
  }

  public StringBox(String string){
    this.string = string;
  }

  public void setString(String string){
    this.string = string;
  }

  public String getString(){
    return this.string;
  }

  public StringBox append(String string){
    //return this.string + string;
    if (string == null || "".equals(string))
      return this;
    this.string = this.string + string;
    //return new StringBox(); //referring to the class
    return this;
  }

  public String toString(){
    return this.string;
  }

  public char[] toCharrArray() {
    char[] chars = new char[this.string.length()];
      for(int x=0; x<chars.length; x++){
        chars[x] = this.string.charAt(x);
      }
    return chars;
  }

  // Document comment
  /**
   * 
   * @param idx Range :
   * @param s The string to be inserted
   * @return object of stringBox
   */

  public StringBox insert(int idx, String s){
    if (idx<0)
      return this;
    this.string = this.string.substring(0, idx) + s + this.string.substring(idx);
    return this;
  }
  public static StringBox append(String string1, String string2){
    return new StringBox(string1 + string2);
  }

public static void main(String[] args) {
  StringBox s = new StringBox("123");
  s.setString("Java");
  System.out.println(s.append("Python"));
  s.append("JavaScript").append("HTML").toString();


  StringBox s2 = new StringBox("123");
  System.out.println(s2.insert(3,"java"));

  StringBox.append("Hello", "world");

String s3 = StringBox.append("Hello", "world").toString();
char[] result = s3.toCharArray();
System.out.println(Arrays.toString(result));


}

//null.method is wrong
}
