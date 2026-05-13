import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class TimeBetweenIntro {
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2026, 4, 1, 9, 0, 0);
		LocalDateTime end = LocalDateTime.of(2026, 5, 10, 10, 30, 0);
		
		Period p = Period.between(start.toLocalDate(), end.toLocalDate());
		Duration d = Duration.between(start, end);
		
		System.out.println("日付の差:" + p.getYears() + "年" + p.getMonths() + "ヶ月" + p.getDays() + "日");
		System.out.println("時間の差:" + d.toHours() + "時間");
		System.out.println("分の差:" + d.toMinutes() + "分");
	}
}
