package com.ajc.kotlin_revision_demos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Page2 extends AppCompatActivity {

    public TextView textView;

    public TextView text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        textView.findViewById(R.id.tv1);
        int sum = getIntent().getExtras().getInt("key");
        textView.setText(Integer.toString(sum));
    }
}