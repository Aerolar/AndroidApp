package com.example.mytext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AreaCircleActivity extends AppCompatActivity {

    private Button btnSubmit;
    private TextView tvArea;
    private EditText etRadius;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_circle);

        btnSubmit=findViewById(R.id.btnSubmit);
        tvArea=findViewById(R.id.tvArea);
        etRadius=findViewById(R.id.etRadius);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etRadius.getText())){
                    etRadius.setError("Enter a value");
                    etRadius.requestFocus();
                    return;
                }
                int radius;
                double result;
                final double Pi = 3.1415926536;
                radius= Integer.parseInt(etRadius.getText().toString());

                result=Pi*radius*radius;

                tvArea.setText(result+"");

                Toast.makeText(AreaCircleActivity.this, "Area is "+result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
