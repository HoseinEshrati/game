package com.example.hosein.gamelearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btlog;
    EditText edittextlog;
    String edit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btlog = (Button) findViewById(R.id.btlogin);
        edittextlog = (EditText) findViewById(R.id.edittextlogin);
        btlog.setOnClickListener(new View.OnClickListener()


        {

            @Override
            public void onClick(View v) {

                Intent intent11 = new Intent(MainActivity.this, Main2Activity.class);
                edit1 = edittextlog.getText().toString();
                intent11.putExtra("h",edit1);
                startActivity(intent11);


            }
        });

    }
}
