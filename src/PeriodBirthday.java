import java.time.LocalDate;
import java.time.Period;

public class PeriodBirthday {
	public static void main(String[] args) {
		LocalDate today = LocalDate.of(2026, 5, 13);
		LocalDate birthday = LocalDate.of(2026, 12, 24);

		Period remain = Period.between(today, birthday);
		System.out.println("誕生日まで: " + remain.getMonths() + "か月" + remain.getDays() + "日");
	}
}