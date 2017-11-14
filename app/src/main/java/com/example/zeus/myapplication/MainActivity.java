package com.example.zeus.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView greeting;
    Button clickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greeting = (TextView)findViewById(R.id.tvGreeting);
        clickMe = (Button)findViewById(R.id.btnClickMe);

        clickMe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                greeting.setVisibility(view.VISIBLE);
            }
        });
    }
}
