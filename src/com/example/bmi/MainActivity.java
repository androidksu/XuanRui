package com.example.bmi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
      EditText editText1,editText2;
      Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText1=(EditText) findViewById(R.id.editText1);
        EditText editText2=(EditText) findViewById(R.id.editText2);
        Button button1=(Button) findViewById(R.id.button1);
     }
     public void Calc (View view)
            double height = Double.parseDouble(editText1.getText().toString())/100;
            double weight = Double.parseDouble(editText2.getText().toString());
            double 
}
