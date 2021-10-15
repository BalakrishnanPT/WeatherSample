package com.example.weatherapp.contactListing;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weatherapp.R;

import java.util.ArrayList;

public class ContactListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);
        RecyclerView rvContact = findViewById(R.id.rvContact);

        ContactAdapter contactAdapter = new ContactAdapter();
        contactAdapter.setContacts(Contact.createContactsList(20));

        rvContact.setAdapter(contactAdapter);
    }
}