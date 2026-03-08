package com.example.livestreamapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button login, select, start;
    EditText link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.googleLogin);
        select = findViewById(R.id.selectPhoto);
        start = findViewById(R.id.startLive);
        link = findViewById(R.id.videoLink);

        start.setOnClickListener(v -> {
            String video = link.getText().toString();
            // Start streaming with this video link
        });
    }
}
