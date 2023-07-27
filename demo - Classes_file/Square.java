public class Square {
  private static Double lengths = 3.0;
  private Edge[] edges;

  public Square(double length){
    this.edges = new Edge[4];
    this.edges[0] = new Edge(lengths, "Red");
    this.edges[1] = new Edge(lengths, "Yellow");
    this.edges[2] = new Edge(lengths, "Black");
    this.edges[3] = new Edge(lengths, "Green");
  }

    public Edge[] getEdges(){
      return this.edges;
    }

public static void main(String[] args) {
  Square square = new Square(5);
  Square square1 = new Square(4);
 

  // s1 --> edges[0] --> Yellow
  square.getEdges()[0].setColor("yellow");

  System.out.println(square.getEdges()[0].getColor());


}




}
