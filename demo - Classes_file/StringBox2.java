import java.util.Arrays;

public class StringBox2 {
  char[] string;

  public StringBox2(){

  }
  public StringBox2(char[] sources){
    this.string = new char[sources.length];

    //approach1
    // for (int i=0; i<sources.length; i++){
    //   string[i] = sources [i];
    // }
    //approach2
      this.string = Arrays.copyOf(sources, sources.length); //it creates a new object
  }

    public StringBox2 append(String s){
      //string --> toCharArray()
      char[] res = new char[this.string.length + s.length()];
      int idx =0;
      int j = 0;
      while(j < this.string.length){
        res[idx] = this.string[j];
        idx++;
        j++;
      }
      j=0;
      while(j < s.length()){
        res[idx] = s.charAt(j);
        idx++;
        j++;
      }
      this.string = res;
     return this;
    }





  public String toString(){
    return Arrays.toString(this.string);
  }

  public static void main(String[] args) {
    char[] chars = new char[] {'a', 'b', 'c'};
    StringBox2 box2 = new StringBox2(chars);

    chars[1] = 'x';
    System.out.println(box2.toString());
    System.out.println(Arrays.toString(chars));

   System.out.println(box2.append("easqwe").toString());



  }

}
