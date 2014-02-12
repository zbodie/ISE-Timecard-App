package com.ISE.ClockIt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.util.Log;

public class LoginActivity extends Activity {

    private final static String TAG = "TimeCard_Login";

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        final Button signIn = (Button) findViewById(R.id.buttonSignIn);
        signIn.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v)
            {
                Log.i(TAG, "OnClick event happened.");
                // Create an intent stating which Activity you would like to start
                startDayViewActivity();
            }
        });

    }

    @Override
    public void onStart() {
        super.onStart();

        Log.i(TAG, "Entered the onStart() method");
    }

    @Override
    public void onResume() {
        super.onResume();

        Log.i(TAG, "Entered the onResume() method");
    }

    @Override
    public void onPause() {
        super.onPause();

        Log.i(TAG, "Entered the onPause() method");
    }

    @Override
    public void onStop() {
        super.onStop();

        Log.i(TAG, "Entered the onStop() method");

    }

    @Override
    public void onRestart() {
        super.onRestart();

        Log.i(TAG, "Entered the onRestart() method");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Entered the onDestroy() method");

    }
    public void startDayViewActivity(){
        Log.i(TAG, "Entered startDayViewActivity method");
        Intent dayViewIntent = new Intent(LoginActivity.this, HomeActivity.class);

        final EditText usernameBox = (EditText) findViewById(R.id.usernameText);
        final EditText passwordBox = (EditText) findViewById(R.id.passwordText);
        dayViewIntent.putExtra("username", usernameBox.getText().toString());
        dayViewIntent.putExtra("password", passwordBox.getText().toString());
        startActivity(dayViewIntent);
    }
}
