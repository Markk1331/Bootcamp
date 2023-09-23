public class FindWealthies{
  public static void main(String[] args) {
    int sum = 0;
    int max = 0;

  int[][] accounts = {
    {2,8,7},
    {7,1,3},
    {1,9,5}
};

for(int i=0;i<accounts.length;i++){
  for(int j=0;j<accounts[0].length; j++){
    sum+= accounts[i][j];
  }
  
  max = Math.max(sum,max);
  sum = 0;
}
System.out.println(max);
}
}