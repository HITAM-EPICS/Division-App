package com.android.paritosh.debugdivision;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText num1EditText;
    private EditText num2EditText;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1EditText = findViewById(R.id.num1);
        num2EditText = findViewById(R.id.num2);

        resultView = findViewById(R.id.ans);


    }

    public void divide(View v) {

        String s1 = num1EditText.getText().toString();
        String s2 = num2EditText.getText().toString();

        int x = Integer.parseInt(s1);
        int y = Integer.parseInt(s2);


        if ((s1.equals(null) || s1.equals("")) || (s2.equals(null) || s2.equals(""))) {

            int z = x / y;
            resultView.setText("Division: " + z);
        } else {
            Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
        }

    }


    public void resetNum(View view) {

        resultView.setText(" ");
        num1EditText.setText(" ");
        num2EditText.setText(" ");

    }
}
