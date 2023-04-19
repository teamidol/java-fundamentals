
import java.time.LocalDateTime;

public class CommandLineClock {
  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    int hour = now.getHour();
    int minute = now.getMinute();
    int seconds = now.getSecond();

    while (true) {
      now = LocalDateTime.now();
      int seconds2 = now.getSecond();

      if (seconds2 != seconds) {
        System.out.println(hour+":"+minute+":"+seconds);
        seconds = seconds2;
      }
    }
  }
}
