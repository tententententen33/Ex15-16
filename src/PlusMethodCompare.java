import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlusMethodCompare {
	public static void main(String[] args) {
		LocalDate base = LocalDate.of(2026, 5, 1);

		System.out.println(base.plusDays(7));
		System.out.println(base.plus(7, ChronoUnit.DAYS));

		System.out.println(base.minusMonths(1));
		System.out.println(base.minus(1, ChronoUnit.MONTHS));
	}
}