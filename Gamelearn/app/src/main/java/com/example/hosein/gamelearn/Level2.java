package com.example.hosein.gamelearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class Level2 extends AppCompatActivity {
    EditText editTextlevel;
    Button btnlevel1;
    String x;
    int key, y, count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);

        Random s = new Random();
        key = s.nextInt(100);
        editTextlevel = (EditText) findViewById(R.id.editlevel2);
        btnlevel1 = (Button) findViewById(R.id.btnlevel2);

        btnlevel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                x = editTextlevel.getText().toString();
               if (!x.equals("")){
                   y = Integer.parseInt(x);

               }


             else    if (count>=5){

                    Toast.makeText(Level2.this, "شما نمی توانید بیشتر از 5 بار حدس بزنید", Toast.LENGTH_LONG).show();
                }
                else if (y > key) {

                    Toast.makeText(Level2.this, "عدد بزرگتر است", Toast.LENGTH_LONG).show();
                } else if (y < key) {


                    Toast.makeText(Level2.this, "عدد کوچیکتر است", Toast.LENGTH_LONG).show();
                } else {


                    Toast.makeText(Level2.this, "باریکلاااااااااااااااااااا", Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}
