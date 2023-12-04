package com.example.sy_b1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class UserProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        String uname = getIntent().getStringExtra("UNAME").toString();
        TextView txtMessage = findViewById(R.id.txtMessage);

        txtMessage.setText(" Welcome,\n" + uname);

    }
}