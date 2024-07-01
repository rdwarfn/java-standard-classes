package programmer.zaman.now.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {

        Date tanggal = new Date();
        System.out.println(tanggal);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 1997);
//        calendar.add(Calendar.YEAR, -27);
        calendar.set(Calendar.MONTH, Calendar.MAY);
        calendar.set(Calendar.DAY_OF_MONTH, 13);
        calendar.set(Calendar.HOUR_OF_DAY, 13);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        Date result = calendar.getTime();
        System.out.println(result);

    }
}
