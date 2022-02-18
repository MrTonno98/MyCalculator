package com.example.appperqueldownparaplegicodiantonio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private EditText etn2;
    private EditText etn1;
    private TextView tvRisult;
    private EditText ene1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etn1 = (EditText) findViewById(R.id.etn1);
        etn2 = (EditText) findViewById(R.id.etn2);
        ene1 = (EditText) findViewById(R.id.ene1);
        tvRisult = (TextView) findViewById(R.id.tvRisult);
    }

    public void btnSum(View view) {

        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(etn2.getText().toString());
        int sum = n1 + n2;
        tvRisult.setText(String.valueOf(sum));
    }

    public void btnSott(View view) {
        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(etn2.getText().toString());
        int sum = n1 - n2;
        tvRisult.setText(String.valueOf(sum));
    }

    public void btnMolti(View view) {
        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(etn2.getText().toString());
        int sum = n1 * n2;
        tvRisult.setText(String.valueOf(sum));
    }

    public void btnDiv(View view) {
        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(etn2.getText().toString());
        int sum = n1 / n2;
        tvRisult.setText(String.valueOf(sum));
    }

    public void btnPow(View view) {
        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(ene1.getText().toString());
        int Pow = (int) Math.pow(n1, n2);
        tvRisult.setText(String.valueOf(Pow));
    }
}