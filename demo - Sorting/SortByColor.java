import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortByColor implements Comparator<Balll> {

    @Override
    public int compare(Balll o1, Balll o2) {
        return Integer.compare(o1.color.id, o2.color.id);
    }

    public static void main(String[] args) {
        ArrayList<Balll> balls = new ArrayList<>();
        balls.add(new Balll(4, Colorr.BLUE));
        balls.add(new Balll(83, Colorr.YELLOW));
        balls.add(new Balll(-4, Colorr.GREEN));
        balls.add(new Balll(5, Colorr.BLUE));
        balls.add(new Balll(2, Colorr.YELLOW));
        balls.add(new Balll(-100, Colorr.BLUE));

        Collections.sort(balls, new SortByColor());

        for (Balll ball : balls) {
            System.out.println(ball);
        }
    }
}