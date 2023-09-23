package shapes;
import java.text.DecimalFormat;

public class Square {
  private static Double lengths = 3.0;
  private Edge[] edges;
  private int id;

  private static int currentId = 0;


  public Square(double length){
    // if(length <= 0.0){
    //   length = 1.0d;
    //   int id =0;
    // }
    int edge_id = 0;
    this.id = ++currentId;
    //this.edge_id = ++ edge_id;
    this.edges = new Edge[4]; //new an array 
    this.edges[0] = new Edge(++edge_id, lengths, "Red"); //new each object of the array
    this.edges[1] = new Edge(++edge_id, lengths, "Yellow");
    this.edges[2] = new Edge(++edge_id, lengths, "Black");
    this.edges[3] = new Edge(++edge_id, lengths, "Green");
  }

  public int getId() {
    return this.id;
  }

    public Edge[] getEdges(){
      return this.edges;
    }

    public void modify(double length){
      this.edges[0].setLength(length);
      this.edges[1].setLength(length);
      this.edges[2].setLength(length);
      this.edges[3].setLength(length);
    }

    public void modify(int edgeId, String color){
      this.getEdges()[edgeId].setColor(color);
    }




    public String getUniqueID(){
      return String.valueOf(this.getId() + "." + this.getEdges()[3].getEdgeId() ) ; 
    }

public static void main(String[] args) {
  Square square = new Square(5);
  Square10 square1 = new Square10(4);
  Square10 square2 = new Square10(6);
 
  // s1 --> edges[0] --> Yellow
  square.getEdges()[0].setColor("yellow");

  System.out.println("color is " + square.getEdges()[0].getColor());
  System.out.println("Square id is " + square.getId());
  System.out.println("Square2 id is " + square1.getId());
  System.out.println("Square edge2 id is " + square.getEdges()[2].getEdgeId());
  System.out.println("Square2 edge2 id is " +square1.getEdges()[2].getEdgeId());

  System.out.println("The square2 unique ID is "+ square2.getUniqueID());




  //lessons:
  //getEdges() has four addresses
  //square.getEdges();
}




}
