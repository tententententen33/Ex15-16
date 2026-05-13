import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
public class TimeFormatLocale {
	public static void main(String[] args) {
//		var locale = Locale.JAPAN;
//		var zone = ZoneId.of("Asia/Tokyo");
		
		var locale = Locale.US;
		var zone = ZoneId.of("America/Chicago");
		
		var dt = ZonedDateTime.of(
				LocalDateTime.of(2026, 5, 1, 17, 0, 0), zone);
		
		System.out.println(dt.format(DateTimeFormatter.ofLocalizedDateTime(
				FormatStyle.FULL).withLocale(locale)));
		System.out.println(dt.format(DateTimeFormatter.ofPattern(
				"Y年L月d日(E)a K時m分s秒(z)", locale)));
		System.out.println(Locale.getDefault());
	}
}
