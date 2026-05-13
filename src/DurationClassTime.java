import java.time.Duration;
import java.time.LocalTime;

public class DurationClassTime {
	public static void main(String[] args) {
		LocalTime start = LocalTime.of(9, 0);
		LocalTime end = LocalTime.of(10, 30);

		Duration lesson = Duration.between(start, end);
		System.out.println("授業時間: " + lesson.toMinutes() + "分");
	}
}