package com.acme.csci3130;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submit (View view){
        x = (EditText) findViewById(R.id.editText2);
        TextView y = (TextView) findViewById(R.id.helloText);
        y.setText(x.getText());
    }
}
