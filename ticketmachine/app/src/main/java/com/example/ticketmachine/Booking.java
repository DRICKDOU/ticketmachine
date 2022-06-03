package com.example.ticketmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class Booking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        Button button2 = findViewById(R.id.button2);

        button2.setOnClickListener(v -> {
            startActivity(new Intent(Booking.this, MainActivity.class));
            Toast.makeText(Booking.this, "Booking Successful", Toast.LENGTH_SHORT).show();
        });


    }
}