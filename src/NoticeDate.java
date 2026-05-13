import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NoticeDate {
	public static void main(String[] args) {
		LocalDateTime event = LocalDateTime.of(2026, 6, 1, 9, 0, 0);
		Duration before = Duration.ofHours(24);
		LocalDateTime notice = event.minus(before);

		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy 年 MM 月 dd 日 HH:mm");
		System.out.println("イベント日時: " + event.format(f));
		System.out.println("通知日時 : " + notice.format(f));
	}
}