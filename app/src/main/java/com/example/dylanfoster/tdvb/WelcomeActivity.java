package com.example.dylanfoster.tdvb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import bean.User;

public class WelcomeActivity extends AppCompatActivity {
    private User[] _users = new User[]{};
    public static final String MSG_TO_YOU_RUDY = "STOP YOUR MESSING AROUND";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void btnHandler(View view) {
        final EditText name = (EditText) view.findViewById(R.id.name_input);
        final EditText firstname = (EditText) view.findViewById(R.id.firstname_input);
        final EditText email = (EditText) view.findViewById(R.id.email_input);

        final String n = (String) name.getText().toString();
        final String f = (String) firstname.getText().toString();
        final String e = (String) email.getText().toString();

        final User user = new User();
        user.setEmail(e);
        user.setName(n);
        user.setFirstname(f);
        _users[_users.length] = user;

        Log.d("exercice1", user.toString());
    }

    public void exercice1(View view) {
        startActivity(new Intent(this, ThirdActivity.class));
    }

    public void gotoSimpleAdapter(View view) {
        startActivity(new Intent(this, SimpleAdapterActivity.class));
    }
}
