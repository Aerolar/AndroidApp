package com.example.mytext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AutomorphicActivity extends AppCompatActivity {

    private Button btnCheckAutomorphic;
    private TextView tvCheckAutomorphic;
    private EditText etCheckAutomorphic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automorphic);

        btnCheckAutomorphic=findViewById(R.id.btnCheckAutomorphic);
        tvCheckAutomorphic=findViewById(R.id.tvCheckAutomorphic);
        etCheckAutomorphic=findViewById(R.id.etCheckAutomorphic);

        btnCheckAutomorphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etCheckAutomorphic.getText())){
                    etCheckAutomorphic.setError("Enter a number");
                    etCheckAutomorphic.requestFocus();
                    return;
                }
                int n = Integer.parseInt(etCheckAutomorphic.getText().toString());
                int sq = n*n;

                String num = Integer.toString(n);
                String square = Integer.toString(sq);
                String result;

                if(square.endsWith(num)){
                    result="It is an automorphic number";

                }else{
                     result="It is not an automorphic number";
                }

                tvCheckAutomorphic.setText(result);

            }
        });
    }
}
