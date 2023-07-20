public class Array2 {



  public static String swap(String str, int idx1, int idx2){

    if(str == null){
      return str;
    }

    if(str.isBlank()){
      return str;
    }

    if(idx1<0 || idx1>= str.length()) {
      return str;
    }

    if(idx2<0 || idx2>= str.length()) {
      return str;
    }


    char[] order = str.toCharArray();
    char temp = order[idx1];
    order[idx1] = order[idx2];
    order[idx2] = temp;
    return String.valueOf(order);
  }

    public static void main(String[] args){
    System.out.println(swap("abcdefg", 1,3));
  }
}
