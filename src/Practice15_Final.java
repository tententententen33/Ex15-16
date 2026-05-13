import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale; 

 

public class Practice15_Final { 
    public static void main(String[] args) { 
        LocalDateTime dt = LocalDateTime.of(2026, 5, 13, 0, 10); 

 

        String standard = dt.format(DateTimeFormatter 
                .ofLocalizedDateTime(FormatStyle.MEDIUM)); 
        String custom = dt.format(DateTimeFormatter 
                .ofPattern("yyyy年MM月dd日 aH時mm分")); 
        String custom2 = dt.format(DateTimeFormatter 
        		.ofPattern("yyyy年MM月dd日 ak時mm分")); 
        String english = dt.format(DateTimeFormatter 
                .ofLocalizedDateTime(FormatStyle.MEDIUM) 
                .withLocale(Locale.US)); 

 

        System.out.println("標準: " + standard); 
        System.out.println("自作: " + custom); 
        System.out.println("自作2: " + custom2); 
        System.out.println("英語: " + english); 
    } 
} 