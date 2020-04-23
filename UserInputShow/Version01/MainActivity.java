package com.example.userinputshow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn = findViewById(R.id.bShow);
        CheckBox cbOne;
        CheckBox cbTwo;
        CheckBox cbThree;
        CheckBox cbFour;
        CheckBox cbFive;

        cbOne = (CheckBox) findViewById(R.id.cbOpOne);
        cbTwo = (CheckBox) findViewById(R.id.cbOpTwo);
        cbThree = (CheckBox) findViewById(R.id.cbOpThree);
        cbFour = (CheckBox) findViewById(R.id.cbOpFour);
        cbFive = (CheckBox) findViewById(R.id.cbOpFive);

        if(cbOne.isChecked()){
            Toast.makeText(getApplicationContext(), btn.getText(), Toast.LENGTH_SHORT).show();
        }
        if(cbTwo.isChecked()){
            Toast.makeText(getApplicationContext(), btn.getText(), Toast.LENGTH_SHORT).show();
        }
        if(cbThree.isChecked()){
            Toast.makeText(getApplicationContext(), btn.getText(), Toast.LENGTH_SHORT).show();
        }
        if(cbFour.isChecked()){
            Toast.makeText(getApplicationContext(), btn.getText(), Toast.LENGTH_SHORT).show();
        }
        if(cbFive.isChecked()){
            Toast.makeText(getApplicationContext(), btn.getText(), Toast.LENGTH_SHORT).show();
        }
    }
}
