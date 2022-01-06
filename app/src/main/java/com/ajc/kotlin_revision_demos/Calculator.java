package com.ajc.kotlin_revision_demos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//https://www.quora.com/How-can-I-sum-two-edit-text-in-activity-A-then-show-results-in-text-view-in-activity-B-by-android-studio

//https://www.tutlane.com/tutorial/android/android-edittext-with-examples
public class Calculator extends AppCompatActivity {

    public EditText editText1;
    public EditText editText2;
    public Button button;
    public TextView tex1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.findViewById(R.id.Et1);
                editText2.findViewById(R.id.Et2);
                button.findViewById(R.id.button);
                tex1.findViewById(R.id.textview1);

                int num1 = Integer.parseInt(editText1.getText().toString());
                int num2 = Integer.parseInt(editText2.getText().toString());

                int sum = num1 + num2;
                Intent foo = new Intent(Calculator.this, Page2.class);
                foo.putExtra("key", sum);
                startActivity(foo);
            }
        });
    }

//    private void add() {
//        Integer s = Integer.valueOf(editText1.getText().toString() + Integer.valueOf(editText2.getText().toString()));
//        TextView tv = (TextView) findViewById(R.id.textview1);
//        tv.setText(s.toString());
//    }

}