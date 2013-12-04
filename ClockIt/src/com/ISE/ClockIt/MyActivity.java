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
                startDummyActivity();
            }
        });

    }
    public void startDummyActivity(){
        Intent dummyIntent = new Intent(this, DummyActivity.class);

        final EditText usernameBox = (EditText) findViewById(R.id.usernameText);
        final EditText passwordBox = (EditText) findViewById(R.id.passwordText);
        dummyIntent.putExtra("username", usernameBox.getText().toString());
        dummyIntent.putExtra("password", passwordBox.getText().toString());
        startActivity(dummyIntent);
    }
}
