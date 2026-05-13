import java.time.LocalDate;
import java.time.Period;

public class RemainingDays {
	public static void main(String[] args) {
		LocalDate today = LocalDate.of(2026, 5, 5);
		LocalDate deadline = LocalDate.of(2026, 6, 20);

		if (today.isAfter(deadline)) {
			System.out.println("期限を過ぎています");
		} else {
			Period remain = Period.between(today, deadline);
			System.out.println("締切まで: " + remain.getMonths() + "か月" + remain.getDays() + "日 ");
		}
	}
}