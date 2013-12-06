package com.ISE.ClockIt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final Button signIn;
        signIn = (Button)findViewById(R.id.button);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDayViewActivity();
            }
        });

    }
    public void startDayViewActivity(){
        Intent dayViewIntent = new Intent(this, DayViewActivity.class);

        final EditText usernameBox = (EditText) findViewById(R.id.usernameText);
        final EditText passwordBox = (EditText) findViewById(R.id.passwordText);
        dayViewIntent.putExtra("username", usernameBox.getText().toString());
        dayViewIntent.putExtra("password", passwordBox.getText().toString());
        startActivity(dayViewIntent);
    }
}
