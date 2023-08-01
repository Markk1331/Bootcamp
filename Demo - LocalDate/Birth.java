import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class Birth {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    System.out.println(today);

    LocalDate specificDate = LocalDate.of(2023, Month.FEBRUARY, 23);
    System.out.println(specificDate);
    


    LocalDate d1 = LocalDate.parse("2023-12-30");
    System.out.println(d1.getYear());
    System.out.println(d1.getMonth());
    Month result = d1.getMonth(); // use month class to handle the get method
    System.out.println(result.getValue()); //12
    System.out.println(d1.getDayOfMonth()); //30
    System.out.println(d1.getDayOfWeek());//Sat

    System.out.println(LocalDate.parse("2023-07-28").getDayOfWeek()); //Fri
    System.out.println(LocalDate.parse("2023-07-28").getDayOfYear()); //209


    System.out.println(d1.plusMonths(1L)); //2024-03-30 
    //1L = one month in Long variable

  }
}
