package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1Text;
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1Text = findViewById(R.id.number1);
        number2Text = findViewById(R.id.number2);
        resultText = findViewById(R.id.result);


    }
    public void sum(View view) {
        int number1 = Integer.parseInt(number1Text.getText().toString());
        int number2 = Integer.parseInt(number2Text.getText().toString());
        int result  =number1 + number2;

        resultText.setText("Result: " + result);

    }
    public void deduct(View view) {
        int number1 = Integer.parseInt(number1Text.getText().toString());
        int number2 = Integer.parseInt(number2Text.getText().toString());
        int result  =number1 - number2;

        resultText.setText("Result: " + result);

    }
    public void multiply(View view) {
        int number1 = Integer.parseInt(number1Text.getText().toString());
        int number2 = Integer.parseInt(number2Text.getText().toString());
        int result  =number1 * number2;

        resultText.setText("Result: " + result);

    }
    public void divide(View view) {
        int number1 = Integer.parseInt(number1Text.getText().toString());
        int number2 = Integer.parseInt(number2Text.getText().toString());
        int result  =number1 / number2;

        resultText.setText("Result: " + result);


    }
}