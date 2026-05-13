import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Practice15_1 {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(2026, 5, 1, 17, 0, 0);

		System.out.println(dt.format(
				DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
		System.out.println(dt.format(
				DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
		System.out.println(dt.format(
				DateTimeFormatter.ofPattern("yyyy 年 MM 月 dd 日 HH 時 mm 分")));
	}
}