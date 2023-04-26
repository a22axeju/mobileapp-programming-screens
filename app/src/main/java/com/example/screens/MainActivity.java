package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void startSecondActivity(View view) {
        EditText nameEditText = findViewById(R.id.name_edittext);
        String name = nameEditText.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
