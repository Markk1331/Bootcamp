//package McDonalds.Orders;

public class Customer {

  String name;
  String address;


  public Customer(String name, String address) {
    this.name = name;
    this.address = address;
}

// getters and setters for private variables
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}

public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}

}
