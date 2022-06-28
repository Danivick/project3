package Localization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeExample {
    public static void main(String[] args) {
        DateFormat dateFormat = DateFormat.
                getTimeInstance(DateFormat.LONG, new Locale("de","DE"));

        String time = dateFormat.format(new Date());
        System.out.println(time);
    }
}
