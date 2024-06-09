import java.time.LocalDateTime;

public class StringConcat {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        String text = makeText(date.getHour(), date.getMinute());
        System.out.println(text);
    }

    private static String makeText(int hour, int minute) {
        return "ただいまの時刻は" + hour + "時" + minute + "分です。";
    }
}
