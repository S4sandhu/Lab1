package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lab1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding variableBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        variableBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(variableBinding.getRoot());
        setContentView(R.layout.activity_main);
        EditText myedit=findViewById(R.id.myedittext);
        Button mybutton=findViewById(R.id.mybutton);
        TextView mytext= findViewById(R.id.textView);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTextContent = myedit.getText().toString();
                mytext.setText("Your Name Is: " + editTextContent);
            }
        });
    }
}