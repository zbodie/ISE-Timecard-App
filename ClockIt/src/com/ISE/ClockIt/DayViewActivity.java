package com.ISE.ClockIt;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CalendarView;

/**
 * Created with IntelliJ IDEA.
 * User: ISE Developer
 * Date: 12/5/13
 * Time: 5:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class DayViewActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.dayview);
        CalendarView calendar = (CalendarView) findViewById(R.id.calendarView);
        calendar.setShownWeekCount(1);


    }
}