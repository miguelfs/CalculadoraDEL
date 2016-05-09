package com.ufrj.calculadoradel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button mPlusButton;
    EditText mFirstNumberEditText, mSecondNumberEditText;
    TextView mResultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirstNumberEditText = (EditText) findViewById(R.id.number1EditText);
        mSecondNumberEditText = (EditText) findViewById(R.id.number2EditText);
        mPlusButton = (Button) findViewById(R.id.buttonPlus);
        mResultTextView = (TextView) findViewById(R.id.resultTextView);

        mPlusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (!mFirstNumberEditText.getText().toString().equals("") &&
                       !mSecondNumberEditText.getText().toString().equals(""))
               {
                   Double numberOne = Double.parseDouble(mFirstNumberEditText.getText().toString());
                   Double numberTwo = Double.parseDouble(mSecondNumberEditText.getText().toString());
                   Double result = numberOne + numberTwo;
                   mResultTextView.setText(result + "");
                   Toast.makeText(getApplicationContext(),numberOne + "", Toast.LENGTH_LONG).show();
               }
                else
               {
                   Toast.makeText(getApplicationContext(),"Insira os operandos.",Toast.LENGTH_LONG).show();
               }
            }
        });

    }
}
