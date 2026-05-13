import java.time.LocalDateTime;

public class Review14To15 {
	public static void main(String[] args) {
		LocalDateTime limit = LocalDateTime.of(2025, 5, 1, 17, 0, 0);
		LocalDateTime now = LocalDateTime.of(2026,  4, 29, 9, 30, 0);
		
		if(now.isBefore(limit)) {
			System.out.println("提出できます");
		}
		System.out.println("締切:" + limit);
	}
}
