import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Practice15_1Step {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(2026, 6, 15, 9, 30, 0);

		System.out.println(dt.format(
				DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		System.out.println(dt.format(
				DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分")));
	}
}