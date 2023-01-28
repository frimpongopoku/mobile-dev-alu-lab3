package com.example.areacalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText lengthTextBox, breadthTextBox;
    TextView answerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerView = findViewById(R.id.answer);
        lengthTextBox= findViewById(R.id.length);
        breadthTextBox= findViewById(R.id.breadth);
    }

    public void calculate(View v){
        float length = Float.valueOf(lengthTextBox.getText().toString());
        float breadth = Float.valueOf(breadthTextBox.getText().toString());
        AreaClass areaHandler = new AreaClass(length, breadth);
        answerView.setText("Answer is: "+String.valueOf(areaHandler.calculateArea()));
    }

    public void clear(View v){
        lengthTextBox.setText("");
        breadthTextBox.setText("");
        answerView.setText("...");
    }

}