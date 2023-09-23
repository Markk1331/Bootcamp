public class ConsistentStrings {
  public static void main(String[] args) {
    
    String allowed = "abc";
   String[] words = new String[] {"a","b","c","ab","ac","bc","abc"};
        int totalCount = 0;
        for(int i=0; i<words.length; i++){
            int count = 0;
            for(int j=0; j<words[i].length(); j++){
                char c = words[i].charAt(j);
                if(allowed.contains(String.valueOf(c)))
                  count += 1;
                  System.out.println(c);
            }

           if(count == words[i].length())
                  totalCount ++;
        }
        System.out.println(totalCount);
    }
}
