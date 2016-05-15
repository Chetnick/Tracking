package main;

import static GUILook.Unos.timeLabel;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CurrentTime implements Runnable { //current time thread, timeLabel

    @Override
    public void run() {
        updateClock();
    }

    private static void updateClock() {
        while (true) {
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss    dd.MM.yyyy");
            timeLabel.setText(sdf.format(cal.getTime()));
        }
    }

}
