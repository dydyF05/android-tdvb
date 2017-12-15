package com.example.dylanfoster.tdvb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.User;

public class SimpleAdapterActivity extends AppCompatActivity {
    private static final String EMAIL_KEY = "email";
    private static final String FIRSTNAME_KEY = "firstname";
    private static final String LASTNAME_KEY = "lastname";
    private ListView listView;
    List<User> users = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter);

        this.users = User.generateRandomUsers(10);

        this.listView = (ListView) findViewById(R.id.simple_adapter_list_view);

        SimpleAdapter adapter = new SimpleAdapter(this, convertUsers(users), android.R.layout.simple_list_item_2, new String[] {FIRSTNAME_KEY, EMAIL_KEY}, new int[] { android.R.id.text1, android.R.id.text2});
        this.listView.setAdapter(adapter);
    }

    private List<Map<String, String>> convertUsers(List<User> users) {
        List<Map<String, String>> list = new ArrayList<>();
        for (User u : users) {
            list.add(convertUserToMap(u));
        }
        return list;
    }

    private Map<String, String> convertUserToMap(User user) {
        Map<String, String> map = new HashMap<>();
        map.put(FIRSTNAME_KEY, user.getFirstname());
        map.put(LASTNAME_KEY, user.getName());
        map.put(EMAIL_KEY, user.getEmail());
        return map;
    }
}
