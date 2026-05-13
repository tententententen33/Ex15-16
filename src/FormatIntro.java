import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatIntro {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(2026, 5, 1, 17, 0, 0);
		
		System.out.println("そのまま表示:" + dt);
		System.out.println("成形表示:" + 
				dt.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日HH時mm分")));
		System.out.println("ログ向け表示:" + 
				dt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
	}
}
