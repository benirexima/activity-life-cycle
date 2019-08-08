package com.example.learning;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnotherActivity extends MainActivity {
    TextView receive;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.anotherlayout);


        receive = (TextView)findViewById(R.id.textView1);

        receive.setText(getIntent().getStringExtra("EdiTtEXTvALUE"));

    }
}


