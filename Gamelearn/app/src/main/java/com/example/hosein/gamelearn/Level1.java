package com.example.hosein.gamelearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class Level1 extends AppCompatActivity {
    EditText editTextlevel;
    Button btnlevel1;
    String x;
    int key, y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        Random s = new Random();
        key = s.nextInt(100);
        editTextlevel = (EditText) findViewById(R.id.edilevel1);
        btnlevel1 = (Button) findViewById(R.id.btnlevl1);

        btnlevel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = editTextlevel.getText().toString();
               if (!x.equals("")){

                   y = Integer.parseInt(x);
               }


              else   if (y > key) {

                    Toast.makeText(Level1.this, "عدد بزرگتر است", Toast.LENGTH_SHORT).show();
                } else if (y < key) {


                    Toast.makeText(Level1.this, "عدد کوچیکتر است", Toast.LENGTH_LONG).show();
                } else {


                    Toast.makeText(Level1.this, "باریکلاااااااااااااااااااا", Toast.LENGTH_LONG).show();
                }
            }
        });


    }


}

