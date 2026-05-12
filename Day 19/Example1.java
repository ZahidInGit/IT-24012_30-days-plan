import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exampl1{
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String formatted = now.format(format);

        System.out.println(formatted);
    }
}
