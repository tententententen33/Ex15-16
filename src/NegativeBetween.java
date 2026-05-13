import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class NegativeBetween {
	public static void main(String[] args) {
		LocalDateTime a = LocalDateTime.of(2026, 5, 10, 10, 0);
		LocalDateTime b = LocalDateTime.of(2026, 5, 1, 9, 0);
		Period p = Period.between(a.toLocalDate(), b.toLocalDate());
		Duration d = Duration.between(a, b);
		System.out.println("Period : " + p);
		System.out.println("Duration: " + d);
		System.out.println("時間差 : " + d.toHours() + "時間");
	}
}
