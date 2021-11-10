package com.example.weatherapp.contactListing;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weatherapp.R;
import com.example.weatherapp.database.AppDatabase;
import com.example.weatherapp.database.User;

import java.util.List;

public class ContactListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);
        RecyclerView rvContact = findViewById(R.id.rvContact);
        List<User> users = AppDatabase.getDB(this).userDao().getAll();

        ContactAdapter contactAdapter = new ContactAdapter();
        contactAdapter.setContacts(users);

        rvContact.setAdapter(contactAdapter);
    }
}