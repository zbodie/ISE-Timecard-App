package com.ISE.ClockIt;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created with IntelliJ IDEA.
 * User: ISE Developer
 * Date: 12/3/13
 * Time: 5:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class DummyActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dummy);
        String username = getIntent().getExtras().getString("username");
        String password = getIntent().getExtras().getString("password");
        final TextView userText = (TextView) findViewById(R.id.textView);
        final TextView passText = (TextView) findViewById(R.id.textView2);
        userText.setText(username);
        passText.setText(password);
    }
}