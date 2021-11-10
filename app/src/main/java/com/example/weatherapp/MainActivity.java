package com.example.weatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.weatherapp.contactListing.ContactListActivity;
import com.example.weatherapp.database.AppDatabase;
import com.example.weatherapp.database.User;
import com.example.weatherapp.database.UserDao;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.etName);
        CheckBox isOnline = findViewById(R.id.isOnline);

        Button view = findViewById(R.id.button);

        UserDao dao = AppDatabase.getDB(this).userDao();

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User();
                user.name = name.getText().toString();
                user.isOnline = isOnline.isChecked();
                dao.insertAll(user);
                Intent intent = new Intent(MainActivity.this, ContactListActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btnCheck).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ContactListActivity.class);
                startActivity(intent);
            }
        });
    }
}