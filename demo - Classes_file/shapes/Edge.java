package shapes;
public class Edge {
private double length;
private String color;
private int edge_id;
public static int count;


public Edge(int edge_id, double length, String color){
  this.edge_id = counter();
  this.length = length;
  this.color = color;
  
}
public void setColor(String color){
  this.color = color;
}
  public String getColor(){
    return this.color;
  }

public void setLength(double length){
  this.length = length;
}

public int getEdgeId() {

  return this.edge_id;
}

public static int counter(){
  return count++;
}

// public void resetId(){
//   this.edge_id = 0;
// }

}
