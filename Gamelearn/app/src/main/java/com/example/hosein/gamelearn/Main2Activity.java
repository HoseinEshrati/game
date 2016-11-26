package com.example.hosein.gamelearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.logging.Level;

public class Main2Activity extends AppCompatActivity {
    TextView textuser, txthelo;
Button level11,level22,level33;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textuser = (TextView) findViewById(R.id.textusername);
        txthelo = (TextView) findViewById(R.id.textsethello);
        Intent intentnew = getIntent();
        String sp11 = intentnew.getStringExtra("h");
        textuser.setText(sp11);
level11= (Button) findViewById(R.id.l1);
        level22= (Button) findViewById(R.id.l2);
        level33= (Button) findViewById(R.id.l3);

        level11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Main2Activity.this, Level1.class);
                startActivity(i1);
            }
        });


        level22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Main2Activity.this, Level2.class);
                startActivity(i2);
            }
        });


        level33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(Main2Activity.this, Level3.class);
                startActivity(i3);
            }
        });
    }
}
