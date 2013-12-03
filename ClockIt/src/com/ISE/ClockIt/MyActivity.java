package com.ISE.ClockIt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
        startActivity(dummyIntent);
    }
}
