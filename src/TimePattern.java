import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimePattern {
	public static void main(String[] args) {
		var dt1 = LocalDateTime.of(2024, 1, 1, 10, 20, 30);
		var dt2 = ZonedDateTime.of(2024, 1, 1, 10, 20, 30, 0, ZoneId.of("Asia/Tokyo"));
		
		System.out.println(dt1.format(
				DateTimeFormatter.ofPattern("y.MM.dd.H:m:s")));
		System.out.println(dt2.format(
				DateTimeFormatter.ofPattern("Y年L月d日（E）a h時m分s秒（z）")));
		//h:1～12時（例：深夜12時）
		//k:0～11時（例：深夜0時）
	}
}
