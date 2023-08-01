public class Countingwords {
  public static void main(String[] args) {
    String[] words = new String[]{"pay","attention","practice","attend"};
    String pref = "at";
    int count = 0;

    for(String s: words){
      if(s.contains(pref) && s.startsWith(pref)){
        count +=1;
      }
    }

    System.out.println(count);
  }
}
