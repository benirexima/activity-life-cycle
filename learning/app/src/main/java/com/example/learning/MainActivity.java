package com.example.learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btn);
        ed1=(EditText) findViewById(R.id.text);
        button.setOnClickListener(this);
    }
    public void onClick (View v){

        Intent intent=new Intent(this,AnotherActivity.class);
        intent.putExtra("EdiTtEXTvALUE", ed1.getText().toString());
        startActivity(intent);

    }



}

