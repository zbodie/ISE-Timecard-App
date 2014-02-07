package com.ISE.ClockIt;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.util.Log;
import android.app.FragmentManager;
import android.app.FragmentTransaction;


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

    private final static String TAG = "TimeCard_Main";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dayview);

        FragmentManager fragmentManager = getFragmentManager();

        //DetailsFragment detailsFragment = (DetailsFragment) fragmentManager.findFragmentById(R.id.details_container);
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.frame_dayview, new DayViewFragment());
        fragmentTransaction.add(R.id.frame_project_spinner, new ProjectSpinnerFragment());
        fragmentTransaction.commit();

    }

        //setContentView(R.layout.dayview);
        //CalendarView calendar = (CalendarView) findViewById(R.id.calendarView);
        //calendar.setShownWeekCount(1);

    }
