package com.ISE.ClockIt;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.List;
import java.util.ArrayList;


/**
 * Created with IntelliJ IDEA.
 * User: ISE Developer
 * Date: 12/5/13
 * Time: 5:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class DayViewActivity extends Activity {

    private int position = 0;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final Spinner spnActivities = (Spinner) findViewById(R.id.spinner_activities);

        //List<String> list = new ArrayList<String>();
        //list.add("list 1");
        //list.add("list 2");
        //ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        //dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //spnActivities.setAdapter(dataAdapter);

        ArrayAdapter<CharSequence> dataAdapter;
        dataAdapter = ArrayAdapter.createFromResource(this, R.array.activities_array, android.R.layout.simple_spinner_item);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spnActivities.setAdapter(dataAdapter);

        AdapterView.OnItemSelectedListener oisl;
        oisl = new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id )
            {
                DayViewActivity.this.position = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                System.out.println("Do nothing");
            }
        };
        spnActivities.setOnItemSelectedListener(oisl);

        //setContentView(R.layout.dayview);
        //CalendarView calendar = (CalendarView) findViewById(R.id.calendarView);
        //calendar.setShownWeekCount(1);


    }
}