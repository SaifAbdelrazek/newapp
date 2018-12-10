package com.example.saif.newapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView _myText;
    private Button _button;
    private Button _button2;
    String t="My_1st_toast";
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        _myText =(TextView) findViewById(R.id.tv1);
        _myText.setText(count+"");
        _button =(Button) findViewById(R.id.button1);
        _button2=(Button) findViewById(R.id.button2);
        _button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
              Toast.makeText(MainActivity.this, t,
                 Toast.LENGTH_LONG).show();

            }
        });
        _button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                _myText.setText(count+"");
            }
        });
    }
}
