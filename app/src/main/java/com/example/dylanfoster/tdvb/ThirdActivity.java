package com.example.dylanfoster.tdvb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import bean.User;

public class ThirdActivity extends AppCompatActivity {
    List<User> users = new ArrayList<>();
    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        User user = new User();
        this.users = User.generateRandomUsers(10);


        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        adapter.addAll(users);
        listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ArrayAdapter<String> arrayAdapter = (ArrayAdapter<String>) parent.getAdapter();
                String data = arrayAdapter.getItem(position);
                Toast.makeText(ThirdActivity.this, data, Toast.LENGTH_SHORT).show();
                arrayAdapter.remove(data);
            }
        });
    }
}
