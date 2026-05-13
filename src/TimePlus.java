import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TimePlus {
	public static void main(String[] args) {
		var d = LocalDate.of(2024, 1, 10);
		
		System.out.println("基準日:" + d);
		System.out.println("3年後:" + d.plus(3, ChronoUnit.YEARS));
		System.out.println("21日前" + d.minus(21, ChronoUnit.DAYS));
		System.out.println("基準日は変わらない:" + d);
	}
}
