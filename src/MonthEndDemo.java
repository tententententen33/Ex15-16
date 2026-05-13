import java.time.LocalDate;

public class MonthEndDemo {
	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2024, 1, 31);

		LocalDate d2 = d1.plusMonths(1);

		System.out.println("基準日: " + d1);
		System.out.println("1 か月後: " + d2);
	}
}