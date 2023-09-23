class Balll implements Comparable<Balll> {
    int id;
    Colorr color;

    public Balll(int id, Colorr color) {
        this.id = id;
        this.color = color;
    }

    @Override
    public int compareTo(Balll ball) {
        return Integer.compare(this.id, ball.id);
    }

    @Override
    public String toString() {
        return "[" + this.id +" " +  this.color + "]";
    }
}