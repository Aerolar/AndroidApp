package com.example.mytext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OddEvenActivity extends AppCompatActivity {

    private Button btnCheckOddEven;
    private EditText etCheckOddEven;
    private TextView tvCheckOddEven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odd_even);
        btnCheckOddEven=findViewById(R.id.btnCheckOddEven);
        tvCheckOddEven=findViewById(R.id.tvCheckOddEven);
        etCheckOddEven=findViewById(R.id.etCheckOddEven);

        btnCheckOddEven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etCheckOddEven.getText())){
                    etCheckOddEven.setError("Enter a value");
                    etCheckOddEven.requestFocus();
                    return;
                }
                int num;
                String result;

                num=Integer.parseInt(etCheckOddEven.getText().toString());

                if(num%2==0){
                    result="The number is even";
                }else{
                    result="The number is odd";
                }

                tvCheckOddEven.setText(result+"");

            }
        });
    }
}
