package com.example.mytext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button btnSum,btnMultiply,btnDifference,btnDivide;
    private EditText etFirst,etSecond;
    private TextView tvOutput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creating reference
        etFirst = findViewById(R.id.etFirst);
        etSecond = findViewById(R.id.etSecond);
        btnSum = findViewById(R.id.btnSum);
        btnMultiply=findViewById(R.id.btnProduct);
        btnDifference=findViewById(R.id.btnDifference);
        btnDivide=findViewById(R.id.btnDivide);
        tvOutput = findViewById(R.id.tvOutput);


        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(etFirst.getText())){
                    etFirst.setError("Enter a value");
                    etFirst.requestFocus();
                   return;
                }else if(TextUtils.isEmpty(etSecond.getText())) {
                    etSecond.setError("Enter a value");
                    etSecond.requestFocus();
                    return;
                }

                int first,second,result;
                first =Integer.parseInt(etFirst.getText().toString());
                second =Integer.parseInt(etSecond.getText().toString());

                result = first + second;

                tvOutput.setText(result+"");
                Toast.makeText(MainActivity.this, "Sum is " + result, Toast.LENGTH_SHORT).show();
            }
        });

        btnDifference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first, second,result;
                first=Integer.parseInt(etFirst.getText().toString());
                second=Integer.parseInt(etSecond.getText().toString());

                result=first - second;

                tvOutput.setText(result+"");

                Toast.makeText(MainActivity.this, "Difference is "+result, Toast.LENGTH_SHORT).show();
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first, second, result;
                first=Integer.parseInt(etFirst.getText().toString());
                second=Integer.parseInt(etSecond.getText().toString());

                result=first * second;

                tvOutput.setText(result+"");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first, second, result;
                first=Integer.parseInt(etFirst.getText().toString());
                second=Integer.parseInt(etSecond.getText().toString());

                result=first / second;

                tvOutput.setText(result+"");

            }
        });


    }
}
