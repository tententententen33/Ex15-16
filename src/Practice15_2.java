import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Practice15_2 {
	public static void main(String[] args) {
		ZonedDateTime tokyo = ZonedDateTime.of(
				LocalDateTime.of(2026, 5, 1, 17, 0, 0),
				ZoneId.of("Asia/Tokyo"));

		DateTimeFormatter jp = DateTimeFormatter
				.ofLocalizedDateTime(FormatStyle.FULL)
				.withLocale(Locale.JAPAN);
		DateTimeFormatter us = DateTimeFormatter
				.ofLocalizedDateTime(FormatStyle.FULL)
				.withLocale(Locale.US);

		System.out.println(tokyo.format(jp));
		System.out.println(tokyo.format(us));
	}
}