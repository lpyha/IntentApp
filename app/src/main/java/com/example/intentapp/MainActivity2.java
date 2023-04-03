package com.example.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button2 = (Button) findViewById(R.id.button2);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        Intent intent = getIntent();
        String textData = intent.getStringExtra("textData");
        editText2.setText(textData);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplication(), MainActivity.class);
                String textData2 = editText2.getText().toString();
                intent2.putExtra("textData2", textData2);
                startActivity(intent2);
            }
        });

    }
}