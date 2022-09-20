package com.example.assignment2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void compare(View v){
        tv = findViewById(R.id.textView);
        EditText firstEmail = (EditText) findViewById(R.id.email);
        String first = (firstEmail.getText().toString());


        if (first.contains("@")){
            tv.setText("VALID");
        }else{
            tv.setText("INVALID");
        }
    }
}

