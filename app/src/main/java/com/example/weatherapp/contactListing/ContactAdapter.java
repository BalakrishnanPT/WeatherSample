package com.example.weatherapp.contactListing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weatherapp.R;
import com.example.weatherapp.database.User;

import java.util.ArrayList;
import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {

    List<User> contacts = new ArrayList<>();

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();

        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.layout_contact, parent, false);

        // Return a new holder instance
        ContactViewHolder viewHolder = new ContactViewHolder(contactView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        User contact = contacts.get(position);
        holder.nameTextView.setText(contact.name);
        holder.messageButton.setText(contact.isOnline ? "Message" : "Offline");
        holder.messageButton.setEnabled(contact.isOnline);
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public void setContacts(List<User> nameList) {
        contacts = nameList;
        notifyDataSetChanged();
    }
}