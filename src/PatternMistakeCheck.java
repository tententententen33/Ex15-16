import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PatternMistakeCheck {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(2026, 5, 1, 17, 8, 9);
		
		System.out.println(dt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		System.out.println(dt.format(DateTimeFormatter.ofPattern("yyyy-mm-dd HH:MM:ss")));
	}
}
