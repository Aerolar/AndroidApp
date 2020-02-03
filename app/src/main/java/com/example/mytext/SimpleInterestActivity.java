package com.example.mytext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SimpleInterestActivity extends AppCompatActivity {

    private Button btnInterest;
    private EditText etPrinciple, etRate, etTime;
    private TextView tvInterest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_interest);

        btnInterest=findViewById(R.id.btnInterest);
        etPrinciple=findViewById(R.id.etPrinciple);
        etRate=findViewById(R.id.etRate);
        etTime=findViewById(R.id.etTime);
        tvInterest=findViewById(R.id.tvInterest);

        btnInterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etPrinciple.getText())){
                    etPrinciple.setError("Enter principle");
                    etPrinciple.requestFocus();
                    return;
                }else if(TextUtils.isEmpty(etRate.getText())){
                    etRate.setError("Enter rate");
                    etRate.requestFocus();
                    return;
                }else if(TextUtils.isEmpty(etTime.getText())){
                    etTime.setError("Enter time period");
                    etTime.requestFocus();
                    return;
                }
                float result;
                int time,rate,principle;
                time=Integer.parseInt(etTime.getText().toString());
                rate=Integer.parseInt(etRate.getText().toString());
                principle=Integer.parseInt(etPrinciple.getText().toString());

                result=(time*rate*principle)/100;

                tvInterest.setText(result+"");

                Toast.makeText(SimpleInterestActivity.this, "Simple Interest is Rs."+result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
