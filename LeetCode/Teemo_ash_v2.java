public class Teemo_ash_v2 {
  public static void main(String[] args) {
    int[] timeSeries = new int[]{1,4,6,9};
    int duration = 3;
    int total = 0;
    for (int i = 0; i < timeSeries.length; i++) {
        int dur = timeSeries[i] + duration - 1;
        if (i == timeSeries.length - 1)
            total += duration;
        else if (timeSeries[i + 1] <= dur)
            total += (timeSeries[i + 1] - timeSeries[i]);
        else
            total += duration;

    }

    System.out.println(total);

}
}

