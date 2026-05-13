import java.time.LocalDate;

public class ImmutableCheck {
	public static void main(String[] args) {
		LocalDate base = LocalDate.of(2026, 5, 1);
		base.plusDays(7);
		
		System.out.println("base = " + base);
		
		LocalDate next = base.plusDays(7);
		System.out.println("next = " + next);
	}
}
