package com.example.weatherapp.contactListing;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weatherapp.R;

public class ContactViewHolder extends RecyclerView.ViewHolder {

    public TextView nameTextView;
    public Button messageButton;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        nameTextView = (TextView) itemView.findViewById(R.id.contact_name);
        messageButton = (Button) itemView.findViewById(R.id.message_button);
    }

}
