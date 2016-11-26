package com.example.hosein.gamelearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;
import java.util.logging.Level;

public class Level1 extends AppCompatActivity {
    EditText editTextlevel;
    Button btnlevel1;
      String x;
    int key,y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        Random s = new Random();
        key = s.nextInt(100);
        editTextlevel = (EditText) findViewById(R.id.edilevel1);
        btnlevel1 = (Button) findViewById(R.id.btnlevl1);
  x = editTextlevel.getText().toString();
        btnlevel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                y = Integer.parseInt(x);

            }
        });





        }


    }

