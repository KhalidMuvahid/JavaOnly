import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dateFormat.format(date));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy H:mm");
        System.out.println(simpleDateFormat.format(calendar.getTime()));
        calendar.add(Calendar.YEAR,1);
        calendar.add(Calendar.HOUR,4);
        System.out.println(simpleDateFormat.format(calendar.getTime()));
    }
}
