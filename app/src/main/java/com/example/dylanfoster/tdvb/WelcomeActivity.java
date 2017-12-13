package com.example.dylanfoster.tdvb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class WelcomeActivity extends AppCompatActivity {
    public static final String MSG_TO_YOU_RUDY = "STOP YOUR MESSING AROUND";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void btnHandler(View view) {
        Intent intent = new Intent(this, FullscreenActivity.class);
        intent.putExtra(MSG_TO_YOU_RUDY, getString(R.string.app_welcome_msg));
        startActivity(intent);
    }
}
