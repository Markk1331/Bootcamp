public class Address {
  public static void main(String[] args) {
    String address = "1.1.1.1";
    StringBuilder sb = new StringBuilder();
    char [] addresses = address.toCharArray();
        for(int i=0; i<address.length();i++){
          if(addresses[i] != '.')
            sb.append(addresses[i]);
          else
            sb.append("[.]");
        }
        System.out.println(sb.toString());
  }
}
